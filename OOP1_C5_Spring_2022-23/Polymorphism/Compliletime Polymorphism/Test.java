class Calculator
{
int add(int x, int y)
{
return x+y;
}
int add(int x, int y, int z) 
{
return x+y+z;
}
}
public class Test
{
public static void main(String args[])
{
Calculator obj = new Calculator();
System.out.println(obj.add(100, 200));
System.out.println(obj.add(100, 200, 300));
}
}