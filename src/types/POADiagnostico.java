package types;

public enum POADiagnostico {

    SI("S", "Sí: Presente en el momento del ingreso"),
    NO("N", "No: No presente en el momento del ingreso; ocurre durante la hospitalización"),
    DESCONOCIDO("D", "Insuficiente documentación para determinar si un proceso está presente o no al ingreso"),
    INDETERMINADO_CLINICAMENTE("I", "Indeterminado clínicamente: Al personal médico responsable del alta no le es posible clínicamente determinar si el proceso estaba o no presente al ingreso"),
    EXENTO_DE_ASIGNACION_DE_MARCADOR_POA("E", "Exento de asignación de marcador POA");

    private final String id;
    private final String s;

    POADiagnostico(String id, String s) {
        this.id = id;
        this.s = s;
    }

    public static POADiagnostico byId(String id) {
        return switch (id) {
            case "S" -> POADiagnostico.SI;
            case "N" -> POADiagnostico.NO;
            case "D" -> POADiagnostico.DESCONOCIDO;
            case "I" -> POADiagnostico.INDETERMINADO_CLINICAMENTE;
            default -> POADiagnostico.EXENTO_DE_ASIGNACION_DE_MARCADOR_POA;
        };
    }

    public String getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
