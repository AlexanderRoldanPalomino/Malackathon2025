package types;

public enum IngresoEnUCI {

    SI(1, "Sí"),
    NO(2, "No");

    private final int id;
    private final String s;

    IngresoEnUCI(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static IngresoEnUCI byId(int id) {
        if (id == 1) {
            return IngresoEnUCI.SI;
        }
        return IngresoEnUCI.NO;
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
