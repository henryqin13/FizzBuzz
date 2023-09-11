public class Mutiples {
    public static void main(String[] args) {
        double count = 0;
        double i = 1;

        while (i <= 1000) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;
            if (divisibleby3) {
                count += 1;

            }
            else if (divisibleby5) {
                count += 1;
            }
            i += 1;
        }
        System.out.println(count);
    }


}


