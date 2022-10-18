import java.util.Scanner;

public class helloProject{
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers");
       
        int num1=s.nextInt();
        int num2=s.nextInt();
        int sum =num1+num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }
}