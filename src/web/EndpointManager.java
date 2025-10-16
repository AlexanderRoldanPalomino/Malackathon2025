package web;

import java.util.HashMap;
import com.sun.net.httpserver.HttpHandler;

public class EndpointManager {
    private final HashMap<String, HttpHandler> getEndpoints = new HashMap<>();
    private final HashMap<String, HttpHandler> postEndpoints = new HashMap<>();

    public void registerGet(String path, HttpHandler handler) {
        getEndpoints.put(path, handler);
    }

    public void registerPost(String path, HttpHandler handler) {
        postEndpoints.put(path, handler);
    }

    public HttpHandler getHandler(String method, String path) {
        if ("GET".equalsIgnoreCase(method)) {
            return getEndpoints.get(path);
        } else if ("POST".equalsIgnoreCase(method)) {
            return postEndpoints.get(path);
        }
        return null;
    }
}