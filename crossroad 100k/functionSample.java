import java.util.Scanner;

public class functionSample {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        static int num1 =sc.nextInt();
        static int num2 =sc.nextInt();
        int result=sum(num1,num2);
        System.out.println("Sum="+result);
    }
     static int  sum(int a,int b)
        {
            int sum= a+b;
            return sum;
        }
}
