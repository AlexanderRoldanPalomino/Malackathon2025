package database;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import types.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private final PoolDataSource pds;

    public DatabaseManager(String path) throws SQLException {
        pds = PoolDataSourceFactory.getPoolDataSource();

        System.setProperty("oracle.net.tns_admin", path);

        pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        pds.setURL("jdbc:oracle:thin:@malackathon2025_high");
        pds.setUser("malackathon");
        pds.setPassword("Oci.2025_v4m0ssss");
    }

    public Diagnostico getDiagnosticoById(int id) {
        try {
            Connection con = pds.getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM ANONIMISED_MALACKATHON WHERE id = " + id + ";");
            resultSet.next();

            ComunidadAutonoma comunidadAutonoma = ComunidadAutonoma.byName(resultSet.getString("comunidad_autonoma"));
            String nombre = resultSet.getString("nombre");
            String fecha_de_nacimiento = resultSet.getString("fecha_de_nacimiento");
            Sexo sexo = Sexo.byId(resultSet.getInt("sexo"));
            ComunidadAutonoma ccaa_residencia = (resultSet.getString("ccaa_residencia") == null) ? null : ComunidadAutonoma.byName(resultSet.getString("ccaa_residencia"));
            String fecha_de_ingreso = resultSet.getString("fecha_de_ingreso");
            CircunstanciaDeContacto circunstanciaDeContacto = CircunstanciaDeContacto.byId(resultSet.getInt("circunstancia_de_contacto"));
            String fecha_de_fin_contacto = resultSet.getString("fecha_de_fin_contacto");
            TipoAlta tipoAlta = TipoAlta.byId(resultSet.getInt("tipo_alta"));
            int estancia_dias = resultSet.getInt("estancia_dias");
            String categoria = resultSet.getString("categoria");
            String[] diagnosticos = {
                    resultSet.getString("diagnostico_principal"),
                    resultSet.getString("diagnostico_2"),
                    resultSet.getString("diagnostico_3"),
                    resultSet.getString("diagnostico_4"),
                    resultSet.getString("diagnostico_5"),
                    resultSet.getString("diagnostico_6"),
                    resultSet.getString("diagnostico_7"),
                    resultSet.getString("diagnostico_8"),
                    resultSet.getString("diagnostico_9"),
                    resultSet.getString("diagnostico_10"),
                    resultSet.getString("diagnostico_11"),
                    resultSet.getString("diagnostico_12"),
                    resultSet.getString("diagnostico_13"),
                    resultSet.getString("diagnostico_14"),
                    resultSet.getString("diagnostico_15"),
                    resultSet.getString("diagnostico_16"),
                    resultSet.getString("diagnostico_17"),
                    resultSet.getString("diagnostico_18"),
                    resultSet.getString("diagnostico_19"),
                    resultSet.getString("diagnostico_20")
            };
            String fecha_de_intervencion = resultSet.getString("fecha_de_intervencion");
            String[] procedimientos = {
                    resultSet.getString("procedimiento_1"),
                    resultSet.getString("procedimiento_2"),
                    resultSet.getString("procedimiento_3"),
                    resultSet.getString("procedimiento_4"),
                    resultSet.getString("procedimiento_5"),
                    resultSet.getString("procedimiento_6"),
                    resultSet.getString("procedimiento_7"),
                    resultSet.getString("procedimiento_8"),
                    resultSet.getString("procedimiento_9"),
                    resultSet.getString("procedimiento_10"),
                    resultSet.getString("procedimiento_11"),
                    resultSet.getString("procedimiento_12"),
                    resultSet.getString("procedimiento_13"),
                    resultSet.getString("procedimiento_14"),
                    resultSet.getString("procedimiento_15"),
                    resultSet.getString("procedimiento_16"),
                    resultSet.getString("procedimiento_17"),
                    resultSet.getString("procedimiento_18"),
                    resultSet.getString("procedimiento_19"),
                    resultSet.getString("procedimiento_20")
            };
            String gdr_ap = resultSet.getString("gdr_ap");
            String cdm_ap = resultSet.getString("cdm_ap");
            String tipo_gdr_ap = resultSet.getString("tipo_gdr_ap");
            String valor_peso_espanol = resultSet.getString("valor_peso_espanol");
            int grd_apr = resultSet.getInt("grd_apr");
            int cdm_apr = resultSet.getInt("cdm_apr");
            String tipo_gdr_apr = resultSet.getString("tipo_gdr_apr");
            String valor_peso_americano_apr = resultSet.getString("valor_peso_americano_apr");
            int nivel_severidad_apr = resultSet.getInt("nivel_severidad_apr");
            int riesgo_mortalidad_apr = resultSet.getInt("riesgo_mortalidad_apr");
            Servicio servicio = Servicio.byId(resultSet.getString("servicio"));
            int edad = resultSet.getInt("edad");
            String reingreso = resultSet.getString("reingreso");
            int coste_apr = resultSet.getInt("coste_apr");
            String gdr_ir = resultSet.getString("gdr_ir");
            String tipo_gdr_ir = resultSet.getString("tipo_gdr_ir");
            String tipo_proceso_ir = resultSet.getString("tipo_proceso_ir");
            int cie = resultSet.getInt("cie");
            int numero_de_registro_anual = resultSet.getInt("numero_de_registro_anual");
            String centro_recodificado = resultSet.getString("centro_recodificado");
            String cip_sns_recodificado = resultSet.getString("cip_sns_recodificado");
            Pais pais_nacimiento = Pais.byId(resultSet.getString("pais_nacimiento"));
            Pais pais_residencia = Pais.byId(resultSet.getString("pais_residencia"));
            String fecha_de_incio_contacto = resultSet.getString("fecha_de_inicio_contacto");
            RegimenFinanciacion regimenFinanciacion = RegimenFinanciacion.byId(resultSet.getInt("regimen_financiacion"));
            Procedencia procedencia = Procedencia.byId(resultSet.getInt("procedencia"));
            ContinuidadAsistencial continuidadAsistencial = ContinuidadAsistencial.byId(resultSet.getInt("continuidad_asistencial"));
            IngresoEnUCI ingresoEnUCI = IngresoEnUCI.byId(resultSet.getInt("ingreso_en_uci"));
            int dias_uci = resultSet.getInt("dias_uci");
            POADiagnostico[] poaDiagnosticos = {
                    (resultSet.getString("poa_diagnostico_principal") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_principal")),
                    (resultSet.getString("poa_diagnostico_2") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_2")),
                    (resultSet.getString("poa_diagnostico_3") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_3")),
                    (resultSet.getString("poa_diagnostico_4") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_4")),
                    (resultSet.getString("poa_diagnostico_5") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_5")),
                    (resultSet.getString("poa_diagnostico_6") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_6")),
                    (resultSet.getString("poa_diagnostico_7") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_7")),
                    (resultSet.getString("poa_diagnostico_8") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_8")),
                    (resultSet.getString("poa_diagnostico_9") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_9")),
                    (resultSet.getString("poa_diagnostico_10") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_10")),
                    (resultSet.getString("poa_diagnostico_11") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_11")),
                    (resultSet.getString("poa_diagnostico_12") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_12")),
                    (resultSet.getString("poa_diagnostico_13") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_13")),
                    (resultSet.getString("poa_diagnostico_14") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_14")),
                    (resultSet.getString("poa_diagnostico_15") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_15")),
                    (resultSet.getString("poa_diagnostico_16") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_16")),
                    (resultSet.getString("poa_diagnostico_17") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_17")),
                    (resultSet.getString("poa_diagnostico_18") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_18")),
                    (resultSet.getString("poa_diagnostico_19") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_19")),
                    (resultSet.getString("poa_diagnostico_20") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_20"))
            };
            String[] procedimientoExternos = {
                    resultSet.getString("procedimiento_externo_1"),
                    resultSet.getString("procedimiento_externo_2"),
                    resultSet.getString("procedimiento_externo_3"),
                    resultSet.getString("procedimiento_externo_4"),
                    resultSet.getString("procedimiento_externo_5"),
                    resultSet.getString("procedimiento_externo_6")
            };
            String tipo_grd_apr = resultSet.getString("tipo_grd_apr");
            float peso_espanol_apr = resultSet.getFloat("peso_espanol_apr");
            int edad_en_ingreso = resultSet.getInt("edad_en_ingreso");
            String mes_de_ingreso = resultSet.getString("mes_de_ingreso");

            Diagnostico diagnostico = new Diagnostico(
                    id,
                    comunidadAutonoma,
                    nombre,
                    fecha_de_nacimiento,
                    sexo,
                    ccaa_residencia,
                    fecha_de_ingreso,
                    circunstanciaDeContacto,
                    fecha_de_fin_contacto,
                    tipoAlta,
                    estancia_dias,
                    diagnosticos,
                    categoria,
                    fecha_de_intervencion,
                    procedimientos,
                    gdr_ap,
                    cdm_ap,
                    tipo_gdr_ap,
                    valor_peso_espanol,
                    grd_apr,
                    cdm_apr,
                    tipo_gdr_apr,
                    valor_peso_americano_apr,
                    nivel_severidad_apr,
                    riesgo_mortalidad_apr,
                    servicio,
                    edad,
                    reingreso,
                    coste_apr,
                    gdr_ir,
                    tipo_gdr_ir,
                    tipo_proceso_ir,
                    cie,
                    numero_de_registro_anual,
                    centro_recodificado,
                    cip_sns_recodificado,
                    pais_nacimiento,
                    pais_residencia,
                    fecha_de_incio_contacto,
                    regimenFinanciacion,
                    procedencia,
                    continuidadAsistencial,
                    ingresoEnUCI,
                    dias_uci,
                    poaDiagnosticos,
                    procedimientoExternos,
                    tipo_grd_apr,
                    peso_espanol_apr,
                    edad_en_ingreso,
                    mes_de_ingreso
            );
            return diagnostico;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Diagnostico> getFirstNDiagnosticos(int n) {
        try {
            Connection con = pds.getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM ANONIMISED_MALACKATHON FETCH FIRST " + n + " ROWS ONLY;");

            List<Diagnostico> diagnosticoList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                ComunidadAutonoma comunidadAutonoma = ComunidadAutonoma.byName(resultSet.getString("comunidad_autonoma"));
                String nombre = resultSet.getString("nombre");
                String fecha_de_nacimiento = resultSet.getString("fecha_de_nacimiento");
                Sexo sexo = Sexo.byId(resultSet.getInt("sexo"));
                ComunidadAutonoma ccaa_residencia = (resultSet.getString("ccaa_residencia") == null) ? null : ComunidadAutonoma.byName(resultSet.getString("ccaa_residencia"));
                String fecha_de_ingreso = resultSet.getString("fecha_de_ingreso");
                CircunstanciaDeContacto circunstanciaDeContacto = CircunstanciaDeContacto.byId(resultSet.getInt("circunstancia_de_contacto"));
                String fecha_de_fin_contacto = resultSet.getString("fecha_de_fin_contacto");
                TipoAlta tipoAlta = TipoAlta.byId(resultSet.getInt("tipo_alta"));
                int estancia_dias = resultSet.getInt("estancia_dias");
                String categoria = resultSet.getString("categoria");
                String[] diagnosticos = {
                        resultSet.getString("diagnostico_principal"),
                        resultSet.getString("diagnostico_2"),
                        resultSet.getString("diagnostico_3"),
                        resultSet.getString("diagnostico_4"),
                        resultSet.getString("diagnostico_5"),
                        resultSet.getString("diagnostico_6"),
                        resultSet.getString("diagnostico_7"),
                        resultSet.getString("diagnostico_8"),
                        resultSet.getString("diagnostico_9"),
                        resultSet.getString("diagnostico_10"),
                        resultSet.getString("diagnostico_11"),
                        resultSet.getString("diagnostico_12"),
                        resultSet.getString("diagnostico_13"),
                        resultSet.getString("diagnostico_14"),
                        resultSet.getString("diagnostico_15"),
                        resultSet.getString("diagnostico_16"),
                        resultSet.getString("diagnostico_17"),
                        resultSet.getString("diagnostico_18"),
                        resultSet.getString("diagnostico_19"),
                        resultSet.getString("diagnostico_20")
                };
                String fecha_de_intervencion = resultSet.getString("fecha_de_intervencion");
                String[] procedimientos = {
                        resultSet.getString("procedimiento_1"),
                        resultSet.getString("procedimiento_2"),
                        resultSet.getString("procedimiento_3"),
                        resultSet.getString("procedimiento_4"),
                        resultSet.getString("procedimiento_5"),
                        resultSet.getString("procedimiento_6"),
                        resultSet.getString("procedimiento_7"),
                        resultSet.getString("procedimiento_8"),
                        resultSet.getString("procedimiento_9"),
                        resultSet.getString("procedimiento_10"),
                        resultSet.getString("procedimiento_11"),
                        resultSet.getString("procedimiento_12"),
                        resultSet.getString("procedimiento_13"),
                        resultSet.getString("procedimiento_14"),
                        resultSet.getString("procedimiento_15"),
                        resultSet.getString("procedimiento_16"),
                        resultSet.getString("procedimiento_17"),
                        resultSet.getString("procedimiento_18"),
                        resultSet.getString("procedimiento_19"),
                        resultSet.getString("procedimiento_20")
                };
                String gdr_ap = resultSet.getString("gdr_ap");
                String cdm_ap = resultSet.getString("cdm_ap");
                String tipo_gdr_ap = resultSet.getString("tipo_gdr_ap");
                String valor_peso_espanol = resultSet.getString("valor_peso_espanol");
                int grd_apr = resultSet.getInt("grd_apr");
                int cdm_apr = resultSet.getInt("cdm_apr");
                String tipo_gdr_apr = resultSet.getString("tipo_gdr_apr");
                String valor_peso_americano_apr = resultSet.getString("valor_peso_americano_apr");
                int nivel_severidad_apr = resultSet.getInt("nivel_severidad_apr");
                int riesgo_mortalidad_apr = resultSet.getInt("riesgo_mortalidad_apr");
                Servicio servicio = Servicio.byId(resultSet.getString("servicio"));
                int edad = resultSet.getInt("edad");
                String reingreso = resultSet.getString("reingreso");
                int coste_apr = resultSet.getInt("coste_apr");
                String gdr_ir = resultSet.getString("gdr_ir");
                String tipo_gdr_ir = resultSet.getString("tipo_gdr_ir");
                String tipo_proceso_ir = resultSet.getString("tipo_proceso_ir");
                int cie = resultSet.getInt("cie");
                int numero_de_registro_anual = resultSet.getInt("numero_de_registro_anual");
                String centro_recodificado = resultSet.getString("centro_recodificado");
                String cip_sns_recodificado = resultSet.getString("cip_sns_recodificado");
                Pais pais_nacimiento = Pais.byId(resultSet.getString("pais_nacimiento"));
                Pais pais_residencia = Pais.byId(resultSet.getString("pais_residencia"));
                String fecha_de_incio_contacto = resultSet.getString("fecha_de_inicio_contacto");
                RegimenFinanciacion regimenFinanciacion = RegimenFinanciacion.byId(resultSet.getInt("regimen_financiacion"));
                Procedencia procedencia = Procedencia.byId(resultSet.getInt("procedencia"));
                ContinuidadAsistencial continuidadAsistencial = ContinuidadAsistencial.byId(resultSet.getInt("continuidad_asistencial"));
                IngresoEnUCI ingresoEnUCI = IngresoEnUCI.byId(resultSet.getInt("ingreso_en_uci"));
                int dias_uci = resultSet.getInt("dias_uci");
                POADiagnostico[] poaDiagnosticos = {
                        (resultSet.getString("poa_diagnostico_principal") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_principal")),
                        (resultSet.getString("poa_diagnostico_2") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_2")),
                        (resultSet.getString("poa_diagnostico_3") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_3")),
                        (resultSet.getString("poa_diagnostico_4") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_4")),
                        (resultSet.getString("poa_diagnostico_5") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_5")),
                        (resultSet.getString("poa_diagnostico_6") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_6")),
                        (resultSet.getString("poa_diagnostico_7") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_7")),
                        (resultSet.getString("poa_diagnostico_8") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_8")),
                        (resultSet.getString("poa_diagnostico_9") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_9")),
                        (resultSet.getString("poa_diagnostico_10") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_10")),
                        (resultSet.getString("poa_diagnostico_11") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_11")),
                        (resultSet.getString("poa_diagnostico_12") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_12")),
                        (resultSet.getString("poa_diagnostico_13") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_13")),
                        (resultSet.getString("poa_diagnostico_14") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_14")),
                        (resultSet.getString("poa_diagnostico_15") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_15")),
                        (resultSet.getString("poa_diagnostico_16") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_16")),
                        (resultSet.getString("poa_diagnostico_17") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_17")),
                        (resultSet.getString("poa_diagnostico_18") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_18")),
                        (resultSet.getString("poa_diagnostico_19") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_19")),
                        (resultSet.getString("poa_diagnostico_20") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_20"))
                };
                String[] procedimientoExternos = {
                        resultSet.getString("procedimiento_externo_1"),
                        resultSet.getString("procedimiento_externo_2"),
                        resultSet.getString("procedimiento_externo_3"),
                        resultSet.getString("procedimiento_externo_4"),
                        resultSet.getString("procedimiento_externo_5"),
                        resultSet.getString("procedimiento_externo_6")
                };
                String tipo_grd_apr = resultSet.getString("tipo_grd_apr");
                float peso_espanol_apr = resultSet.getFloat("peso_espanol_apr");
                int edad_en_ingreso = resultSet.getInt("edad_en_ingreso");
                String mes_de_ingreso = resultSet.getString("mes_de_ingreso");

                Diagnostico diagnostico = new Diagnostico(
                        id,
                        comunidadAutonoma,
                        nombre,
                        fecha_de_nacimiento,
                        sexo,
                        ccaa_residencia,
                        fecha_de_ingreso,
                        circunstanciaDeContacto,
                        fecha_de_fin_contacto,
                        tipoAlta,
                        estancia_dias,
                        diagnosticos,
                        categoria,
                        fecha_de_intervencion,
                        procedimientos,
                        gdr_ap,
                        cdm_ap,
                        tipo_gdr_ap,
                        valor_peso_espanol,
                        grd_apr,
                        cdm_apr,
                        tipo_gdr_apr,
                        valor_peso_americano_apr,
                        nivel_severidad_apr,
                        riesgo_mortalidad_apr,
                        servicio,
                        edad,
                        reingreso,
                        coste_apr,
                        gdr_ir,
                        tipo_gdr_ir,
                        tipo_proceso_ir,
                        cie,
                        numero_de_registro_anual,
                        centro_recodificado,
                        cip_sns_recodificado,
                        pais_nacimiento,
                        pais_residencia,
                        fecha_de_incio_contacto,
                        regimenFinanciacion,
                        procedencia,
                        continuidadAsistencial,
                        ingresoEnUCI,
                        dias_uci,
                        poaDiagnosticos,
                        procedimientoExternos,
                        tipo_grd_apr,
                        peso_espanol_apr,
                        edad_en_ingreso,
                        mes_de_ingreso
                );

                diagnosticoList.add(diagnostico);
            }
            return diagnosticoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Diagnostico> getDiagnosticoLike(String text) {
        try {
            Connection con = pds.getConnection();
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM ANONIMISED_MALACKATHON WHERE nombre LIKE '" + text.toUpperCase() + "%';");

            List<Diagnostico> diagnosticoList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                ComunidadAutonoma comunidadAutonoma = ComunidadAutonoma.byName(resultSet.getString("comunidad_autonoma"));
                String nombre = resultSet.getString("nombre");
                String fecha_de_nacimiento = resultSet.getString("fecha_de_nacimiento");
                Sexo sexo = Sexo.byId(resultSet.getInt("sexo"));
                ComunidadAutonoma ccaa_residencia = (resultSet.getString("ccaa_residencia") == null) ? null : ComunidadAutonoma.byName(resultSet.getString("ccaa_residencia"));
                String fecha_de_ingreso = resultSet.getString("fecha_de_ingreso");
                CircunstanciaDeContacto circunstanciaDeContacto = CircunstanciaDeContacto.byId(resultSet.getInt("circunstancia_de_contacto"));
                String fecha_de_fin_contacto = resultSet.getString("fecha_de_fin_contacto");
                TipoAlta tipoAlta = TipoAlta.byId(resultSet.getInt("tipo_alta"));
                int estancia_dias = resultSet.getInt("estancia_dias");
                String categoria = resultSet.getString("categoria");
                String[] diagnosticos = {
                        resultSet.getString("diagnostico_principal"),
                        resultSet.getString("diagnostico_2"),
                        resultSet.getString("diagnostico_3"),
                        resultSet.getString("diagnostico_4"),
                        resultSet.getString("diagnostico_5"),
                        resultSet.getString("diagnostico_6"),
                        resultSet.getString("diagnostico_7"),
                        resultSet.getString("diagnostico_8"),
                        resultSet.getString("diagnostico_9"),
                        resultSet.getString("diagnostico_10"),
                        resultSet.getString("diagnostico_11"),
                        resultSet.getString("diagnostico_12"),
                        resultSet.getString("diagnostico_13"),
                        resultSet.getString("diagnostico_14"),
                        resultSet.getString("diagnostico_15"),
                        resultSet.getString("diagnostico_16"),
                        resultSet.getString("diagnostico_17"),
                        resultSet.getString("diagnostico_18"),
                        resultSet.getString("diagnostico_19"),
                        resultSet.getString("diagnostico_20")
                };
                String fecha_de_intervencion = resultSet.getString("fecha_de_intervencion");
                String[] procedimientos = {
                        resultSet.getString("procedimiento_1"),
                        resultSet.getString("procedimiento_2"),
                        resultSet.getString("procedimiento_3"),
                        resultSet.getString("procedimiento_4"),
                        resultSet.getString("procedimiento_5"),
                        resultSet.getString("procedimiento_6"),
                        resultSet.getString("procedimiento_7"),
                        resultSet.getString("procedimiento_8"),
                        resultSet.getString("procedimiento_9"),
                        resultSet.getString("procedimiento_10"),
                        resultSet.getString("procedimiento_11"),
                        resultSet.getString("procedimiento_12"),
                        resultSet.getString("procedimiento_13"),
                        resultSet.getString("procedimiento_14"),
                        resultSet.getString("procedimiento_15"),
                        resultSet.getString("procedimiento_16"),
                        resultSet.getString("procedimiento_17"),
                        resultSet.getString("procedimiento_18"),
                        resultSet.getString("procedimiento_19"),
                        resultSet.getString("procedimiento_20")
                };
                String gdr_ap = resultSet.getString("gdr_ap");
                String cdm_ap = resultSet.getString("cdm_ap");
                String tipo_gdr_ap = resultSet.getString("tipo_gdr_ap");
                String valor_peso_espanol = resultSet.getString("valor_peso_espanol");
                int grd_apr = resultSet.getInt("grd_apr");
                int cdm_apr = resultSet.getInt("cdm_apr");
                String tipo_gdr_apr = resultSet.getString("tipo_gdr_apr");
                String valor_peso_americano_apr = resultSet.getString("valor_peso_americano_apr");
                int nivel_severidad_apr = resultSet.getInt("nivel_severidad_apr");
                int riesgo_mortalidad_apr = resultSet.getInt("riesgo_mortalidad_apr");
                Servicio servicio = Servicio.byId(resultSet.getString("servicio"));
                int edad = resultSet.getInt("edad");
                String reingreso = resultSet.getString("reingreso");
                int coste_apr = resultSet.getInt("coste_apr");
                String gdr_ir = resultSet.getString("gdr_ir");
                String tipo_gdr_ir = resultSet.getString("tipo_gdr_ir");
                String tipo_proceso_ir = resultSet.getString("tipo_proceso_ir");
                int cie = resultSet.getInt("cie");
                int numero_de_registro_anual = resultSet.getInt("numero_de_registro_anual");
                String centro_recodificado = resultSet.getString("centro_recodificado");
                String cip_sns_recodificado = resultSet.getString("cip_sns_recodificado");
                Pais pais_nacimiento = Pais.byId(resultSet.getString("pais_nacimiento"));
                Pais pais_residencia = Pais.byId(resultSet.getString("pais_residencia"));
                String fecha_de_incio_contacto = resultSet.getString("fecha_de_inicio_contacto");
                RegimenFinanciacion regimenFinanciacion = RegimenFinanciacion.byId(resultSet.getInt("regimen_financiacion"));
                Procedencia procedencia = Procedencia.byId(resultSet.getInt("procedencia"));
                ContinuidadAsistencial continuidadAsistencial = ContinuidadAsistencial.byId(resultSet.getInt("continuidad_asistencial"));
                IngresoEnUCI ingresoEnUCI = IngresoEnUCI.byId(resultSet.getInt("ingreso_en_uci"));
                int dias_uci = resultSet.getInt("dias_uci");
                POADiagnostico[] poaDiagnosticos = {
                        (resultSet.getString("poa_diagnostico_principal") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_principal")),
                        (resultSet.getString("poa_diagnostico_2") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_2")),
                        (resultSet.getString("poa_diagnostico_3") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_3")),
                        (resultSet.getString("poa_diagnostico_4") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_4")),
                        (resultSet.getString("poa_diagnostico_5") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_5")),
                        (resultSet.getString("poa_diagnostico_6") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_6")),
                        (resultSet.getString("poa_diagnostico_7") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_7")),
                        (resultSet.getString("poa_diagnostico_8") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_8")),
                        (resultSet.getString("poa_diagnostico_9") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_9")),
                        (resultSet.getString("poa_diagnostico_10") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_10")),
                        (resultSet.getString("poa_diagnostico_11") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_11")),
                        (resultSet.getString("poa_diagnostico_12") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_12")),
                        (resultSet.getString("poa_diagnostico_13") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_13")),
                        (resultSet.getString("poa_diagnostico_14") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_14")),
                        (resultSet.getString("poa_diagnostico_15") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_15")),
                        (resultSet.getString("poa_diagnostico_16") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_16")),
                        (resultSet.getString("poa_diagnostico_17") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_17")),
                        (resultSet.getString("poa_diagnostico_18") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_18")),
                        (resultSet.getString("poa_diagnostico_19") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_19")),
                        (resultSet.getString("poa_diagnostico_20") == null) ? null : POADiagnostico.byId(resultSet.getString("poa_diagnostico_20"))
                };
                String[] procedimientoExternos = {
                        resultSet.getString("procedimiento_externo_1"),
                        resultSet.getString("procedimiento_externo_2"),
                        resultSet.getString("procedimiento_externo_3"),
                        resultSet.getString("procedimiento_externo_4"),
                        resultSet.getString("procedimiento_externo_5"),
                        resultSet.getString("procedimiento_externo_6")
                };
                String tipo_grd_apr = resultSet.getString("tipo_grd_apr");
                float peso_espanol_apr = resultSet.getFloat("peso_espanol_apr");
                int edad_en_ingreso = resultSet.getInt("edad_en_ingreso");
                String mes_de_ingreso = resultSet.getString("mes_de_ingreso");

                Diagnostico diagnostico = new Diagnostico(
                        id,
                        comunidadAutonoma,
                        nombre,
                        fecha_de_nacimiento,
                        sexo,
                        ccaa_residencia,
                        fecha_de_ingreso,
                        circunstanciaDeContacto,
                        fecha_de_fin_contacto,
                        tipoAlta,
                        estancia_dias,
                        diagnosticos,
                        categoria,
                        fecha_de_intervencion,
                        procedimientos,
                        gdr_ap,
                        cdm_ap,
                        tipo_gdr_ap,
                        valor_peso_espanol,
                        grd_apr,
                        cdm_apr,
                        tipo_gdr_apr,
                        valor_peso_americano_apr,
                        nivel_severidad_apr,
                        riesgo_mortalidad_apr,
                        servicio,
                        edad,
                        reingreso,
                        coste_apr,
                        gdr_ir,
                        tipo_gdr_ir,
                        tipo_proceso_ir,
                        cie,
                        numero_de_registro_anual,
                        centro_recodificado,
                        cip_sns_recodificado,
                        pais_nacimiento,
                        pais_residencia,
                        fecha_de_incio_contacto,
                        regimenFinanciacion,
                        procedencia,
                        continuidadAsistencial,
                        ingresoEnUCI,
                        dias_uci,
                        poaDiagnosticos,
                        procedimientoExternos,
                        tipo_grd_apr,
                        peso_espanol_apr,
                        edad_en_ingreso,
                        mes_de_ingreso
                );

                diagnosticoList.add(diagnostico);
            }
            return diagnosticoList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ResultSet query(String sql) {
        try {
            Connection conn = pds.getConnection();
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
