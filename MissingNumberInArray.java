import java.util.*;

public class MissingNumberInArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[]Numbers = new int[n];

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter array elements: ");

        for(int i =0; i<n; i++){
            Numbers[i] = sc2.nextInt();
        }

        int expectedSum = (n+1)*(n+2)/2;
        
        int recievedSum = 0;

        for (int i = 0; i<n; i++){
            recievedSum = recievedSum + Numbers[i];
        }

        System.out.println(expectedSum - recievedSum);

        sc.close();
        sc2.close();
    }  
}
