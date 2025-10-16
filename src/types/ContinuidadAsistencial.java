package types;

public enum ContinuidadAsistencial {

    NO_PRECISA(1, "No precisa"),
    INGRESO_EN_HOSPITALIZACION_EN_EL_PROPIO_HOSPITAL(2, "Ingreso en hospitalización en el propio hospital"),
    HOSPITALIZACION_A_DOMICILIO(3, "Hospitalización a domicilio"),
    HOSPITAL_DE_DIA_MEDICO(4, "Hospital de día médico"),
    URGENCIAS(5, "Urgencias"),
    CONSULTAS(6, "Consultas"),
    OTROS(8, "Otros"),
    DESCONOCIDO(9, "Desconocido");

    private final int id;
    private final String s;

    ContinuidadAsistencial(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static ContinuidadAsistencial byId(int id) {
        return switch (id) {
            case 1 -> ContinuidadAsistencial.NO_PRECISA;
            case 2 -> ContinuidadAsistencial.INGRESO_EN_HOSPITALIZACION_EN_EL_PROPIO_HOSPITAL;
            case 3 -> ContinuidadAsistencial.HOSPITALIZACION_A_DOMICILIO;
            case 4 -> ContinuidadAsistencial.HOSPITAL_DE_DIA_MEDICO;
            case 5 -> ContinuidadAsistencial.URGENCIAS;
            case 6 -> ContinuidadAsistencial.CONSULTAS;
            case 8 -> ContinuidadAsistencial.OTROS;
            default -> ContinuidadAsistencial.DESCONOCIDO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
