import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Vacunable, Asegurable {

    // Atributo propio
    private boolean esEsterilizado;
    private final List<String> vacunas = new ArrayList<>();

    public Gato(String nombrePaciente, Integer edadAnios, String nombreDuenio, Boolean esEsterilizado) {

        super(nombrePaciente, edadAnios, nombreDuenio);

        this.esEsterilizado = esEsterilizado;

    }

    public boolean isEsEsterilizado() {

        return esEsterilizado;

    };

    // Costo de consulta
    @Override
    public long calcularCostoConsulta() {
        return 38000L;
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
        return esEsterilizado ? 120000.0 : 200000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-GATO-" + nombrePaciente.toUpperCase().replace(" ", "-");
    }

}