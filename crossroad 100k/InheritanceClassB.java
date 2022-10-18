public class InheritanceClassB extends InheritanceClassA{
    int num=0;
    InheritanceClassB()
    {
        System.out.println("Its B constructor ");
        //Constructor of classA get invoked first then B
        //Since A is base class and B is subclasss...
    }
    InheritanceClassB(int value)
    {
       // super(10);
    System.out.println("Argument constructor of B");
    }

    public static void main(String arg[])
    {
        InheritanceClassB objB=new InheritanceClassB(10);
        objB.Display();//example of method overriding
        objB.DisplayUseSuper();
    }
    void Display()
    {
        System.out.println("Display B class");
        num=20;
        super.sum=100;
        num=num+super.sum;//using variables in base class
        System.out.println(num);

    }
    //Super key word to access function from base class we should use
    //it in a function...
    void DisplayUseSuper()
    {
        super.Display();//this function of InheritanceClassA
    }
    void DisplayB()
    {
        System.out.println("Welcome to ClassB");

    }
    }
