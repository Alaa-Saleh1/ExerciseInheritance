package Main;

public class Main {
    public static void main(String[] args) {

        //Shape
        Shape s1 = new Shape();
        System.out.println(s1);
        Shape s2 = new Shape("yellow",false);
        System.out.println(s2);

        //Circle
        Circle c1=new Circle("black",true,7);
        System.out.println(c1);
        System.out.println("Area of Circle : "+c1.getArea());
        System.out.println("Perimeter of Circle : "+c1.getPerimeter());

        //Rectangle
        Rectangle r1=new Rectangle("blue",false,3,6);
        System.out.println(r1);
        System.out.println("Area of Rectangle : "+r1.getArea());
        System.out.println("Perimeter of Rectangle : "+r1.getPerimeter());

        //Square
        Square sq1 = new Square("red",true,4);
        System.out.println(sq1);
        System.out.println("Area of Square : "+sq1.getArea());
        System.out.println("Perimeter of Square : "+sq1.getPerimeter());



    }
}