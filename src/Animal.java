public abstract class Animal {

    protected String nombrePaciente;
    protected Integer edadAnios;
    protected String nombreDuenio;

    // double costo;

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public Integer getEdadAnios() {
        return edadAnios;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public Animal(String nombrePaciente, Integer edadAnios, String nombreDuenio) {

        if (nombrePaciente == null || nombrePaciente.isBlank()) {
            throw new IllegalArgumentException("El paciente necesita un nombre. Por favor verifique.");
        }

        if (edadAnios == null || edadAnios <= 0) {
            throw new IllegalArgumentException("El paciente necesita una edad válida. Por favor verifique.");
        }

        if (nombreDuenio == null || nombreDuenio.isBlank()) {
            throw new IllegalArgumentException("El paciente necesita un dueño. Por favor verifique.");
        }

        this.nombrePaciente = nombrePaciente;
        this.edadAnios = edadAnios;
        this.nombreDuenio = nombreDuenio;

    }

    @Override
    public  long calcularCostoConsulta() {
        // base perro 45000 + (3000*años)
        // fijo gato 38000
        // base 28000 (100*peso)
    }

}
