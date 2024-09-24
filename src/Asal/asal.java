package Asal;

public class asal {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isAsal = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }

            if (isAsal) {
                System.out.println(i);
            }
        }
    }
}
