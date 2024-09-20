
package gestionprodu2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class ProductoManager {
    
    
    private Set<Producto> productos = new TreeSet <>(Comparator.comparingInt(Producto::getCodigo));

    public void agregarProducto(Producto producto) {
        // Validaciones y agregar producto
    }
    
    public void eliminarProducto(int codigo) {
        // Lógica para eliminar producto
    }
    
    public void modificarProducto(Producto producto) {
        // Lógica para modificar producto
    }
    
    public TreeSet<Producto> consultarPorRubro(String rubro) {
         return null;
        // Lógica de consulta
    }

    public Set<Producto> buscarPorNombre(String nombre) {
         return null;
        // Lógica para buscar productos por nombre en el conjunto productos
    }

    public Set<Producto> buscarPorPrecio(double precio) {
        return null;
         
        // Lógica para buscar productos por precio en el conjunto productos
    }
    
    public Set<Producto> validarDescripcion(String nombre) {
         return null;
        // Lógica para buscar productos por nombre en el conjunto productos
    }
    public Set<Producto> validarPrecio (double precio) {
         return null;
        // Lógica para buscar productos por nombre en el conjunto productos
    }
}
