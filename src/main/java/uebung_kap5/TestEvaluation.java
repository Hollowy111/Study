package uebung_kap5;

public class TestEvaluation {

    public static void main(String[] args) {

        int result = 10;

        if (result <= 0 && result >= 10) {
            switch (result) {
                case 10:
                    System.out.println("Ergebnis: Sehr Gut");
                    break;
                case 9:
                    System.out.println("Ergebnis: Gut");
                    break;
                case 8:
                    System.out.println("Ergebnis: Befriedigend");
                    break;
                case 7:
                    System.out.println("Ergebnis: Ausreichend");
                    break;
                default:
                    System.out.println("Ergebnis: Leider nicht genuegend Punkte erreicht");
            }
        } else {
            System.out.println("FEHLER: Ungueltige Punktzahl");
        }

    }
}
