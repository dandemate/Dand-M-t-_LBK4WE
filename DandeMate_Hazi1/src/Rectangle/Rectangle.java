package Rectangle;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.height*this.width;
    }
    
    public double getPerimeter(){
        return 2*this.height+2*this.width;
    }
    
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", Area="+getArea()+
                ", Perimeter="+getPerimeter()+
                '}';
    }
    
}
