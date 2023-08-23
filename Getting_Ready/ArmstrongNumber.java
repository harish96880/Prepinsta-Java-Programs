package Getting_Ready;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmStrongNumber(int number) {
        int n = 0;
        int original = number;
        while(original != 0) {
            n++;
            original /= 10;
        }
        original = number;
        int result = 0;
        while (original != 0) {
            result += (int)Math.pow((original % 10), n);
            original /= 10;
        }
        return  (result == number) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isArmStrongNumber(number));
    }
}
