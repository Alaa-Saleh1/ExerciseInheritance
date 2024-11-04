package Main;

public class Square extends Rectangle {

    Square(){
        super(1.0,1.0);
    }
    Square(double side){
        super(side,side);
    }
    Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    public double getSide(){
        return getWidth();
    }

//    @Override
//    public void setWidth(double side){
//        super.setWidth(side);
//        super.setLength(side);
//    }
//
//    @Override
//    public void setLength(double side){
//        super.setWidth(side);
//        super.setLength(side);
//    }

    @Override
    public String toString(){
        return "A Square with side= "+getSide()+", which is a subclass of "+super.toString();
    }


}
