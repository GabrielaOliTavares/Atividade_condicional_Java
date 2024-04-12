import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os valores de a, b e c da equação ax^2 + bx + c:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        
        // Verifica se a é zero
        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            System.exit(0); // Encerra o programa
        }
        
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        
        // Calcula o delta
        double delta = b * b - 4 * a * c;
        
        // Verifica se o delta é negativo
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
            System.exit(0); // Encerra o programa
        }
        
        // Verifica se o delta é igual a zero
        if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui apenas uma raiz real: " + raiz);
        } else { // Delta é positivo
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
        
        scanner.close();
    }
}
