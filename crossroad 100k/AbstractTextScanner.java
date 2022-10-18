public class AbstractTextScanner{
   AbstractSample obj;
   AbstractTextScanner(AbstractSample obj)
   {
    this.obj=obj;
   }
   void scan()
   {
    String text="Scanned Text";
    obj.OnTextdetail(text);
   }
}
