package ex.exception;



public class ArrayException {
    public static void main(String[] args) {
        int n[] = {1, 2, 3};
        System.out.println("開始");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(n[i]); }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();//どこでエラーが出たか見る為
            System.out.println("配列の範囲が超えています");
        } finally {
            System.out.println("終了");
        }
    }
}
