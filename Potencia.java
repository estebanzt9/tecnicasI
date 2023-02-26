public class Potencia {
    public static double potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1 / potencia(base, -exponente);
        }
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        double base = 2;
        int exponente = -3;
        double resultado = potencia(base, exponente);
        System.out.printf("%.2f ^ %d = %.2f", base, exponente, resultado);
    }
}