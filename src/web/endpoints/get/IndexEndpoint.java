package web.endpoints.get;

import com.sun.net.httpserver.*;
import database.DatabaseManager;
import database.Diagnostico;
import web.WebUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class IndexEndpoint implements HttpHandler {

    private final DatabaseManager databaseManager;

    public IndexEndpoint(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String html = WebUtils.loadResourceAsString("/web/pages/index.html");

        List<Diagnostico> diagnosticoList = databaseManager.getFirstNDiagnosticos(100);

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
}