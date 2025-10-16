package types;

public enum ComunidadAutonoma {

    ANDALUCIA(1, "Andalucía"),
    ARAGON(2, "Aragón"),
    ASTURIAS(3, "Asturias"),
    BALEARS(4, "Balears"),
    CANARIAS(5, "Canarias"),
    CANTABRIA(6, "Cantabria"),
    CASTILLA_Y_LEON(7, "Castilla y León"),
    CASTILLA_LA_MANCHA(8, "Castilla-La Mancha"),
    CATALUNA(9, "Cataluña"),
    COMUNIDAD_VALENCIANA(10, "Comunidad Valenciana"),
    EXTREMADURA(11, "Extremadura"),
    GALICIA(12, "Galicia"),
    MADRID(13, "Madrid"),
    MURCIA(14, "Murcia"),
    NAVARRA(15, "Navarra"),
    PAIS_VASCO(16, "Pais Vasco"),
    RIOJA(17, "Rioja"),
    CEUTA(18, "Ceuta"),
    MELILLA(19, "Melilla"),
    EXTRANJERO(0, "Extranjero"),
    DESCONOCIDA(99, "Desconocida");

    private final int id;
    private final String s;

    ComunidadAutonoma(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static ComunidadAutonoma byId(int id) {
        return switch (id) {
            case 1 -> ComunidadAutonoma.ANDALUCIA;
            case 2 -> ComunidadAutonoma.ARAGON;
            case 3 -> ComunidadAutonoma.ASTURIAS;
            case 4 -> ComunidadAutonoma.BALEARS;
            case 5 -> ComunidadAutonoma.CANARIAS;
            case 6 -> ComunidadAutonoma.CANTABRIA;
            case 7 -> ComunidadAutonoma.CASTILLA_Y_LEON;
            case 8 -> ComunidadAutonoma.CASTILLA_LA_MANCHA;
            case 9 -> ComunidadAutonoma.CATALUNA;
            case 10 -> ComunidadAutonoma.COMUNIDAD_VALENCIANA;
            case 11 -> ComunidadAutonoma.EXTREMADURA;
            case 12 -> ComunidadAutonoma.GALICIA;
            case 13 -> ComunidadAutonoma.MADRID;
            case 14 -> ComunidadAutonoma.MURCIA;
            case 15 -> ComunidadAutonoma.NAVARRA;
            case 16 -> ComunidadAutonoma.PAIS_VASCO;
            case 17 -> ComunidadAutonoma.RIOJA;
            case 18 -> ComunidadAutonoma.CEUTA;
            case 19 -> ComunidadAutonoma.MELILLA;
            case 0 -> ComunidadAutonoma.EXTRANJERO;
            default -> ComunidadAutonoma.DESCONOCIDA;
        };
    }

    public static ComunidadAutonoma byName(String name) {
        return switch (name) {
            case "ANDALUCÍA" -> ComunidadAutonoma.ANDALUCIA;
            case "ARAGÓN" -> ComunidadAutonoma.ARAGON;
            case "PRINCIPADO DE ASTURIAS" -> ComunidadAutonoma.ASTURIAS;
            case "ILLES BALEARS" -> ComunidadAutonoma.BALEARS;
            case "CANARIAS" -> ComunidadAutonoma.CANARIAS;
            case "CANTABRIA" -> ComunidadAutonoma.CANTABRIA;
            case "CASTILLA_Y_LEÓN" -> ComunidadAutonoma.CASTILLA_Y_LEON;
            case "CASTILLA-LA MANCHA" -> ComunidadAutonoma.CASTILLA_LA_MANCHA;
            case "CATALUÑA" -> ComunidadAutonoma.CATALUNA;
            case "COMUNIDAD VALENCIANA" -> ComunidadAutonoma.COMUNIDAD_VALENCIANA;
            case "EXTREMADURA" -> ComunidadAutonoma.EXTREMADURA;
            case "GALICIA" -> ComunidadAutonoma.GALICIA;
            case "COMUNIDAD DE MADRID" -> ComunidadAutonoma.MADRID;
            case "REGION DE MURCIA" -> ComunidadAutonoma.MURCIA;
            case "COMUNIDAD FORAL DE NAVARRA" -> ComunidadAutonoma.NAVARRA;
            case "PAIS VASCO" -> ComunidadAutonoma.PAIS_VASCO;
            case "LA RIOJA" -> ComunidadAutonoma.RIOJA;
            case "CEUTA" -> ComunidadAutonoma.CEUTA;
            case "MELILLA" -> ComunidadAutonoma.MELILLA;
            case "0" -> ComunidadAutonoma.EXTRANJERO;
            default -> ComunidadAutonoma.DESCONOCIDA;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
