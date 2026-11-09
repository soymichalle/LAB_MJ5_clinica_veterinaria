public class Gato extends Animal{

    // Atributo propio
    private boolean esEsterilizado;

    public Gato(String nombrePaciente, Integer edadAnios, String nombreDuenio, Boolean esEsterilizado) {

        super(nombrePaciente, edadAnios, nombreDuenio);

        this.esEsterilizado = esEsterilizado;

    }

    // Costo de consulta
    @Override
    public long calcularCostoConsulta() {
        return 38000;
    }

}
