package sample.equals;

public class EqualsSample {
    public EqualsSample() {
    }

    public static void main(String[] args) {
        Enployee enployee1 = new Enployee(1,"Tom");
        Enployee enployee2 = enployee1;
        Enployee enployee3 = new Enployee(2,"John");
        Enployee enployee4 = new Enployee(1,"Tom");
        Enployee2 enployee21 = new Enployee2(1,"Tom");

        //比較
        System.out.println("1 2:"+enployee1.equals(enployee2));
        System.out.println("1 3:" + enployee1.equals(enployee3));
        System.out.println("1 4:" + enployee1.equals(enployee4));
        System.out.println("1 21:" + enployee1.equals(enployee21));
    }
}
