package Questões;
import java.util.Scanner;
public class Questão02 {
 // Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite uma mensagem");
        String mensagem = ler.nextLine();
        System.out.println("Digite o número de vezes para essa mensagem ser apresentada.");
        int quantidade = ler.nextInt();
        int i = 1;
        while (i <= quantidade) {
            i++;
            System.out.println(mensagem);
        }

        ler.close();
    }
}
    
