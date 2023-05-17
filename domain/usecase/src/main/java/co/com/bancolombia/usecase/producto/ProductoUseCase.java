package co.com.bancolombia.usecase.producto;

import co.com.bancolombia.model.producto.Producto;
import co.com.bancolombia.model.producto.gateways.ProductoRepository;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class ProductoUseCase {

    public final ProductoRepository productoRepository;

    public Producto consultarProducto() throws IOException {
        return productoRepository.consultarProducto();
    }
}
