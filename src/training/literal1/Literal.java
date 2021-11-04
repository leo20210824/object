package training.literal1;

//リテラルの書き方
public class Literal {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40};//配列の宣言
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("MAX:" + max);
        System.out.println("MIN" + min);
    }
}