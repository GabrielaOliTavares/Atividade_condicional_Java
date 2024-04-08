import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um ano para verificar se é bissexto:");
        int ano = input.nextInt();


        /* Esta é uma estrutura condicional if que verifica se o ano é bissexto. Ela usa a condição de que 
        o ano é bissexto se for divisível por 4, exceto nos anos divisíveis por 100, a menos que sejam 
        também divisíveis por 400. */
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        
        input.close();
    }
}
