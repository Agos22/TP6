
package gestionprodu2;

import java.util.Objects;


public class Producto implements Comparable<Producto> {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String comestible, limpieza, perfumeria;

    public Producto(int codigo, String descripcion, double precio, int stock, String comestible, String limpieza, String perfumeria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.comestible = comestible;
        this.limpieza = limpieza;
        this.perfumeria = perfumeria;
 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getComestible() {
        return comestible;
    }

    public void setComestible(String comestible) {
        this.comestible = comestible;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public String getPerfumeria() {
        return perfumeria;
    }

    public void setPerfumeria(String perfumeria) {
        this.perfumeria = perfumeria;
    }

    @Override
    public int compareTo(Producto otro) {
        return Integer.compare(this.codigo, otro.codigo);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}

