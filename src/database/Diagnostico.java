package database;

import types.*;

import java.util.Arrays;
import java.util.Date;

public class Diagnostico {

    private final ComunidadAutonoma comunidadAutonoma;
    private final String nombre;
    private final String fechaDeNacimiento;
    private final Sexo sexo;
    private final ComunidadAutonoma ccaa_residencia;
    private final String fechaDeIngreso;
    private final CircunstanciaDeContacto circunstanciaDeContacto;
    private final String fechaDeFinContacto;
    private final TipoAlta tipoAlta;
    private final int estanciaDias;
    private final String[] diagnosticos;
    private final String categoria;
    private final String fechaDeIntervencion;
    private final String[] procedimientos;
    private final String gdr_ap;
    private final String cdm_ap;
    private final String tipo_gdr_ap;
    private final String valorPesoEspanol;
    private final int grd_apr;
    private final int cdm_apr;
    private final String tipo_gdr_apr;
    private final String valorPesoAmericano_apr;
    private final int nivelSeveridad_apr;
    private final int riesgoMortalidad_apr;
    private final Servicio servicio;
    private final int edad;
    private final String reingreso;
    private final int coste_apr;
    private final String gdr_ir;
    private final String tipo_gdr_ir;
    private final String tipoProceso_ir;
    private final int cie;
    private final int numeroDeRegistroAnual;
    private final String centroRecodificado;
    private final String cip_snsRecodificado;
    private final Pais paisNacimiento;
    private final Pais paisResidencia;
    private final String fechaDeInicioContacto;
    private final RegimenFinanciacion regimenFinanciacion;
    private final Procedencia procedencia;
    private final ContinuidadAsistencial continuidadAsistencial;
    private final IngresoEnUCI ingresoEnUCI;
    private final int diasUCI;
    private final POADiagnostico[] poaDiagnosticos;
    private final String[] procedimientoExternos;
    private final String tipo_grd_apr;
    private final float pesoEspanol_apr;
    private final int edadEnIngreso;
    private final String mesDeIngreso;

    public Diagnostico(ComunidadAutonoma comunidadAutonoma, String nombre, String fechaDeNacimiento, Sexo sexo, ComunidadAutonoma ccaa_residencia, String fechaDeIngreso, types.CircunstanciaDeContacto circunstanciaDeContacto, String fechaDeFinContacto, TipoAlta tipoAlta, int estanciaDias, String[] diagnosticos, String categoria, String fechaDeIntervencion, String[] procedimientos, String gdr_ap, String cdm_ap, String tipo_gdr_ap, String valorPesoEspanol, int grd_apr, int cdm_apr, String tipo_gdr_apr, String valorPesoAmericano_apr, int nivelSeveridad_apr, int riesgoMortalidad_apr, Servicio servicio, int edad, String reingreso, int coste_apr, String gdr_ir, String tipo_gdr_ir, String tipoProceso_ir, int cie, int numeroDeRegistroAnual, String centroRecodificado, String cip_snsRecodificado, Pais paisNacimiento, Pais paisResidencia, String fechaDeInicioContacto, RegimenFinanciacion regimenFinanciacion, Procedencia procedencia, ContinuidadAsistencial continuidadAsistencial, IngresoEnUCI ingresoEnUCI, int diasUCI, POADiagnostico[] poaDiagnosticos, String[] procedimientoExternos, String tipo_grd_apr, float pesoEspanol_apr, int edadEnIngreso, String mesDeIngreso) {
        this.comunidadAutonoma = comunidadAutonoma;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.ccaa_residencia = ccaa_residencia;
        this.fechaDeIngreso = fechaDeIngreso;
        this.circunstanciaDeContacto = circunstanciaDeContacto;
        this.fechaDeFinContacto = fechaDeFinContacto;
        this.tipoAlta = tipoAlta;
        this.estanciaDias = estanciaDias;
        this.diagnosticos = diagnosticos;
        this.categoria = categoria;
        this.fechaDeIntervencion = fechaDeIntervencion;
        this.procedimientos = procedimientos;
        this.gdr_ap = gdr_ap;
        this.cdm_ap = cdm_ap;
        this.tipo_gdr_ap = tipo_gdr_ap;
        this.valorPesoEspanol = valorPesoEspanol;
        this.grd_apr = grd_apr;
        this.cdm_apr = cdm_apr;
        this.tipo_gdr_apr = tipo_gdr_apr;
        this.valorPesoAmericano_apr = valorPesoAmericano_apr;
        this.nivelSeveridad_apr = nivelSeveridad_apr;
        this.riesgoMortalidad_apr = riesgoMortalidad_apr;
        this.servicio = servicio;
        this.edad = edad;
        this.reingreso = reingreso;
        this.coste_apr = coste_apr;
        this.gdr_ir = gdr_ir;
        this.tipo_gdr_ir = tipo_gdr_ir;
        this.tipoProceso_ir = tipoProceso_ir;
        this.cie = cie;
        this.numeroDeRegistroAnual = numeroDeRegistroAnual;
        this.centroRecodificado = centroRecodificado;
        this.cip_snsRecodificado = cip_snsRecodificado;
        this.paisNacimiento = paisNacimiento;
        this.paisResidencia = paisResidencia;
        this.fechaDeInicioContacto = fechaDeInicioContacto;
        this.regimenFinanciacion = regimenFinanciacion;
        this.procedencia = procedencia;
        this.continuidadAsistencial = continuidadAsistencial;
        this.ingresoEnUCI = ingresoEnUCI;
        this.diasUCI = diasUCI;
        this.poaDiagnosticos = poaDiagnosticos;
        this.procedimientoExternos = procedimientoExternos;
        this.tipo_grd_apr = tipo_grd_apr;
        this.pesoEspanol_apr = pesoEspanol_apr;
        this.edadEnIngreso = edadEnIngreso;
        this.mesDeIngreso = mesDeIngreso;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "comunidadAutonoma=" + comunidadAutonoma +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", sexo=" + sexo +
                ", ccaa_residencia=" + ccaa_residencia +
                ", fechaDeIngreso='" + fechaDeIngreso + '\'' +
                ", circunstanciaDeContacto=" + circunstanciaDeContacto +
                ", fechaDeFinContacto='" + fechaDeFinContacto + '\'' +
                ", tipoAlta=" + tipoAlta +
                ", estanciaDias=" + estanciaDias +
                ", diagnosticos=" + Arrays.toString(diagnosticos) +
                ", categoria='" + categoria + '\'' +
                ", fechaDeIntervencion='" + fechaDeIntervencion + '\'' +
                ", procedimientos=" + Arrays.toString(procedimientos) +
                ", gdr_ap='" + gdr_ap + '\'' +
                ", cdm_ap='" + cdm_ap + '\'' +
                ", tipo_gdr_ap='" + tipo_gdr_ap + '\'' +
                ", valorPesoEspanol='" + valorPesoEspanol + '\'' +
                ", grd_apr=" + grd_apr +
                ", cdm_apr=" + cdm_apr +
                ", tipo_gdr_apr='" + tipo_gdr_apr + '\'' +
                ", valorPesoAmericano_apr='" + valorPesoAmericano_apr + '\'' +
                ", nivelSeveridad_apr=" + nivelSeveridad_apr +
                ", riesgoMortalidad_apr=" + riesgoMortalidad_apr +
                ", servicio=" + servicio +
                ", edad=" + edad +
                ", reingreso='" + reingreso + '\'' +
                ", coste_apr=" + coste_apr +
                ", gdr_ir='" + gdr_ir + '\'' +
                ", tipo_gdr_ir='" + tipo_gdr_ir + '\'' +
                ", tipoProceso_ir='" + tipoProceso_ir + '\'' +
                ", cie=" + cie +
                ", numeroDeRegistroAnual=" + numeroDeRegistroAnual +
                ", centroRecodificado='" + centroRecodificado + '\'' +
                ", cip_snsRecodificado='" + cip_snsRecodificado + '\'' +
                ", paisNacimiento=" + paisNacimiento +
                ", paisResidencia=" + paisResidencia +
                ", fechaDeInicioContacto='" + fechaDeInicioContacto + '\'' +
                ", regimenFinanciacion=" + regimenFinanciacion +
                ", procedencia=" + procedencia +
                ", continuidadAsistencial=" + continuidadAsistencial +
                ", ingresoEnUCI=" + ingresoEnUCI +
                ", diasUCI=" + diasUCI +
                ", poaDiagnosticos=" + Arrays.toString(poaDiagnosticos) +
                ", procedimientoExternos=" + Arrays.toString(procedimientoExternos) +
                ", tipo_grd_apr='" + tipo_grd_apr + '\'' +
                ", pesoEspanol_apr=" + pesoEspanol_apr +
                ", edadEnIngreso=" + edadEnIngreso +
                ", mesDeIngreso='" + mesDeIngreso + '\'' +
                '}';
    }

    public ComunidadAutonoma getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public ComunidadAutonoma getCcaa_residencia() {
        return ccaa_residencia;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public CircunstanciaDeContacto getCircunstanciaDeContacto() {
        return circunstanciaDeContacto;
    }

    public String getFechaDeFinContacto() {
        return fechaDeFinContacto;
    }

    public TipoAlta getTipoAlta() {
        return tipoAlta;
    }

    public int getEstanciaDias() {
        return estanciaDias;
    }

    public String[] getDiagnosticos() {
        return diagnosticos;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getFechaDeIntervencion() {
        return fechaDeIntervencion;
    }

    public String[] getProcedimientos() {
        return procedimientos;
    }

    public String getGdr_ap() {
        return gdr_ap;
    }

    public String getCdm_ap() {
        return cdm_ap;
    }

    public String getTipo_gdr_ap() {
        return tipo_gdr_ap;
    }

    public String getValorPesoEspanol() {
        return valorPesoEspanol;
    }

    public int getGrd_apr() {
        return grd_apr;
    }

    public int getCdm_apr() {
        return cdm_apr;
    }

    public String getTipo_gdr_apr() {
        return tipo_gdr_apr;
    }

    public String getValorPesoAmericano_apr() {
        return valorPesoAmericano_apr;
    }

    public int getNivelSeveridad_apr() {
        return nivelSeveridad_apr;
    }

    public int getRiesgoMortalidad_apr() {
        return riesgoMortalidad_apr;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public int getEdad() {
        return edad;
    }

    public String getReingreso() {
        return reingreso;
    }

    public int getCoste_apr() {
        return coste_apr;
    }

    public String getGdr_ir() {
        return gdr_ir;
    }

    public String getTipo_gdr_ir() {
        return tipo_gdr_ir;
    }

    public String getTipoProceso_ir() {
        return tipoProceso_ir;
    }

    public int getCie() {
        return cie;
    }

    public int getNumeroDeRegistroAnual() {
        return numeroDeRegistroAnual;
    }

    public String getCentroRecodificado() {
        return centroRecodificado;
    }

    public String getCip_snsRecodificado() {
        return cip_snsRecodificado;
    }

    public Pais getPaisNacimiento() {
        return paisNacimiento;
    }

    public Pais getPaisResidencia() {
        return paisResidencia;
    }

    public String getFechaDeInicioContacto() {
        return fechaDeInicioContacto;
    }

    public RegimenFinanciacion getRegimenFinanciacion() {
        return regimenFinanciacion;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public ContinuidadAsistencial getContinuidadAsistencial() {
        return continuidadAsistencial;
    }

    public IngresoEnUCI getIngresoEnUCI() {
        return ingresoEnUCI;
    }

    public int getDiasUCI() {
        return diasUCI;
    }

    public POADiagnostico[] getPoaDiagnosticos() {
        return poaDiagnosticos;
    }

    public String[] getProcedimientoExternos() {
        return procedimientoExternos;
    }

    public String getTipo_grd_apr() {
        return tipo_grd_apr;
    }

    public float getPesoEspanol_apr() {
        return pesoEspanol_apr;
    }

    public int getEdadEnIngreso() {
        return edadEnIngreso;
    }

    public String getMesDeIngreso() {
        return mesDeIngreso;
    }
}
