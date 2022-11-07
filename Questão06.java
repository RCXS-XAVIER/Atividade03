package Questões;
import java.util.Scanner;
public class Questão06 {
    // Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.
  
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int maior = -100;
            int menor =  100;
            int soma = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite um numero");
                int num = ler.nextInt();
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
                soma = soma + num;
            }
            ler.close();
            System.out.println("Maior = " + maior);
            System.out.println("Menor = " + menor);
            System.out.println("Soma = " + soma);
            System.out.println("Média = " + (soma / 5));
            float media = soma / 5f;
            System.out.printf("Média fracionada = %.2f", media);
        }
    }


