package co.com.bancolombia.api;
import co.com.bancolombia.api.dto.ProductoDTO;
import co.com.bancolombia.model.producto.Producto;
import co.com.bancolombia.usecase.producto.ProductoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final ProductoUseCase productoUseCase;


    @GetMapping(path = "/consultarProducto")
    public ProductoDTO ConsultarProducto() {

        var productoDto = new ProductoDTO();
        Producto prod = null;
        try {
            prod = productoUseCase.consultarProducto();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        productoDto = productoDto.builder().nombre(prod.getNombre())
                .description(prod.getDescription()).build();
        return productoDto;
    }
}
