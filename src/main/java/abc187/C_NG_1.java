import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_NG_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean isReverseString = false;
        List<String> S = new ArrayList();
        for (int i = 0; i < N; i++) {
            S.add(scanner.next());
        }
        for (int i = 0; i < S.size(); i++) {
            String tempS = S.get(i);
            if (tempS.substring(0, 1).equals("!")) {
                tempS = tempS.substring(1);
            } else {
                tempS = "!" + tempS;
            }
            for (int j = i + 1; j < S.size(); j++) {
                if (tempS.equals(S.get(j))) {
                    if (tempS.substring(0, 1).equals("!")) {
                        tempS = tempS.substring(1);
                    }
                    System.out.println(tempS);
                    isReverseString = true;
                    break;
                }
            }
            if (isReverseString) break;
        }
        if (!isReverseString) {
            System.out.println("satisfiable");
        }
    }
}
