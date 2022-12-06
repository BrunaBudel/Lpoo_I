/*Escreva um programa que tenha como entrada do usuário, através do teclado, 
um número inteiro positivo. Imprima a série de Fibonacci (0, 1 , 1, 2, 3, 5, 8, 13, 21, ...) 
até que o número da série seja maior que o número fornecido pelo usuário. */

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int num1 = 1, num2 = 0, i = 0;
        System.out.println("Insira um número: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(num2);
        System.out.println(num1);

        while(num1<=a){
        
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);

        }
    }
}
    
