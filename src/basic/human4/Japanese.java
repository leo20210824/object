package basic.human4;

//日本人クラス
class Japanese extends basic.human4.Human {

    public Japanese(String name) {
        super(name);//Human(name)と同じ
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}