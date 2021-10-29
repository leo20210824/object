package training.training3;

import java.util.Random;
import java.util.Scanner;

public class TrainingView {
    public static void main(String[] args) {
        System.out.println(("[メニュー]  1:検索　2:登録　3:削除　4:変更"));
        int selected = new Scanner(System.in).nextInt(4)+1;
        switch (selected){
            case 1 :
                System.out.println("検索");
                break;
            case 2 :
                System.out.println("登録");
                break;
            case  3 :
                System.out.println("削除");
                break;
            case 4 :
                System.out.println("変更");
                break;
        }

    }
}
