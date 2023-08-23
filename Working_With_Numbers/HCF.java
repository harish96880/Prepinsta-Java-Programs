package Working_With_Numbers;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int hcf = 0;
        for(int i = 1; i <= numberOne || i <= numberTwo; i++)
            if(numberOne % i == 0 && numberTwo % i == 0) hcf = i;
        System.out.println(hcf);
    }
}
