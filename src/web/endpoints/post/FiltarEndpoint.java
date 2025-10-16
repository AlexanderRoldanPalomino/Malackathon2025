package web.endpoints.post;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import database.DatabaseManager;
import database.Diagnostico;
import web.WebUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FiltarEndpoint implements HttpHandler {

    private final DatabaseManager databaseManager;

    public FiltarEndpoint(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String html = WebUtils.loadResourceAsString("/web/pages/index.html");
        String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);

        HashMap<String, String> postData = getPostData(body);
        String select = postData.get("select");
        String text = postData.get("text");

        List<Diagnostico> diagnosticoList = new ArrayList<>();
        switch (select) {
            case "id" -> {
                int id = Integer.parseInt(text);
                diagnosticoList.add(databaseManager.getDiagnosticoById(id));
            }
            case "nombre" -> {
                diagnosticoList = databaseManager.getDiagnosticoLike(text);
            }
        }

        String entriesHtml = "";
        for(Diagnostico diagnostico : diagnosticoList) {
            entriesHtml += "<tr>\n";

            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getId() + "</td>";
            entriesHtml += "<td>" + diagnostico.getNombre() + "</td>";
            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getFechaDeNacimiento() + "</td>";
            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getSexo().asString() + "</td>";
            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getFechaDeIngreso() + "</td>";
            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getDiagnosticos()[0] + "</td>";
            entriesHtml += "<td style='text-align:center;'>" + diagnostico.getServicio().asString() + "</td>";

            entriesHtml += "</tr>\n";
        }

        html = html.replace("<java id=\"tableData\"></java>", entriesHtml);

        exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
        exchange.sendResponseHeaders(200, html.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(html.getBytes());
        }
    }

    private HashMap<String, String> getPostData(String body) {
        HashMap<String, String> postData = new HashMap<>();

        String[] entries = body.split("&");
        for (String entry : entries) {
            postData.put(entry.split("=")[0], entry.split("=")[1]);
        }

        return postData;
    }
}
