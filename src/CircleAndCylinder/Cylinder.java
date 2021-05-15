package CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, String color){
        super(radius,color);
    }
    public Cylinder(double radius, String color,double height){
        super(radius, color);
        this.height = height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
