import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        
        System.out.println("Calculadora:");
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        char sinal = s.next(".").charAt(0);
        
            switch (sinal) {
                case '+':
                    System.out.println(a + b);
                break;
                case '-':
                    System.out.println(a - b);
                break;
                case '/':
                    System.out.println(a / b);
                break;
                case '*':
                    System.out.println(a * b);
                break;
                default:
                System.out.println(0);
    }    
  }
}