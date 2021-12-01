package ex.person2;

import sample.enumsample.Gender;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPerson {
    public static void main(String[] args) {
        List <Person> personList = new ArrayList<>(15);

        personList.addAll(Arrays.asList(
                new Person("やまだ", Birthplace.HOKKAIDO, Gender.MEN, 35),
                new Person("いけだ", Birthplace.HOKKAIDO, Gender.WOMEN, 26),
                new Person("いのうえ", Birthplace.FUKUOKA, Gender.MEN, 32),
                new Person("たむら", Birthplace.FUKUOKA, Gender.WOMEN, 22),
                new Person("わだ", Birthplace.TOKYO, Gender.MEN, 42),
                new Person("くどう", Birthplace.TOKYO, Gender.WOMEN, 55),
                new Person("さらど", Birthplace.OSAKA, Gender.MEN, 31),
                new Person("あいざわ", Birthplace.OSAKA, Gender.WOMEN, 44)

        ));
        System.out.println("課題1");
        personList
                .forEach(System.out::println);

        System.out.println("課題2");
        personList.stream()
       .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("課題3");
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        System.out.println(3-1);
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MEN))
                .forEach(System.out::println);

        System.out.println("課題4");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .forEach(System.out::println);

        System.out.println("課題5");
        personList.stream()
                .filter(p->p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getGender))
                .forEach(System.out::println);

        //名前リストcollect
        System.out.println("課題6");
        List<String>nameList = personList.stream()
                .map(Person::getName)//namelistをmapで持ってくる(中間操作)
                .collect(Collectors.toList());//集める
        nameList.forEach(System.out::println);


        System.out.println("課題7");//性別でグルーピングMAP＜Gender,Person＞を生成し、内容表示

        Map<Gender,List<Person>> map = personList.stream()//キーgender
                .collect(Collectors.groupingBy(Person::getGender));
        map.entrySet().stream()//entrysetはマップに渡すこと
                .map(s -> s.getKey().getJpName() + ":" + s.getValue())
        .forEach(System.out::println);//終端操作foreach

        System.out.println("課題８");//最年長を表示

        Optional<Person>person = personList.stream()//optional<person>はNULLの時は処理しない
        .filter(p -> p.getGender().equals(Gender.MEN))
                .max(Comparator.comparing(Person::getAge));

        person.ifPresent(System.out::println);

        System.out.println("課題９");

        Optional<Person> person1 = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                        .min(Comparator.comparing(Person::getAge));
                person1.ifPresent(System.out::println);

        System.out.println("課題10");

        OptionalDouble womenAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN))
                .mapToInt(Person::getAge)
                .average();
        womenAverageAge.ifPresent(a -> System.out.println("女性の平均年齢"+ a ));


        System.out.println("課題11");

        OptionalDouble menAverageAge = personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .mapToInt(Person::getAge)//計算などの処理の場合はMaptoIntにする
                .average();
        menAverageAge.ifPresent(a ->System.out.println("男性の平均年齢"+ a));


        }
}
