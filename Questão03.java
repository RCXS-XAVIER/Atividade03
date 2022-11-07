package Questões;
import java.util.Scanner;
public class Questão03 {
    //Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados. 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = ler.nextInt();
        System.out.println("Digite outro número");
        int n2 = ler.nextInt();
        for (int i = n1; i <= n2; i++) {
            System.out.println(">"+i);
        }
        ler.close();
    }
}

