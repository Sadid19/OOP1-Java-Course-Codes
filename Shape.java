import java.util.*;
import java.lang.*;
class Shape
{
	public double Width, Height;
	
	public void setHeight(double H)
	{
		Height=H;
	}
	public void setWidth(double W)
	{
		Width=W;
	}
	public double getHeight()
	{
		return Height;
	}
	public double getWidth()
	{
		return Width;
	}
	public double CalculateArea()
	{
		return getWidth()*getHeight();
	}
}
class Rectangle extends Shape
{
	public double CalculateArea()
	{
		return CalculateArea();
	}
}
class Triangle extends Rectangle
{
	public double CalculateArea()
	{
		return .5*CalculateArea();
	}
}
class Inheritet
{
	public static void main(String [] args)
	{
		Triangle obj1= new Triangle();
		obj1.setHeight(5.0);
		obj1.setWidth(10.0);
		obj1.CalculateArea();
	}
}