package javaapplication6;
public class JavaApplicantion6{
    public static void main(String[] args) { 
        TriangleObject Triangle1=new TriangleObject();
        System.out.println("A Triangle "+Triangle1.toString());
        System.out.println("The Area of Triangle is "+Triangle1.getArea());
        System.out.println("The Perimeter of Triangle is "+Triangle1.getPerimeter());
        System.out.println("The Color of Triangle is "+Triangle1.getColor());
        System.out.println("The Triangle is "+Triangle1.isFilled());
        TriangleObject Triangle2=new TriangleObject(3.0,4.0,5.0);
        Triangle1.setColor("red");
        Triangle1.setFilled(true);
        System.out.println("A Triangle "+Triangle2.toString());
        System.out.println("The Area of Triangle is "+Triangle2.getArea());
        System.out.println("The Perimeter of Triangle is "+Triangle2.getPerimeter());
        System.out.println("The Color of Triangle is "+Triangle2.getColor());
        System.out.println("The Triangle is "+Triangle2.isFilled());
    }   
}
class TriangleObject extends GeometricObject{
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
    public TriangleObject(){
    }
    public TriangleObject(double sidea,double sideb,double sidec){
        this.side1=sidea;this.side2=sideb;this.side3=sidec;
    }
    public double getArea(){
        double p=(side1+side2+side3)/2;
        return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle:side1="+side1+" side2="+side2+" side3="+side3;
    }
    public TriangleObject(String color,boolean filled){
        System.out.println("The color of Triangle is"+color+"\nThe Triangle is "+filled);
    }
}
