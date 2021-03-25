public class Circle extends Shape {
    protected double radius;

    public Circle() {
        radius=1;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString()+
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle clone=(Circle) super.clone();
        clone.setRadius(radius);
        return clone;
    }
/*@Override
    public Circle clone(){
        return new Circle(color,filled,radius);
    }*/

}
