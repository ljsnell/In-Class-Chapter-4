package example;

public class Box  {
	   int length, width, height;
	   public Box(int  l )     
	  {
	      length = l;
	      width = 0;
	      height = 0;
	      System.out.println("Line created...");
	   }

	   public Box( int l, int w )     {
	      length = l;
	      width = w;
	      height = 0;
	      System.out.println("Rectangle created...");
	   }
	   public Box( int l, int w, int h )
	   {
	      length = l;
	      width = w;
	      height = h;
	      System.out.println("Box created...");
	   }
	}
