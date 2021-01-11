package abc187;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();

        for (int i = 0; i < N; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                int tmpA = abs(y.get(j) - y.get(i));
                int tmpB = abs(x.get(j) - x.get(i));
                if (tmpA <= tmpB) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
