public class Main {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int resultado = calcular(num1, num2);
        exibirResultado(resultado);
    }

    public static int calcular(int a, int b) {
        return a + b;
    }

    public static void exibirResultado(int resultado) {
        System.out.println("O resultado é: " + resultado);
    }
}