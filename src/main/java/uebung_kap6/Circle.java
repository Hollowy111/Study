package uebung_kap6;

public class Circle {
    
    //Attribute
    private double radius;
    private boolean filled;

    //Getter und Setter-Methoden
    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Konstruktoren
    Circle() {
        this(1, false);
    }

    /*Circle(double radius) {
        this(radius, false);
    }*/

    
    public Circle(double radius, boolean filled) {
        this.radius = radius;
        this.filled = filled;
    }

    //Methoden
    double getCircumference() {
        return 2 * SomeMaths.pi * radius;
    }

    double getArea() {
        
        if(isFilled()){
        return SomeMaths.pi * SomeMaths.getSquare(getRadius());
        }else{
            return 0;
        }
    }

}
