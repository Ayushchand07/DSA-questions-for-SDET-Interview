import java.util.Scanner;
public class PrintEvenLengthWordsFromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");

        for (int i = 0; i<=arr.length-1; i++){
            if(arr[i].length()%2 == 0 ){
                System.out.println(arr[i]);
            }
        }

    }
    
}
