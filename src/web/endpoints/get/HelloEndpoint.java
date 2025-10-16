package web.endpoints.get;

import com.sun.net.httpserver.*;
import web.WebUtils;

import java.io.IOException;
import java.io.OutputStream;

public class HelloEndpoint implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = WebUtils.loadResourceAsString("/web/pages/index.html");
        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, response.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}