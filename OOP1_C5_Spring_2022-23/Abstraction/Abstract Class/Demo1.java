abstract class MyClass
{
   public void disp()
   {
     System.out.println("Concrete method of parent class");
   }
   abstract public void disp2();
}

class Demo1 extends MyClass
{
   /* Must Override this method while extending
    * MyClass
    */
   public void disp2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[])
   {
       Demo1 obj = new Demo1();
       obj.disp2();
   }
}