package basic.human4;


class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        basic.human4.Human[] humans = {
                new basic.human4.Human("Tom"),
                new Japanese("ひろし"),
                new basic.human4.Chinese("王"),
                new basic.human4.French("Andrée")
        };

        for (basic.human4.Human human:humans) {
            human.sayHello();
        }
    }
}