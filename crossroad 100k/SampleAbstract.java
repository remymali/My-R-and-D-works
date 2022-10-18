public class SampleAbstract extends AbstractSample {
    void OnText(String Text)
    {
        System.out.println(Text);
    }
    SampleAbstract()
    {
        AbstractTextScanner obj= new AbstractTextScanner(this);
        obj.scan();
    }
    public static void main(String arg[]) {
        SampleAbstract obj=new SampleAbstract();
        
    }

} 
