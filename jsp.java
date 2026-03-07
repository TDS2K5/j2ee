public class jsp {

    public static void main(String Args[]) {
        int i, f1 = 0, f2 = 1, f3, c = 0, n = 2;

        for (i = 2; i < 10; i++) {

            f3 = f1 + f2;
            System.out.println(f3 + " ");
            f1 = f2;
            f2 = f3;
        }

        while (c < 10) {
            int p = 1;
            for (i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    p = 0;
                    break;
                }
            }
            if (p == 1) {
                System.out.print(n + " ");
                c++;
            }
            n++;

        }
    }
}
