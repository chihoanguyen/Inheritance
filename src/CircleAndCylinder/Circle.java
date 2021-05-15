package CircleAndCylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle(){
        this.color = "green";
        this.radius = 1;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return  Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2 * this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
