package Main;

public class Rectangle extends Shape {
    private double width;
    private double length;


    Rectangle(double side, double v){
        super();
        this.width = 1.0;
        this.length = 1.0;

    }
    Rectangle(String color,boolean filled,double width,double length){
        super(color,filled);
        this.width=width;
        this.length=length;

    }

    public void setWidth(double width) {

        this.width = width;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getWidth() {

        return this.width;
    }

    public double getLength() {

        return this.length;
    }



    public double getArea(){
        return this.length * this.width ;
    }

    public double getPerimeter(){

        return 2 * (this.length + this.width);
    }
    public String toString(){
        return "A Rectangle with width= "+width+" and length= "+length+", which is a subclass of "+super.toString();
    }
}

