package Circle;

public class Circle {
    private double radius= 5;
    private String color="pink";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public  String toString(){
        String str="This circle has radius ="+ this.radius+ ", color: "+ this.color;
        return  str;
    }

}