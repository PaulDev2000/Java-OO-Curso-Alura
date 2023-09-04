public class EjercicioFactorial {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1; i < 11; i++){
            n *= i;
            System.out.println("Factorial de " + i + " = " + n);
        }
    }
}