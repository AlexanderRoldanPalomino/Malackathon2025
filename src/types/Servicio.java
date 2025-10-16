package types;

public enum Servicio {
    ACL("Análisis Clínicos"),
    ACV("Angiología y Cirugía Vascular"),
    ADM("Admisión y documentación clínica"),
    ALG("Alergología"),
    ANR("Anestesia y Reanimación"),
    APA("Anatomía Patológica"),
    BCS("Banco de Sangre"),
    BIO("Bioquímica Clínica"),
    CAR("Cardiología"),
    CCA("Cirugía Cardiaca"),
    CCI("Cirugía Cardiaca Infantil"),
    CIR("Cirugía General y Digestiva"),
    CMF("Cirugía Maxilofacial"),
    CPE("Cirugía Pediátrica"),
    CPL("Cirugía Plástica y Reparadora"),
    CTO("Cirugía Torácica"),
    DCL("Documentación Clínica"),
    DER("Dermatología"),
    DIE("Dietética"),
    DIG("Digestivo"),
    END("Endocrinología"),
    EST("Estomatología"),
    FAC("Farmacología Clínica"),
    FAR("Farmacia"),
    GEN("Genética"),
    GRT("Geriatría"),
    HEL("Hematología Laboratorio"),
    HEM("Hematología Clínica"),
    INF("Enfermedades infecciosas"),
    INM("Inmunología"),
    LAB("Laboratorios"),
    LIT("Litotricia"),
    MFC("Medicina Familiar y Comunitaria"),
    MIC("Microbiología y Parasitología"),
    MIN("Medicina Intensiva Neonatal"),
    MIP("Medicina Intensiva Pediátrica"),
    MIR("Medicina Interna"),
    MIV("Medicina Intensiva"),
    MNU("Medicina Nuclear"),
    MPR("Medicina Preventiva"),
    NEF("Nefrología"),
    NEO("Neonatología"),
    NFC("Neurofisiología Clínica"),
    NML("Neumología"),
    NRC("Neurocirugía"),
    NRL("Neurología"),
    OBG("Obstetricia y Ginecología"),
    OFT("Oftalmología"),
    ONC("Oncología Médica"),
    ONR("Oncología Radioterápica"),
    ORL("Otorrinolaringología"),
    OTR("Otros"),
    PED("Pediatría"),
    PSQ("Psiquiatría"),
    RAD("Radiología"),
    RAI("Radiología Intervencionista"),
    RDT("Radioterapia"),
    REH("Rehabilitación"),
    REU("Reumatología"),
    TRA("Traumatología y C. Ortopédica"),
    UCE("Unidad de Corta Estancia"),
    UCP("Unidad de Cuidados Paliativos"),
    UCR("Unidad de Coronaria"),
    UDO("Unidad del Dolor"),
    UHD("Unidad de Hemodiálisis"),
    ULE("Unidad de Larga Estancia"),
    ULM("Unidad de Lesionados Medulares"),
    URG("Urgencias"),
    URH("Unidad de Reproducción Humana"),
    URO("Urología"),
    USO("Unidad del Sueño"),
    UTR("Unidades de Extracción y Trasplantes"),
    UTX("Unidad de Desintoxicación");

    private final String s;

    Servicio(String s) {
        this.s = s;
    }

    public static Servicio byId(String id) {
        return switch (id) {
            case "ACL" -> Servicio.ACL;
            case "ACV" -> Servicio.ACV;
            case "ADM" -> Servicio.ADM;
            case "ALG" -> Servicio.ALG;
            case "ANR" -> Servicio.ANR;
            case "APA" -> Servicio.APA;
            case "BCS" -> Servicio.BCS;
            case "BIO" -> Servicio.BIO;
            case "CAR" -> Servicio.CAR;
            case "CCA" -> Servicio.CCA;
            case "CCI" -> Servicio.CCI;
            case "CIR" -> Servicio.CIR;
            case "CMF" -> Servicio.CMF;
            case "CPE" -> Servicio.CPE;
            case "CPL" -> Servicio.CPL;
            case "CTO" -> Servicio.CTO;
            case "DCL" -> Servicio.DCL;
            case "DER" -> Servicio.DER;
            case "DIE" -> Servicio.DIE;
            case "DIG" -> Servicio.DIG;
            case "END" -> Servicio.END;
            case "EST" -> Servicio.EST;
            case "FAC" -> Servicio.FAC;
            case "FAR" -> Servicio.FAR;
            case "GEN" -> Servicio.GEN;
            case "GRT" -> Servicio.GRT;
            case "HEL" -> Servicio.HEL;
            case "HEM" -> Servicio.HEM;
            case "INF" -> Servicio.INF;
            case "INM" -> Servicio.INM;
            case "LAB" -> Servicio.LAB;
            case "LIT" -> Servicio.LIT;
            case "MFC" -> Servicio.MFC;
            case "MIC" -> Servicio.MIC;
            case "MIN" -> Servicio.MIN;
            case "MIP" -> Servicio.MIP;
            case "MIR" -> Servicio.MIR;
            case "MIV" -> Servicio.MIV;
            case "MNU" -> Servicio.MNU;
            case "MPR" -> Servicio.MPR;
            case "NEF" -> Servicio.NEF;
            case "NEO" -> Servicio.NEO;
            case "NFC" -> Servicio.NFC;
            case "NML" -> Servicio.NML;
            case "NRC" -> Servicio.NRC;
            case "NRL" -> Servicio.NRL;
            case "OBG" -> Servicio.OBG;
            case "OFT" -> Servicio.OFT;
            case "ONC" -> Servicio.ONC;
            case "ONR" -> Servicio.ONR;
            case "ORL" -> Servicio.ORL;
            case "OTR" -> Servicio.OTR;
            case "PED" -> Servicio.PED;
            case "PSQ" -> Servicio.PSQ;
            case "RAD" -> Servicio.RAD;
            case "RAI" -> Servicio.RAI;
            case "RDT" -> Servicio.RDT;
            case "REH" -> Servicio.REH;
            case "REU" -> Servicio.REU;
            case "TRA" -> Servicio.TRA;
            case "UCE" -> Servicio.UCE;
            case "UCP" -> Servicio.UCP;
            case "UCR" -> Servicio.UCR;
            case "UDO" -> Servicio.UDO;
            case "UHD" -> Servicio.UHD;
            case "ULE" -> Servicio.ULE;
            case "ULM" -> Servicio.ULM;
            case "URG" -> Servicio.URG;
            case "URH" -> Servicio.URH;
            case "URO" -> Servicio.URO;
            case "USO" -> Servicio.USO;
            case "UTR" -> Servicio.UTR;
            case "UTX" -> Servicio.UTX;
            default -> null;
        };
    }

    public String asString() {
        return s;
    }
}
