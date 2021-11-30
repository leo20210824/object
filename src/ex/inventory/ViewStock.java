package ex.inventory;





import java.util.*;

//在庫表示
public class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> pcList = new ArrayList<>();

        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 40000, 64,"Windows10"),
                new PersonalComputer("いけだ", 2, 1, 90000, 64,"Windows11"),
                new PersonalComputer("いのうえ", 3, 1, 80000, 64,"Windows11"),
                new PersonalComputer("たむら", 4, 2, 120000, 32,"Mac"),
                new PersonalComputer("わだ", 5, 2, 30000, 32,"Windows10"),
                new PersonalComputer("くどう", 6, 2, 150000, 64,"Mac"),
                new PersonalComputer("さらど", 7, 3, 40000, 32,"Windows10"),
                new PersonalComputer("あいざわ", 8, 3, 70000, 32,"Mac")
        ));
    }
}