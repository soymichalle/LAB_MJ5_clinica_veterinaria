public class Ave extends Animal {

    private double pesoGramos;

    public Ave(String nombrePaciente, Integer edadAnios, String nombreDuenio, double pesoGramos) {

        super(nombrePaciente, edadAnios, nombreDuenio);

        if (pesoGramos <= 0){

            throw new IllegalArgumentException("El peso debe ser mayor a cero. Por favor, verifique");
        }

        this.pesoGramos = pesoGramos;

    }

    // Costo de consulta
    @Override
    public long calcularCostoConsulta() {
        return (long)(28000 + (100 * pesoGramos));
    }

}
