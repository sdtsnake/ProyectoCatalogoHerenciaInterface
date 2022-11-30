package unit.work.oscarramos;

import org.junit.jupiter.api.Test;
import work.oscarramos.Iphone;

public class IphoneTests {

    @Test
    public void creacionTest(){
        //Given
        int precio = 50000;
        String fabricante = "Apple";
        String modelo = "Iphone 14";
        String color = "Negro";

        //Ejecucion
        Iphone iphone = new Iphone(precio, fabricante, modelo, color);

        //Validacion
        assert iphone.getPrecio() == precio;
        assert iphone.getFabricante() == fabricante;
        assert iphone.getModelo() == modelo;
        assert iphone.getColor() == color;
    }

    @Test
    public void precioVentaTest(){
        //Given
        int precio = 50000;
        String fabricante = "Apple";
        String modelo = "Iphone 14";
        String color = "Negro";

        //Ejecucion
        Iphone iphone = new Iphone(precio, fabricante, modelo, color);

        //validacion
        assert iphone.getPrecioVenta() == 75000;

    }
    @Test
    public void precioVentaCeroTest(){
        //Given
        int precio = 0;
        String fabricante = "Apple";
        String modelo = "Iphone 14";
        String color = "Negro";

        //Ejecucion
        try {
            Iphone iphone = new Iphone(precio, fabricante, modelo, color);
        }catch (RuntimeException e){
            //validacion.
            assert e.getMessage() == "Precio debe ser positivo";
        }
    }


}
