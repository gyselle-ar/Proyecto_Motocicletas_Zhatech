package negocio;

import datos.DetalleConfiguracionDAO;
import datos.MotocicletaDAO;
import entidades.Componente;
import entidades.Marca;
import entidades.MotoCruiser;
import entidades.MotoDeportiva;
import entidades.MotoTrabajo;
import entidades.Motocicleta;
import entidades.Reporte;
import entidades.TipoMoto;
import entidades.ValidadorCompatibilidad;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MotocicletaControl {

    private final MotocicletaDAO DATOS;
    private Motocicleta obj;
    private DefaultTableModel modeloTabla;
    public int motosCreadas;
    private final DetalleConfiguracionDAO DETALLECONFI;
    private final ReporteControl CONTROLREPORTE;

    public MotocicletaControl() {
        this.DATOS = new MotocicletaDAO();
        this.obj = null;
        this.motosCreadas = 0;
        this.DETALLECONFI = new DetalleConfiguracionDAO();
        this.CONTROLREPORTE = new ReporteControl();
    }

    public DefaultTableModel listar() {
        List<Motocicleta> lista = new ArrayList<>();
        lista.addAll(DATOS.listar());

        String[] titulos = {"Id", "Marca", "Tipo", "Fecha", "Reporte"};
        this.modeloTabla = new DefaultTableModel(null, titulos);

        String[] registro = new String[5];
        this.motosCreadas = 0;

        for (Motocicleta item : lista) {

            registro[0] = String.valueOf(item.getIdMotocicleta());
            registro[1] = item.getMarca().getNombre();
            registro[2] = item.getTipoMoto().getNombre();
            registro[3] = item.getFechaCreacion().toString();
            registro[4] = "Ver reporte";

            this.modeloTabla.addRow(registro);
            this.motosCreadas = this.motosCreadas + 1;
        }
        return this.modeloTabla;
    }

    public String guardar(Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion) {
        switch (tipoMoto.getIdTipoMoto()) {
            case 1:
                obj = new MotoDeportiva();
                break;
            case 2:
                obj = new MotoTrabajo();
                break;
            default:
                obj = new MotoCruiser();
                break;
        }

        obj.setMarca(marca);
        obj.setTipoMoto(tipoMoto);
        obj.setFechaCreacion(fechaCreacion);

        if (DATOS.guardar(obj)) {
            this.motosCreadas++;
            return "Moto creada con éxito.";
        } else {
            return "Error en la creación.";
        }
    }

    public String eliminar(int idMotocicleta) {
        DETALLECONFI.eliminarPorMoto(idMotocicleta);
        CONTROLREPORTE.eliminarPorMoto(idMotocicleta);

        if (DATOS.eliminar(idMotocicleta)) {
            this.motosCreadas--;
            return "Motocicleta eliminada correctamente.";
        }

        return "Error al eliminar motocicleta.";
    }

    public int getMotosCreadas() {
        return this.motosCreadas;
    }

    public Motocicleta buscarPorId(int id) {
        return DATOS.buscarPorId(id);
    }
    
    public List<Motocicleta> listarMotos(){
        return DATOS.listar();
    }

    public String crearMotoDeportiva(Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes, boolean turboActivado, boolean modoPista) {

        ValidadorCompatibilidad validador = new ValidadorCompatibilidad();

        for (int i = 0; i < componentes.size(); i++) {
            for (int j = i + 1; j < componentes.size(); j++) {
                String resultado = validador.validarCompatibilidad(componentes.get(i).getNombre(), componentes.get(j).getNombre());

                if (!resultado.equals("Componentes Compatibles")) {
                    return resultado;
                }
            }
        }

        Motocicleta obj = null;

        if (tipoMoto.getNombre().equalsIgnoreCase("Deportiva")) {
            obj = new MotoDeportiva();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Cruiser")) {
            obj = new MotoCruiser();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Trabajo")) {
            obj = new MotoTrabajo();
        }

        if (obj instanceof MotoDeportiva) {

            MotoDeportiva motoDep = (MotoDeportiva) obj;

            motoDep.setTurboActivado(turboActivado);
            motoDep.setModoPista(modoPista);
        }

        obj.setMarca(marca);
        obj.setTipoMoto(tipoMoto);
        obj.setFechaCreacion(fechaCreacion);
        obj.setComponentes(componentes);
        DATOS.guardar(obj);

        obj.setComponentes(componentes);

        for (Componente componente : componentes) {
            DETALLECONFI.guardarDetalleConfiguracion(obj.getIdMotocicleta(), componente.getIdComponente());
        }

        Reporte reporte = obj.generarReporte();

        reporte.setMotocicleta(obj);
        CONTROLREPORTE.guardar(reporte);

        return "Motocicleta creada con éxito.";
    }
    
    public String crearMotoTrabajo(Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes, boolean testResistenciaActivaodo) {

        ValidadorCompatibilidad validador = new ValidadorCompatibilidad();

        for (int i = 0; i < componentes.size(); i++) {
            for (int j = i + 1; j < componentes.size(); j++) {
                String resultado = validador.validarCompatibilidad(componentes.get(i).getNombre(), componentes.get(j).getNombre());

                if (!resultado.equals("Componentes Compatibles")) {
                    return resultado;
                }
            }
        }

        Motocicleta obj = null;

        if (tipoMoto.getNombre().equalsIgnoreCase("Deportiva")) {
            obj = new MotoDeportiva();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Cruiser")) {
            obj = new MotoCruiser();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Trabajo")) {
            obj = new MotoTrabajo();
        }

        if (obj instanceof MotoTrabajo) {

            MotoTrabajo motoTra = (MotoTrabajo) obj;

            motoTra.setTestResistenciaActivado(testResistenciaActivaodo);
        }

        obj.setMarca(marca);
        obj.setTipoMoto(tipoMoto);
        obj.setFechaCreacion(fechaCreacion);
        obj.setComponentes(componentes);
        DATOS.guardar(obj);

        obj.setComponentes(componentes);

        for (Componente componente : componentes) {
            DETALLECONFI.guardarDetalleConfiguracion(obj.getIdMotocicleta(), componente.getIdComponente());
        }

        Reporte reporte = obj.generarReporte();

        reporte.setMotocicleta(obj);
        CONTROLREPORTE.guardar(reporte);

        return "Motocicleta creada con éxito.";
    }
    
    public String crearMotoCruiser(Marca marca, TipoMoto tipoMoto, LocalDate fechaCreacion, List<Componente> componentes, boolean testConfortActivado) {

        ValidadorCompatibilidad validador = new ValidadorCompatibilidad();

        for (int i = 0; i < componentes.size(); i++) {
            for (int j = i + 1; j < componentes.size(); j++) {
                String resultado = validador.validarCompatibilidad(componentes.get(i).getNombre(), componentes.get(j).getNombre());

                if (!resultado.equals("Componentes Compatibles")) {
                    return resultado;
                }
            }
        }

        Motocicleta obj = null;

        if (tipoMoto.getNombre().equalsIgnoreCase("Deportiva")) {
            obj = new MotoDeportiva();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Cruiser")) {
            obj = new MotoCruiser();
        } else if (tipoMoto.getNombre().equalsIgnoreCase("Trabajo")) {
            obj = new MotoTrabajo();
        }

        if (obj instanceof MotoCruiser) {

            MotoCruiser motoCru = (MotoCruiser) obj;

            motoCru.setTestConfortActivado(testConfortActivado);
        }

        obj.setMarca(marca);
        obj.setTipoMoto(tipoMoto);
        obj.setFechaCreacion(fechaCreacion);
        obj.setComponentes(componentes);
        DATOS.guardar(obj);

        obj.setComponentes(componentes);

        for (Componente componente : componentes) {
            DETALLECONFI.guardarDetalleConfiguracion(obj.getIdMotocicleta(), componente.getIdComponente());
        }

        Reporte reporte = obj.generarReporte();

        reporte.setMotocicleta(obj);
        CONTROLREPORTE.guardar(reporte);

        return "Motocicleta creada con éxito.";
    }

}
