package Questões;
import java.util.Scanner;
public class Questão05 {
    //Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtMaior = 0;
        int qtMenor = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a idade");
            int idade = ler.nextInt();
            if (idade >= 18) {
                // qtMaior = qtMaior + 1;
                qtMaior++;
            } else {
                qtMenor++;
            }
        }
        System.out.println(qtMaior + " são maior de idade");
        System.out.println(qtMenor + " são menor de idade");
        ler.close();
    }
}
