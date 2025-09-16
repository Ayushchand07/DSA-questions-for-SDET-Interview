import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number: ");

     int number = sc.nextInt(); 
     BigInteger p = BigInteger.ONE;

     for(int i=1; i<=number; i++ ){
        p = p.multiply(BigInteger.valueOf(i));
     }
     System.out.println(p);
     sc.close();

    }

    
}
