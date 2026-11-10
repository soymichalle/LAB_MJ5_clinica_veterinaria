import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements Vacunable, Asegurable {

    // Atributo propio
    private String raza;
    private final List<String> vacunas = new ArrayList<>();

    public String getRaza() {
        return raza;
    }

    public Perro(String nombrePaciente, Integer edadAnios, String nombreDuenio, String raza) {

        super(nombrePaciente,edadAnios,nombreDuenio);

        this.raza = raza;

    }

    // Costo de consulta
    @Override
    public long calcularCostoConsulta() {
        return 45000 + (3000L * edadAnios);
    }

    @Override
    public void registrarVacuna(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la vacuna no puede estar vacío.");
        }
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000.0 * edadAnios;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-PERRO-" + nombrePaciente.toUpperCase().replace(" ", "-");
    }
}