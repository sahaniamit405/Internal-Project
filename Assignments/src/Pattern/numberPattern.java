package Pattern;

public class numberPattern {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = rows - i; j > 0; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= rows - i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
