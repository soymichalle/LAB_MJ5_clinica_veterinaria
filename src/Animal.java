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

    public  abstract long calcularCostoConsulta();

    public void imprimirFicha() {

        System.out.println("===== FICHA VETERINARIA =====");
        System.out.println("Paciente: " + nombrePaciente);
        System.out.println("Edad: " + edadAnios + " año(s)");
        System.out.println("Dueño: " + nombreDuenio);
        System.out.printf("Costo de consulta: $%,d%n", calcularCostoConsulta());
        System.out.println("=============================\n");

    }

}
