package types;

public enum Sexo {

    HOMBRE(1, "Hombre"),
    MUJER(2, "Mujer"),
    NO_ESPECIFICADO(9, "No especificado");

    private final int id;
    private final String s;

    Sexo(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static Sexo byId(int id) {
        return switch (id) {
            case 1 -> Sexo.HOMBRE;
            case 2 -> Sexo.MUJER;
            default -> Sexo.NO_ESPECIFICADO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
