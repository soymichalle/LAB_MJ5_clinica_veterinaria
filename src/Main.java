//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main (String[] args){

        Perro perro = new Perro("Max", 4, "Carlos", "Labrador");
        Gato gato = new Gato("Luna", 2, "Mariana", true);
        Ave ave = new Ave("Piolin", 1, "Andres", 120.5);

        Animal[] animales = {perro, gato, ave};

        System.out.println(" ===== FICHAS DE LOS PACIENTES ===== ");
        for (Animal animal : animales) {
            animal.imprimirFicha();
        }
        System.out.print(" =================== ");

        System.out.println(" ===== REGISTRO DE VACUNAS ===== ");
        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println(perro.getNombrePaciente() + " tiene "
                + perro.getVacunasAplicadas() + " vacunas aplicadas.");
        System.out.println(gato.getNombrePaciente() + " tiene "
                + gato.getVacunasAplicadas() + " vacuna(s) aplicada(s).\n");
        System.out.print(" =================== ");

        Clinica clinica = new Clinica("VetCare", "Calle 10 # 20-30");
        Asegurable[] asegurables = {perro, gato, clinica};

        System.out.println(" ===== POLIZAS Y PRIMAS ANUALES ===== ");
        for (Asegurable asegurable : asegurables) {
            System.out.println("Póliza: " + asegurable.obtenerNumeroPoliza());
            System.out.printf("Prima anual: $%,.0f%n%n", asegurable.calcularPrimaSeguro());
        }
        System.out.print(" =================== ");

        Conejo conejo = new Conejo("Copito", 3, "Laura");
        Animal[] animalesConConejo = {perro, gato, ave, conejo};

        System.out.println(" ===== VERIFICACIÓN CON CONEJO ===== ");
        for (Animal animal : animalesConConejo) {
            animal.imprimirFicha();
        }
        System.out.print(" =================== ");
    }
}