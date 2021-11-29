package ex.inventory;





import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> personList = new ArrayList<>();

        personList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 128, 64),
                new PersonalComputer("いけだ", 2, 1, 128, 64),
                new PersonalComputer("いのうえ", 3, 1, 500, 64),
                new PersonalComputer("たむら", 4, 2, 128, 32),
                new PersonalComputer("わだ", 5, 2, 500, 32),
                new PersonalComputer("わだ", 6, 2, 256, 64),
                new PersonalComputer("わだ", 7, 3, 256, 32),
                new PersonalComputer("わだ", 8, 3, 500, 32)
        ));
    }
}