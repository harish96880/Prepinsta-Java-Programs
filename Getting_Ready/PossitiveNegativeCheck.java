package Getting_Ready;

import java.util.Scanner;

public class PossitiveNegativeCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = number > 0 ? "Possitive" : "Negative";
        System.out.println(result);
    }
}
