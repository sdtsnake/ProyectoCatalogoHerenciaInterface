package work.oscarramos;

import work.oscarramos.interfaces.IProducto;

abstract public class Producto implements IProducto {
    private int precio;
    @Override
    public int getPrecio() {
        return precio;
    }
    public Producto(int precio) {
        this.precio = precio;
    }
}
