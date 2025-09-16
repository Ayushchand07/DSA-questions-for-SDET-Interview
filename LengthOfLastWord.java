import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        
        String s = sc.nextLine();
        
        int count = 0;

        String s1 = s.trim();
        char[] arr = s1.toCharArray();

        for(int i = s1.length()-1; i>=0; i--){
            if(arr[i] != ' '){count++;}
            else{break;}
        }

        System.out.println(count);

    }
}
