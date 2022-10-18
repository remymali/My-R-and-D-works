import java.util.Scanner;

public class IfSample {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        // if (num>0) {
        //     System.out.println("Number is positive");
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        for(int i=0;i<10;i++)
        {
            System.out.println(num+i);
        }

    }
}
