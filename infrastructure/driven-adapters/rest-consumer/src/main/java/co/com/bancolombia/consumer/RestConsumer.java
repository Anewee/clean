package co.com.bancolombia.consumer;

import co.com.bancolombia.model.producto.Producto;
import co.com.bancolombia.model.producto.gateways.ProductoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
@RequiredArgsConstructor
public class RestConsumer implements ProductoRepository
{

    @Value("http://demo4694622.mockable.io/consultarProducto")
    private String url;
    private final OkHttpClient client;
    private final ObjectMapper mapper;


    // these methods are an example that illustrates the implementation of OKHTTP Client.
    // You should use the methods that you implement from the Gateway from the domain.

    @Override
    public void crearProducto() {

    }

    @Override
    public Producto consultarProducto() throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Content-Type","application/json")
                .build();

        return mapper.readValue(client.newCall(request).execute().body().string(), Producto.class);
    }
}
