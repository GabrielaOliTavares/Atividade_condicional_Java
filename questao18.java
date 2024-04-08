import java.util.Scanner;

public class ValidaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma data no formato dd/mm/aaaa:");
        String data = scanner.nextLine();
        
        // Separando o dia, mês e ano
        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
        
        // Verificando se a data é válida
        boolean dataValida = true;
        
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            dataValida = false;
        } else {
            int maxDias = 31; // máximo de dias para a maioria dos meses
            
            // Verificando se o mês tem 30 ou 31 dias
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else if (mes == 2) { // Verificando se é fevereiro
                // Se é bissexto, fevereiro tem 29 dias, caso contrário, tem 28
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
            
            // Verificando se o dia está dentro do limite para o mês
            if (dia > maxDias) {
                dataValida = false;
            }
        }
        
        // Exibindo o resultado
        if (dataValida) {
            System.out.println("A data inserida é válida.");
        } else {
            System.out.println("A data inserida é inválida.");
        }
        
        scanner.close();
    }
}
