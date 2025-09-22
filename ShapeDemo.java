import java.util.Scanner;
abstract class Shape{
   int dim1,dim2;
   Shape(int d1, int d2){
      dim1=d1;
      dim2=d2;
   }
   abstract void printArea();
}
class Rectangle extends Shape{
   Rectangle(int length, int breadth){
      super(length,breadth);
   }
   void printArea(){
      int area=dim1*dim2;
      System.out.println("Area of Rectangle:"+area);
   }
}
class Triangle extends Shape{
   Triangle(int base, int height){
      super(base,height);
   }
   void printArea(){
      double area=0.5*dim1*dim2;
      System.out.println("Area of Triangle:"+area);
   }
}
class Circle extends Shape{
   Circle(int radius){
      super(radius,0);
   }
   void printArea(){
      double area=Math.PI*dim1*dim1;
      System.out.println("Area of Circle:"+area);
   }
}
public class ShapeDemo{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter length of rectangle:");
       int l=sc.nextInt();
       System.out.print("Enter length of rectangle:");
       int b=sc.nextInt();
       Rectangle r=new Rectangle(l,b);
       r.printArea();
       System.out.print("Enter base:");
       int ba=sc.nextInt();
       System.out.print("Enter height:");
       int h=sc.nextInt();
       Triangle t=new Triangle(ba,h);
       t.printArea();
       System.out.print("Enter radius:");
       int rad=sc.nextInt();
       Circle c=new Circle(rad);
       c.printArea();
       sc.close();
   }
}
