import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = sc.nextInt();

        int reverseNumber = 0;
        int lastDigit = 0;

        while(num!=0){
            lastDigit = num%10;

            //This checks that the reversed number does not exceed the integer range ()
            if(reverseNumber>Integer.MAX_VALUE/10 || reverseNumber<Integer.MIN_VALUE/10){ 
                System.out.println(0);
                return;
            }
            reverseNumber = reverseNumber*10 + lastDigit;
            num = num/10;
        }

        System.out.println(reverseNumber);

        sc.close();
    }
    
}
