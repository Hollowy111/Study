package Head_First_Java;

public class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {

            /*Candidates:b = Possible output: b
            x = x + 1;
            y = y + x;*/
            
            /*Candidates:a = Possible output: f
            y=x-y;*/
            
            /*Candidates:c = Possible output: h
             y = y + 2;
            if (y > 4) {
                y = y - 1;
            }*/

            System.out.print(x + "" + y + " ");
            x = x + 1;

        }
    }
}
