import java.util.Scanner;

public class InheritanceClassA {
    static int sum;
    InheritanceClassA()
    {
        System.out.println("Its A constructor ");
    }
    InheritanceClassA(int value)
    {
        
        System.out.println("Argument constructor of A");
    }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int a=10;
        InheritanceClassB b=new InheritanceClassB() ;
        b.DisplayB();
        b.DisplayA();
        System.out.println("Enter a number");
       int num=s.nextInt();
        
        b.sum(a,num);
        System.out.println("sum:"+sum);
        
    }
    void Display()
    {
        System.out.println("Display A class");
    
    }
    void DisplayA()
    {
        System.out.println("Welcome to class A");
    }
    void sum(int a,int b)
    {
     sum=a+b;
    }
}
