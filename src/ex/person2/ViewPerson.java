package ex.person2;


import sample.enumsample.Gender;


import java.util.*;




    class ViewPerson {


    public static void main(String[] args) {
        List <Person> personList = new ArrayList<>(15);
        Map <Birthplace,List<Person>> birthplacePersonMap = new HashMap<>();

        personList.addAll(Arrays.asList(
                new Person("しむら", Birthplace.HOKKAIDO, Gender.MEN, 28),
                new Person("すどう", Birthplace.FUKUOKA, Gender.WOMEN, 34),
                new Person("そのだ", Birthplace.OSAKA, Gender.WOMEN, 21),
                new Person("さの", Birthplace.TOKYO, Gender.MEN, 42),
                new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 55),
                new Person("しむら", Birthplace.FUKUOKA, Gender.MEN, 28),
                new Person("すどう", Birthplace.OSAKA, Gender.WOMEN, 34),
                new Person("そのだ", Birthplace.TOKYO, Gender.WOMEN, 29),
                new Person("さの", Birthplace.TOKYO, Gender.MEN, 42),
                new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 55),
                new Person("しむら", Birthplace.FUKUOKA, Gender.MEN, 28),
                new Person("すどう", Birthplace.OSAKA, Gender.WOMEN, 34),
                new Person("そのだ", Birthplace.FUKUOKA, Gender.WOMEN, 21),
                new Person("さの", Birthplace.OSAKA, Gender.MEN, 42),
                new Person("せがわ", Birthplace.HOKKAIDO, Gender.WOMEN, 45)
        ));

        for (Person person:personList){
            if (birthplacePersonMap.containsKey(person.getBirthplace())){
                birthplacePersonMap.get(person.getBirthplace()).add(person);
            } else {
                List<Person> list = new ArrayList<>();
                list.add(person);
                birthplacePersonMap.put(person.getBirthplace(),list);
            }
        }


        System.out.println("分類チェック");
        for (Map.Entry entry:birthplacePersonMap.entrySet()){
            System.out.println(entry.getKey());
            for (Person person:(List<Person>)entry.getValue())
                System.out.println(person);
        }
        for (Map.Entry entry:birthplacePersonMap.entrySet()){
            double sum = 0,cnt = 0,sumMen = 0,sumWomen = 0,menCnt = 0, womenCnt = 0;
            for (Person person:(List<Person>)entry.getValue()){
                sum +=person.getAge();
                cnt++;
            if (person.getGender().equals(Gender.MEN)){
                sumMen +=person.getAge();
                menCnt ++;
            }else {
                sumWomen+=person.getAge();
                womenCnt++;
            }
            }
            System.out.println(String.format("地域:%s",((Birthplace) entry.getKey()).getName()));
            System.out.println(String.format("全体平均:%.1f歳", sum/ cnt));
            System.out.println(String.format("男性平均:%.1f歳",(sumMen / womenCnt)));
            System.out.println(String.format("女性平均:%.1f歳",(sumWomen / womenCnt)));
        }
    }
    }



