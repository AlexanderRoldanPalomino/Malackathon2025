package types;

public enum TipoAlta {

    DOMICILIO(1, "Domicilio"),
    TRASLADO_A_OTRO_HOSPITAL(2, "Traslado a otro hospital"),
    ALTA_VOLUNTARIA(3, "Alta voluntaria"),
    EXITUS(4, "Exitus"),
    TRASLADO_A_CENTRO_SOCIOSANITARIO(5, "Traslado a centro sociosanitario"),
    OTROS(8, "Otros"),
    DESCONOCIDO(9, "Desconocido");

    private final int id;
    private final String s;

    TipoAlta(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static TipoAlta byId(int id) {
        return switch (id) {
            case 1 -> TipoAlta.DOMICILIO;
            case 2 -> TipoAlta.TRASLADO_A_OTRO_HOSPITAL;
            case 3 -> TipoAlta.ALTA_VOLUNTARIA;
            case 4 -> TipoAlta.EXITUS;
            case 5 -> TipoAlta.TRASLADO_A_CENTRO_SOCIOSANITARIO;
            case 8 -> TipoAlta.OTROS;
            default -> TipoAlta.DESCONOCIDO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
