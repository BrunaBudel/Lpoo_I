
/*
 * Faça um programa que calcule o desvio padrãode um determinado número de  amostras.
 * O  número  de  amostras  deve  ser  pedido  ao  usuário  no  início  do  programa. 
 * Utilize array para armazenar as amostras. Os valores das amostras devem ser digitadas pelo usuário, uma a uma, 
 * como números decimais. 
 */
import java.util.Scanner;
public class desvioPadrão{
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			int tam = 0;
                        int i = 0;
                        double soma = 0;
                        double contador = 0;
                        double media = 0;
                        double soma2 = 0;
                        double DP = 0;
                        System.out.println("Qual a quantidade de amostras?");
                        tam = scn.nextInt();
                       
                        double amostra[] = new double[tam];
                        double aux1[]= new double[tam];
                        
                        
                        while(i < tam){
                            scn.nextLine();
                            System.out.printf("Informe a amostra número %d: ", i+1);
                            amostra[i] = scn.nextDouble();
                            i++;      
                                                    
                        }
                        i = 0;
                        while(i < tam){
                            soma += amostra[i];                           
                            contador ++;
                            i++;
                        }
                        media = soma/contador; 
                       i = 0;
                        while(i < tam){
                            aux1[i]= Math.pow(amostra[i] - media, 2);                           
                            i++;
                        }
                        i = 0;
                        while(i < tam){
                            soma2 += aux1[i];                           
                            i++;
                        } 
                        DP = Math.sqrt(soma2/contador);
                        System.out.printf("Desvio padrão: %.2f \n", DP);
                     }                             
			
			
		}
