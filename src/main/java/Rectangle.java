public class Rectangle {
    double width,height;
    public Rectangle(){
        width=5;
        height=5;
    }
    public Rectangle(double width, double height){
        this.width= width;
        this.height=height;
    }

    public String display(){
        return "This Rectangle: width= "+width +",height= "+ height;
    }

    public double getArea(){
        return width*height;
    }
}
