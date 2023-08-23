package Working_With_Numbers;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        System.out.println(Integer.toOctalString(decimal));
    }
}
