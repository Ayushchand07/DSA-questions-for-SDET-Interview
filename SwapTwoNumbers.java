public class SwapTwoNumbers{
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        // Approach 1
        int temp;
         
        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        //Approach 2     
        int x = 100;
        int y = 200 ;
        System.out.println(x);
        System.out.println(y);

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println(x);
        System.out.println(y);

        //Approach 3 --> Bitwise operations
        int p = 1000;
        int q = 2000 ;
        System.out.println(p);
        System.out.println(q);

        p = p^q;
        q = p^q;
        p = p^q;

        System.out.println(p);
        System.out.println(q);

    }
}