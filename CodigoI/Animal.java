class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void emitirSonido() {
        System.out.println("El " + especie + " emite un sonido.");
    }
}