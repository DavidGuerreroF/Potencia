public class Main {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 4;
        int resultado = potencia(n1, n2);
        System.out.println("la potencia de " + n1 + " elevado a  " + n2 + " es igual a " + resultado);
    }

    public static int potencia(int n1, int n2) {
        if (n2 == 0) {
            return 1;
        }
        if (n2 == 1) {
            return n1;
        }
        else {
            return n1 + potencia(n1, n2 - 1);
        }
    }
}
