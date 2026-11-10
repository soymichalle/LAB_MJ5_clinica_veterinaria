public class Conejo extends Animal {

    public Conejo(String nombrePaciente, Integer edadAnios, String nombreDuenio) {

        super(nombrePaciente, edadAnios, nombreDuenio);

    }

    @Override
    public long calcularCostoConsulta() {
        return 35000L;
    }
}