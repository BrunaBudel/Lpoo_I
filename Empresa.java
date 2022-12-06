/*
 * Escreva um programa com os seguintes passos: 
 * 1) Peça ao usuário que informe quantos funcionários existem  na  empresa. 
 * 2)  Instancie  um array  de  strings  e  um array  de doubles com o tamanho informado. 
 * 3) Peça ao usuário que informe o nome eo salário de cada funcionário e armazene o nome no array de strings 
 * e o salário no array de doubles. 
 * 4) Calcule a média salarialda empresa. 
 * 5) Imprima a lista de nomes/saláriosque estão acima da média salarial.
 * Obs.: Faça o tratamento das entradas de dados. 
 * Se o usuário informar um salário  inválido,  peça  para  ele  informar  novamente.  
 * Imprima  os  salários  com  duas  casas decimais. 
 * Os nomes devem conter ao menos 3 caracteres.
 */
import java.util.Scanner;
public class Empresa{
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			int tam = 0;
                        int i = 0;
                        double soma = 0;
                        double contador = 0;
                        double media = 0;
                        
                        System.out.println("Quantos funcionários sua empresa possui?");
                        tam = scn.nextInt();
                        
                       
                        String funcionario[] = new String[tam];
                        String salarioS[] = new String[tam];
                        double salario[] = new double[tam];
                        
                        while(i < tam){
                            scn.nextLine();
                            System.out.println("Informe o nome do funcionário");
                            funcionario[i] = scn.nextLine();
                            while(funcionario[i].length() < 3){
                                System.out.println("O nome deve conter ao menos 3 caracteres");
                                funcionario[i] = scn.nextLine();
                            }
                            System.out.println("Informe o salário:");
                            salarioS[i] = scn.next();
                            while(salarioS[i].matches("[a-zA-Z]*")){
                              System.out.println("Insira um valor válido"); 
                              salarioS[i] = scn.next();
                            }
                          
                            i++;      
                                                    
                        }
                        i = 0;
                        while(i < tam){
                            salario[i] = Double.parseDouble(salarioS[i]);                           
                            i++;
                        }
                        i = 0;
                        while(i < tam){
                            soma += salario[i];                           
                            contador ++;
                            i++;
                        }
                        media = soma/contador; 
                        System.out.printf("Funcionários que ganham acima da média de R$ %.2f. \n", media );
                        i=0;
                        while(i < tam){
                            if(salario[i]>media){
                                System.out.println(funcionario[i]);
                                System.out.printf("R$ %.2f\n", salario[i]);
                            }
                            i++;
                          
                        }                             
			
			
		}
}