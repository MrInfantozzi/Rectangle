public class Rectangle {
    double height;
    double width;

    // The constructor
    public Rectangle(double H, double W){
        height = H;
        width = W;
    }

    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return 2*(height + width);
    }


}
