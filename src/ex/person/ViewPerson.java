package ex.person;


import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

 public class ViewPerson {
     public static void main(String[] args) {
         List<Person> personList = new ArrayList<>();
         personList.addAll(Arrays.asList(
                 new Person("しむら", Gender.MEN, 28),
                 new Person("すどう", Gender.WOMEN, 34),
                 new Person("そのだ", Gender.WOMEN, 21),
                 new Person("さの", Gender.MEN, 42),
                 new Person("せがわ", Gender.WOMEN, 55)
         ));


         System.out.println("課題１");
         personList.forEach(System.out::println);

         personList.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));
         System.out.println("\n課題２");
         personList.forEach(System.out::println);

         personList.sort(Comparator.comparing(Person::getGender, Comparator.reverseOrder()));
         System.out.println("\n課題3");
         if (Person.getGender().equals(Gender.MEN)) {
             personList.forEach(System.out::println);
         }

     }
 }
