package Main;

public class Circle extends Shape {
 private double radius;

 Circle(){
     this.radius = 1.0;
 }
 Circle(double radius){
     this.radius=radius;
 }
 Circle(String color,boolean filled,double radius){
     super(color,filled);
     this.radius=radius;
 }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
     double PI=3.14;
     return PI*(radius*radius);
    }

    public double getPerimeter(){
     double PI=3.14;
     return 2 * PI * radius;
    }


    @Override
    public String toString(){
     return "A Circle with radius= "+radius+", which is a subclass of "+super.toString();

    }
}

