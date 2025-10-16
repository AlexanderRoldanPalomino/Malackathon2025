import database.DatabaseManager;
import database.Diagnostico;
import web.EndpointManager;
import web.ServerManager;
import web.endpoints.get.HelloEndpoint;
import web.endpoints.post.SubmitEndpoint;

import java.io.IOException;
import java.sql.SQLException;

public class Malackathon {

    private final DatabaseManager databaseManager;
    private final EndpointManager endpointManager;
    private final ServerManager serverManager;

    public Malackathon(String walletPath) throws SQLException, IOException {
        this.databaseManager = new DatabaseManager(walletPath);
        this.endpointManager = new EndpointManager();
        this.serverManager = new ServerManager(8080, endpointManager);
    }

    public void init() throws SQLException {
        Diagnostico diagnostico = databaseManager.getDiagnosticoById(1);
        System.out.println("1: " + diagnostico.toString());

        registerGetEndpoints();
        registerPostEndpoints();

        serverManager.start();
    }

    private void registerGetEndpoints() {
        endpointManager.registerGet("/hello", new HelloEndpoint());
    }

    private void registerPostEndpoints() {
        endpointManager.registerPost("/submit", new SubmitEndpoint());
    }

    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }
}
