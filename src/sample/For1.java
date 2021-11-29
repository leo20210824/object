package sample;

public class For1 {
        public static void main(String[] args) {
            int[]array = {20,30,10,50,40};//配列の宣言
            int sum = 0;

            for (int num: array) {
                sum += num;
            }
            System.out.println(sum);
            System.out.println((double)  sum / array.length);

        }
}
