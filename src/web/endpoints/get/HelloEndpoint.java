package web.endpoints.get;

import com.sun.net.httpserver.*;
import database.DatabaseManager;
import database.Diagnostico;
import web.WebUtils;

import java.io.IOException;
import java.io.OutputStream;

public class HelloEndpoint implements HttpHandler {

    private final DatabaseManager databaseManager;

    public HelloEndpoint(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String html = WebUtils.loadResourceAsString("/web/pages/index.html");

        Diagnostico diagnostico = databaseManager.getDiagnosticoById(1);

        html = html.replace("<java id=\"datos\"></java>", diagnostico.toString());

        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, html.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(html.getBytes());
        }
    }
}