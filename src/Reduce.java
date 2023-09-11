public class Reduce {
    public static void main(String[] args) {
        henry_reduce(100);
    }
    public static void henry_reduce(double n) {
        double step = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
                step += 1;
            } else {
                n = n - 1;
                step += 1;
            }
        }
        System.out.println(step);
    }


}
