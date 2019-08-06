public class Rectangle extends Shape {
    private double length=10;
    private double width=3;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        double rectangleArea=this.length*this.width;
        return rectangleArea;
    }
    public double getPerimeter(){
        double rectanglePerimeter=(this.length+this.width)*2;
        return rectanglePerimeter;
    }
    @Override
    public String toString(){
        String rectangleDescribe= "A rectangle with length= "+ getLength()+ ", width = "+ getWidth()+ ", which is a subclass of "+super.toString();
        return rectangleDescribe;
    }

}
