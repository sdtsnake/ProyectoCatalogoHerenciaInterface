package work.oscarramos;


public class Iphone extends Electronico  {

    private String modelo;
    private String color;

    public Iphone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
        if(precio<=0){
            throw new RuntimeException("Precio debe ser positivo");
        }
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.25;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
