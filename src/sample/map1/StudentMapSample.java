package sample.map1;


import sample.enumsample.Gender;

import java.util.*;

 class StudentMapSample {
     public static void main(String[] args) {

         Map<String, List<Student>> studentGroupMap = new HashMap<>(40);

         List<Student> studentList = new ArrayList<>(100);

         studentList.add(new Student("1-1", "やまだ", Gender.MEN, 60, 50, 70));
         studentList.add(new Student("1-1", "たけだ", Gender.WOMEN, 70, 100, 30));
         studentList.add(new Student("1-1", "かまだ", Gender.MEN, 100, 80, 90));
         studentList.add(new Student("1-2", "いいだ", Gender.MEN, 70, 90, 50));
         studentList.add(new Student("1-2", "やすだ", Gender.WOMEN, 60, 70, 80));
         studentList.add(new Student("1-2", "さいとう", Gender.MEN, 60, 50, 70));
         studentList.add(new Student("1-3", "いとう", Gender.WOMEN, 70, 100, 30));
         studentList.add(new Student("1-3", "ないとう", Gender.MEN, 100, 80, 90));
         studentList.add(new Student("1-3", "はしもと", Gender.MEN, 70, 90, 50));
         studentList.add(new Student("1-4", "やまもと", Gender.WOMEN, 60, 70, 80));
         studentList.add(new Student("1-4", "ささき", Gender.MEN, 60, 50, 70));
         studentList.add(new Student("1-4", "もとき", Gender.WOMEN, 70, 100, 30));
         studentList.add(new Student("1-5", "きのした", Gender.MEN, 100, 80, 90));
         studentList.add(new Student("1-5", "くどう", Gender.MEN, 70, 90, 50));
         studentList.add(new Student("1-5", "にしやま", Gender.WOMEN, 60, 70, 80));

         for (Student student : studentList) {
             if (studentGroupMap.containsKey(student.getGroup())) {

                 studentGroupMap.get(student.getGroup()).add(student);

             } else {


                 List<Student> list = new ArrayList<>();
                 list.add(student);
                 studentGroupMap.put(student.getGroup(),list);
             }
         }


         for (Map.Entry entry : studentGroupMap.entrySet()) {
             double sumJap = 0,sumMath = 0,sumEng = 0;
             for (Student student:(List<Student>)entry.getValue()) {
                 sumJap += student.getJap();
                 sumMath += student.getMath();
                 sumEng += student.getEng();
             }
             double aveJap = sumJap /((List<?>) entry.getValue()).size();
             double aveMath = sumMath /((List<?>) entry.getValue()).size();
             double aveEng = sumEng / ((List<?>) entry.getValue()).size();

             System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
         }

     }
 }