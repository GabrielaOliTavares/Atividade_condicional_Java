import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
numero=int(input("Digite um numero:"))
while numero>=1000:
  print("O numero precisa ser menor que mil")
  numero=int(input("Digite um numero:"))
numero=str(numero)
numero=numero[::-1]
lista=["unidade","dezena","centena"]
for i, num in enumerate(numero):
  print(num+" é "+lista[i])
print("Fim do programa")

    }
}