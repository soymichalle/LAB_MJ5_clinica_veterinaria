public class Perro extends Animal {

    // Atributo propio
    private String raza;

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

}