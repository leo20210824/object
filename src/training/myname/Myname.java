package training.myname;

import java.util.Scanner;

public class Myname {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("名前:");
        String firstName = scanner.next();
        System.out.println("私の名前は" + firstName + "です。");

    }
}
