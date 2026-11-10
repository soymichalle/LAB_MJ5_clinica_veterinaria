public class Clinica implements Asegurable {

    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {

        if (nombre == null || nombre.isBlank()) {

            throw new IllegalArgumentException("El nombre de la clínica es obligatorio.");

        }

        if (direccion == null || direccion.isBlank()) {

            throw new IllegalArgumentException("La dirección de la clínica es obligatoria.");

        }

        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getNombre() {

        return nombre;

    }

    public String getDireccion() {

        return direccion;

    }

    @Override
    public double calcularPrimaSeguro() {
        return 5000000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase().replace(" ", "-");
    }
}