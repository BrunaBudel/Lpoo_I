/*
 Construa  um  programa  que  leia  do  teclado  dois  pontos  em  um plano (x,y) 
 e informe a distância entre eles.
 */

import java.util.Scanner;
public class Plano {
    public static void main(String[] args) {
        System.out.println("Insira o X do ponto A:");
        java.util.Scanner s = new Scanner(System.in);
        double x1 = s.nextDouble();
        System.out.println("Insira o Y do ponto A:");
        double y1 = s.nextDouble();
        System.out.println("Insira o X do ponto B:");
        double x2 = s.nextDouble();
        System.out.println("Insira o Y do ponto B:");
        double y2 = s.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Distâcia = " + distancia);
    }
}
