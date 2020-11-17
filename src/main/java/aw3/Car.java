package aw3;

public class Car {

    public void fullThrottle(double breaks) {
        System.out.println("The car is going as fast as it can!");
        System.out.println("Breaks going to be used at "+breaks+" km/h");
        
       int a = 20;
        
    }

    public void speed(int maxSpeed, int slowspeed) {
        System.out.println("Max speed is: " +maxSpeed);
        System.out.println("Slow speed is: "+slowspeed);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle(1);
        myCar.speed(100, 10);             
    }

}
