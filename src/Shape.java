public abstract class Shape implements Comparable, Cloneable {
    protected String color;
    protected boolean filled;

    public Shape() {
        setColor("RED");
        setFilled(false);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return  "color='" + getColor() + '\'' +
                ", filled=" + isFilled() ;
    }
    public abstract double getArea();

    @Override
    public int compareTo(Object o) {
        Double mine= getArea();
        Double them= ((Shape) o).getArea();
        return mine.compareTo(them) ;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape clone=(Shape) super.clone();
        clone.setFilled(filled);
        clone.setColor(new String(color));//date.clone
        return clone;
    }
}
