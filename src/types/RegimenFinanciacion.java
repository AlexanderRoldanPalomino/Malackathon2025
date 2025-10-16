package types;

public enum RegimenFinanciacion {

    SISTEMA_NACIONAL_DE_SALUD(1, "Sistema Nacional de Salud (SNS)"),
    REGLAMENTOS_EUROPEOS_Y_CONVENIOS_BILATERALES(2, "Reglamentos europeos y convenios bilaterales"),
    MUTUALIDADES_ADMINISTRATIVAS_DE_LOS_REGIMENES_ESPECIALES_DE_LA_SEGURIDAD_SOCIAL_DE_FUNCIONARIOS(3, "Mutualidades administrativas de los regímenes especiales de la Seguridad Social de funcionarios (MUFACE, ISFAS y MUGEJU)"),
    MUTUAS_COLABORADORES_CON_LA_SEGURIDAD_SOCIAL(4, "Mutuas Colaboradoras con la Seguridad Social"),
    ACCIDENTES_DE_TRAFICO(5, "Accidentes de tráfico"),
    FINANCIACION_PRIVADA_DIRECTA(6, "Financiación privada directa (personas físicas)"),
    FINANCIACION_A_TRAVES_DE_ASEGURAMIENTO_PRIVADO(7, "Financiación a través de aseguramiento privado (compañías de seguro sanitario)"),
    ASISTENCIA_SANITARIA_TRANSFRONTERIZA(8, "Asistencia Sanitaria Transfronteriza"),
    OTROS_Y_DESCONOCIDO(9, "Otros y desconocido");

    private final int id;
    private final String s;

    RegimenFinanciacion(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static RegimenFinanciacion byId(int id) {
        return switch (id) {
            case 1 -> RegimenFinanciacion.SISTEMA_NACIONAL_DE_SALUD;
            case 2 -> RegimenFinanciacion.REGLAMENTOS_EUROPEOS_Y_CONVENIOS_BILATERALES;
            case 3 -> RegimenFinanciacion.MUTUALIDADES_ADMINISTRATIVAS_DE_LOS_REGIMENES_ESPECIALES_DE_LA_SEGURIDAD_SOCIAL_DE_FUNCIONARIOS;
            case 4 -> RegimenFinanciacion.MUTUAS_COLABORADORES_CON_LA_SEGURIDAD_SOCIAL;
            case 5 -> RegimenFinanciacion.ACCIDENTES_DE_TRAFICO;
            case 6 -> RegimenFinanciacion.FINANCIACION_PRIVADA_DIRECTA;
            case 7 -> RegimenFinanciacion.FINANCIACION_A_TRAVES_DE_ASEGURAMIENTO_PRIVADO;
            case 8 -> RegimenFinanciacion.ASISTENCIA_SANITARIA_TRANSFRONTERIZA;
            default -> RegimenFinanciacion.OTROS_Y_DESCONOCIDO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
