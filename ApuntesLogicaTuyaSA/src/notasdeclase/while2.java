package notasdeclase;

public class while2 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {


            i++;
            if (i % 2 == 0) {
                System.out.println(" es par   " + i);
            } else {
                System.out.println(" es impar " + i);
            }
        }
    }
}
