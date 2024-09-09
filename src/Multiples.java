public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 999; i++) {
            boolean divisibleByFiveOrThree = i % 3 == 0 || i % 5 == 0;

            if (divisibleByFiveOrThree) {
                count++;
            }
        }
        System.out.println(count);
    }
}
