package work.oscarramos;

import work.oscarramos.interfaces.IElectronico;
import work.oscarramos.interfaces.ILibro;
import work.oscarramos.interfaces.IProducto;

import java.time.Instant;
import java.util.Date;

public class ImplementaInterfaces {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[4];

        productos[0] = new Iphone(7500000, "Apple", "4 x MAX", "Balnco");
        productos[1] = new TvLcd(650000, "Sony", 55);
        productos[2] = new Libro(14000, Date.from(Instant.parse("2011-12-03T00:00:00Z")), "Julio Paramo", "No tengo quien me lea", "Planeta");
        productos[3] = new Comic(5000, Date.from(Instant.parse("1989-11-03T00:00:00Z")), "StandLeee", "Marivolloso mundo de espider-man", "Marvel", "Spider-man");

        for (IProducto produc : productos) {
            System.out.println("===================================================================");
            System.out.println("Valor del producto: " + produc.getPrecio() + " " + "Valor al consumidor: " + produc.getPrecioVenta());
            System.out.println("===================================================================");
            if (produc instanceof IElectronico) {
                imprimeElectronicos(produc);
            } else if (produc instanceof ILibro) {
                imprimeLibros(produc);
            }
        }
        System.out.println();
    }
    private static void imprimeLibros(IProducto produc) {
        if(produc instanceof Comic) {
            System.out.println("Comic");
            System.out.println("===============");
            System.out.println("Personaje   : " + ((Comic) produc).getPersonaje());

        }else{
            System.out.println("Libro");
            System.out.println("===============");
        }
        System.out.println("Publicacion : " + ((ILibro) produc).getFechaPublicacion());
        System.out.println("Autor       : " + ((ILibro) produc).getAutor());
        System.out.println("Titulo      : " + ((ILibro) produc).getTitulo());
        System.out.println("Editorial   : " + ((ILibro) produc).getEditorial());
    }

    private static void imprimeElectronicos(IProducto produc) {
        if(produc instanceof Iphone) {
            System.out.println("Telefono movil");
            System.out.println("===============");
            System.out.println("Modelo : " + ((Iphone) produc).getModelo());
            System.out.println("Color : " + ((Iphone) produc).getColor());
        }else{
            System.out.println("Televisor");
            System.out.println("===============");
            System.out.println("Pulgadas : " + ((TvLcd) produc).getPulgada());
        }
    }
}
