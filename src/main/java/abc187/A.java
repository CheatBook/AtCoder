package abc187;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strA = scanner.next().split("");
        String[] strB = scanner.next().split("");

        int a = Arrays.stream(strA).mapToInt(Integer::parseInt).sum();
        int b = Arrays.stream(strB).mapToInt(Integer::parseInt).sum();

        System.out.println(Math.max(a, b));
    }
}