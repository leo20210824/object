package training;

public class Training {
    /**
     *
     *
     */
    public static void main(String[] args) {
        String string1 = "abc";
        System.out.println(string1);
//        new Training1()
        human4();

        String human6 = human5();
        System.out.println(human6);

        Training1 human7 = new Training1();
        human7.human5();//200
        System.out.println(human7.human2);//2


    }
//    VOIDはリターンしない
    private static void  human4() {

        System.out.println("100");
    }

    /**
     * 200を出力したのち1を返却する。
     * @return 1
     *
     */
    protected static String human5(){
        System.out.println("200");
        return "1";
    }




}
