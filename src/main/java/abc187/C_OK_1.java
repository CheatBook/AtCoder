package abc187;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_OK_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, String> S = new HashMap();

        for (int i = 0; i < N; i++) {

            String tempS = scanner.next();
            S.put(tempS, tempS);
            if (tempS.charAt(0) == '!') {
                tempS = tempS.substring(1);
            } else {
                tempS = "!" + tempS;
            }
            if (S.get(tempS) != null) {
                if (tempS.charAt(0) == '!') {
                    tempS = tempS.substring(1);
                }
                System.out.println(tempS);
                System.exit(0);
            }
        }
        System.out.println("satisfiable");
    }
}
