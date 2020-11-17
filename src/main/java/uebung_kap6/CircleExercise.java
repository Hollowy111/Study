package uebung_kap6;

public class CircleExercise {

    public static void main(String[] args) {
        Circle firstCircle = new Circle(3, true);
        Circle secondCircle = new Circle(8, false);
        Circle thirdCircle = new Circle(5, true);

        System.out.printf("1. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n", 
                firstCircle.getRadius(),
                firstCircle.getCircumference(),
                firstCircle.getArea());
        System.out.println();
        System.out.printf("2. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n", 
                secondCircle.getRadius(),
                secondCircle.getCircumference(),
                secondCircle.getArea());
        System.out.println();
        System.out.printf("3. Kreis:%nRadius: %g%nUmfang: %g%nFlaeche: %g%n", 
                thirdCircle.getRadius(),
                thirdCircle.getCircumference(),
                thirdCircle.getArea());

    }

}
