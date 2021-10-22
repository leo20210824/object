package ex.person;


import sample.enumsample.Gender;

  class Person  {
    //フィールド
    private String name;//名前
    private Gender gender;//性別
    private int age;//年齢

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
      @Override
      public String toString() {
          return String.format("%s %s %d",name,gender,age);
      }



  }