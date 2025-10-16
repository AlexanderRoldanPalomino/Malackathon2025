package types;

public enum Procedencia {

    ATENCION_PRIMARIA(10, "Atención Primaria"),
    URGENCIAS(21, "Servicios del propio hospital: Urgencias"),
    CIRUGIA_AMBULATORIA(22, "Servicios del propio hospital: Cirugía ambulatoria"),
    HOSPITAL_DE_DIA_MEDICO(23, "Servicios del propio hospital: Hospital de día médico"),
    HOSPITALIZACION(24, "Servicios del propio hospital: Hospitalización"),
    HOSPITALIZACION_A_DOMICILIO(25, "Servicios del propio hospital: Hospitalización a domicilio"),
    PROCEDIMIENTOS_AMBULATORIOS_DE_ESPECIAL_COMPLEJIDAD(26, "Servicios del propio hospital: Procedimientos ambulatorios de especial complejidad."),
    CONSULTAS(27, "Servicios del propio hospital: Consultas"),
    OTROS_SERVICIOS(28, "Otros servicios"),
    SERVICIOS_DE_OTRO_HOSPITAL_CENTRO_SANITARIO(30, "Servicios de otro hospital/centro sanitario"),
    POR_INICIATIVA_DEL_PACIENTE(40, "Por iniciativa del paciente"),
    EMERGENCIAS_MEDICAS(50, "Emergencias médicas (ajenas a los servicios del hospital, servicios médicos y paramédicos extrahospitalarios"),
    CENTRO_SOCIOSANITARIO(60, "Centro sociosanitario"),
    POR_ORDEN_JUDICIAL(70, "Por orden judicial"),
    OTROS(80, "Otros"),
    DESCONOCIDO(90, "Desconocido");

    private final int id;
    private final String s;

    Procedencia(int id, String s) {
        this.id = id;
        this.s = s;
    }

    public static Procedencia byId(int id) {
        return switch (id) {
            case 10 -> Procedencia.ATENCION_PRIMARIA;
            case 21 -> Procedencia.URGENCIAS;
            case 22 -> Procedencia.CIRUGIA_AMBULATORIA;
            case 23 -> Procedencia.HOSPITAL_DE_DIA_MEDICO;
            case 24 -> Procedencia.HOSPITALIZACION;
            case 25 -> Procedencia.HOSPITALIZACION_A_DOMICILIO;
            case 26 -> Procedencia.PROCEDIMIENTOS_AMBULATORIOS_DE_ESPECIAL_COMPLEJIDAD;
            case 27 -> Procedencia.CONSULTAS;
            case 28 -> Procedencia.OTROS_SERVICIOS;
            case 30 -> Procedencia.SERVICIOS_DE_OTRO_HOSPITAL_CENTRO_SANITARIO;
            case 40 -> Procedencia.POR_INICIATIVA_DEL_PACIENTE;
            case 50 -> Procedencia.EMERGENCIAS_MEDICAS;
            case 60 -> Procedencia.CENTRO_SOCIOSANITARIO;
            case 70 -> Procedencia.POR_ORDEN_JUDICIAL;
            case 80 -> Procedencia.OTROS;
            default -> Procedencia.DESCONOCIDO;
        };
    }

    public int getId() {
        return id;
    }

    public String asString() {
        return s;
    }
}
