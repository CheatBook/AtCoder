package abc187;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strA = Arrays.asList(scanner.next().split(""));
        List<String> strB = Arrays.asList(scanner.next().split(""));

        int a = strA.stream().mapToInt(Integer::parseInt).sum();
        int b = strA.stream().mapToInt(Integer::parseInt).sum();

        System.out.println(Math.max(a, b));
    }
}