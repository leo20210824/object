package training.bmi;

import sample.enumsample.Gender;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalcBmi {
    public static void main(String[] args) {
        List<Menber> menberList=new ArrayList<>();

        menberList.addAll(Arrays.asList(

                new Menber("やまだ",Gender.MEN,35,1.74,72.0),
                new Menber("きむら",Gender.WOMEN,28,1.65,52.6),
                new Menber("くろいわ",Gender.MEN,45,1.85,77.0),
                new Menber("わだ",Gender.WOMEN,18,1.45,38.0),
                new Menber("みねぎし",Gender.MEN,66,1.55,80.0)

        ));
        for (Menber menber:menberList){
            System.out.println(menber);
        }


    }
}
