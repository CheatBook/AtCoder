import java.util.*;

public class C_OK_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> black = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            black.add(sc.next());
        }

        for (String s: black) {
            if(s.charAt(0) == '!') continue;

            if (black.contains("!" + s)) {
                System.out.println(s);
                System.exit(0);
            }
        }
        System.out.println("satisfiable");
    }
}