package ex.person2;


import sample.enumsample.Gender;


import java.util.*;

class Viewperson {


    public Viewperson() {


    public static void main(String[] args){
            Map<Birthplace, List<Person>> birthplaceListHashMap = new HashMap<>();

            List<Person> personList = new ArrayList<>(15);
            personList.addAll(Arrays.asList(
                    new Person("しむら", Birthplace.HOKKAIDO, Gender.MEN, 28),
                    new Person("すどう", Birthplace.FUKUOKA, Gender.WOMEN, 34),
                    new Person("そのだ", Birthplace.OSAKA, Gender.WOMEN, 21),
                    new Person("さの", Birthplace.TOKYO, Gender.MEN, 42),
                    new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 55),
                    new Person("しむら", Birthplace.FUKUOKA, Gender.MEN, 28),
                    new Person("すどう", Birthplace.OSAKA, Gender.WOMEN, 34),
                    new Person("そのだ", Birthplace.TOKYO, Gender.WOMEN, 21),
                    new Person("さの", Birthplace.TOKYO, Gender.MEN, 42),
                    new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 55),
                    new Person("しむら", Birthplace.FUKUOKA, Gender.MEN, 28),
                    new Person("すどう", Birthplace.OSAKA, Gender.WOMEN, 34),
                    new Person("そのだ", Birthplace.FUKUOKA, Gender.WOMEN, 21),
                    new Person("さの", Birthplace.OSAKA, Gender.MEN, 42),
                    new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 55)
            ));

            for (Person person : personList) {
                //マップに存在するクラスの生徒が出現
                if (birthplaceListHashMap.containsKey(person.getBirthplace())) {
                    //リストに追加
                    birthplaceListHashMap.get(person.getBirthplace()).add(person);
                } else {
                    //新しいキーを作成
                    //空のリストをセット
                    List<Person> list = new ArrayList<>();
                    list.add(person);
                    birthplaceListHashMap.put(person.getBirthplace(), list);
                }

            for (Map.Entry entry : birthplaceListHashMap.entrySet()) {
                System.out.println(entry.getKey());
                for (Person person : (List<Person>) entry.getValue()) {
                    System.out.println(person);
                }
                double ageSum = 0;//年齢の合計
                double cnt = 0 ;//人数
                for (Map.Entry entry:birthplacePersonMap.entrySet()) {
                    System.out.print(((Birthplace)entry.getKey()).getName());
                    ageSum = 0;//クリア
                    cnt = 0;//クリア
                    for (Person person:(List<Person>)entry.getValue()) {
                        ageSum += person.getAge();
                        cnt++;
                    }
                    System.out.println(String.format(":%.1f歳",ageSum / cnt));
                }




