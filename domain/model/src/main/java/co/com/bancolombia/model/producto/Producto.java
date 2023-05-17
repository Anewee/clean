package co.com.bancolombia.model.producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {

    private int id;
    private String nombre;
    private String description;
}
