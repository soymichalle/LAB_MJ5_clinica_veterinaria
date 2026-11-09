public class Ave extends Animal {

    private double pesoGramos;

    public Ave(String nombrePaciente, Integer edadAnios, String nombreDuenio, double pesoGramos) {

        super(nombrePaciente, edadAnios, nombreDuenio);

        this.pesoGramos = pesoGramos;
    }

    // Costo de consulta
    @Override
    public long calcularCostoConsulta() {
        return (long)(28000 + (100 * pesoGramos));
    }

}
