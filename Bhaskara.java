import java.util.*;
 
public class Bhaskara{
 
    public static void main(String[] args) {
 
        int a, b, c;
        double delta, x1, x2;
        System.out.println("Insira os valores: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
 
        delta = Math.sqrt((b * b) + (-4 * (a * c)));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
 
            x1 = ((-(b) + delta) / 2 * a);
            x2 = ((-(b) - delta) / 2 * a);
 
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
 
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }
    }
 
}
