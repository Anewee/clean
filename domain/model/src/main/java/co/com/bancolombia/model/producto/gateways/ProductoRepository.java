package co.com.bancolombia.model.producto.gateways;

import co.com.bancolombia.model.producto.Producto;

import java.io.IOException;

public interface ProductoRepository {

    public void crearProducto();
    public Producto consultarProducto() throws IOException;
}
