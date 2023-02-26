public class Programa {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Canino", "Labrador");
        miPerro.emitirSonido(); // Heredado de la clase Animal
        miPerro.ladrar(); // Propio de la clase Perro
    }
}
