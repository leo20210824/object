package basic.sample;

public class StaticSample {
//    staticMethodのサンプル

    /**
     *
     * @param x int一つ目の整数
     * @param y int二つ目の整数
     * @return　int加算した結果
     */
    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(StaticSample.add(10,20));
    int ans = add(100,50);
        System.out.println(ans);

        }
        }