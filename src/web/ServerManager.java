package web;

import com.sun.net.httpserver.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServerManager {
    private final HttpServer server;
    private final EndpointManager endpointManager;

    public ServerManager(int port, EndpointManager endpointManager) throws IOException {
        this.endpointManager = endpointManager;
        server = HttpServer.create(new InetSocketAddress(port), 0);

        // All requests are routed through this handler
        server.createContext("/", this::handleRequest);
        server.setExecutor(null); // default executor
    }

    private void handleRequest(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        String path = exchange.getRequestURI().getPath();

        HttpHandler handler = endpointManager.getHandler(method, path);

        if (handler != null) {
            handler.handle(exchange);
        } else {
            String response = "404 Not Found: " + path;
            exchange.sendResponseHeaders(404, response.length());
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }

    public void start() {
        server.start();
        System.out.println("Server started on port " + server.getAddress().getPort());
    }
}
