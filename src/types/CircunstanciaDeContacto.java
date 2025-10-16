package types;

public enum CircunstanciaDeContacto {

    NO_PROGRAMADO(1, "No programado"),
    PROGRAMADO(2, "Programado"),
    DESCONOCIDO(9, "Desconocido");

    private final int id;
    private final String s;

    CircunstanciaDeContacto(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static CircunstanciaDeContacto byId(int id) {
        return switch (id) {
            case 1 -> CircunstanciaDeContacto.NO_PROGRAMADO;
            case 2 -> CircunstanciaDeContacto.PROGRAMADO;
            default -> CircunstanciaDeContacto.DESCONOCIDO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
