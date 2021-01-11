package abc187;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_NG_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isReverseString = false;
        List<String> S = new ArrayList();

        for (int i = 0; i < N; i++) {
            String tempS = scanner.next();
            S.add(tempS);
            if (tempS.charAt(0) == '!') {
                tempS = tempS.substring(1);
            } else {
                tempS = "!" + tempS;
            }

            String finalTempS = tempS;
            if (S.contains(tempS)) {
                if (tempS.charAt(0) == '!') {
                    tempS = tempS.substring(1);
                }
                System.out.println(tempS);
                isReverseString = true;
            }

            if (isReverseString) break;
        }
        if (!isReverseString) {
            System.out.println("satisfiable");
        }
    }
}
