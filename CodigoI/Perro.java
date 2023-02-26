class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("El " + especie + " de raza " + raza + " está ladrando.");
    }
}

//super dentro del constructor de la clase principal