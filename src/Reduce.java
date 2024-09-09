public class Reduce {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 100; i > 0; counter++) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i--;
            }
        }
        System.out.println(counter);
    }
}
