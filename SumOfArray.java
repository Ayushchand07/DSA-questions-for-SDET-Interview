import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int []nums = new int[n];

        System.out.println("Enter the elements: ");

        for(int i = 0; i <n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Your array has been saved!");

        System.out.println("Sum of you array is: ");


        int sum = 0;
    for(int i = 0; i<n; i++){
        sum+=nums[i];
    }
        System.out.println(sum);
    }
}
