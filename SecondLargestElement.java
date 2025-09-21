import java.util.Scanner;

public class SecondLargestElement {
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

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        int Second_max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] > Second_max && nums[i] != max){
                Second_max = nums[i];
            }
    }
    System.out.println("Second largest number is : " + Second_max);
}
}
