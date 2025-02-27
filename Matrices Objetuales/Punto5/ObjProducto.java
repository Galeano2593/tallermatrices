public class ObjProducto {
    private String nombre;
    private double precio;
    private int stock;

    public ObjProducto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjProducto that = (ObjProducto) obj;
        return Double.compare(that.precio, precio) == 0 &&
               stock == that.stock &&
               nombre.equals(that.nombre);
    }
}