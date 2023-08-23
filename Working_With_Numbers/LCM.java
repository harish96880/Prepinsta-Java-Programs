package Working_With_Numbers;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int max = Math.max(numberOne, numberTwo);
        int lcm = 0;
        for(int i = max; i <= numberOne * numberTwo; i++) {
            if(i % numberOne == 0 && i % numberTwo == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
