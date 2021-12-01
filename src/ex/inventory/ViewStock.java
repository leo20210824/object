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
        // 保管倉庫ごとの在庫金額を抽出したいのでマップにする
        // storagePriceMapの初期化をする
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();

        // Key：StorageNo
        // Value：Price
        for (PersonalComputer p : pcList) {//pclistの中身から繰り返し処理を行う
            int storageNo = p.getStorageNo();//複数回使用するので変数として切り分けしている。
            if (!storagePriceMap.containsKey(storageNo)) {//Mapの中に倉庫番号（Key）が入っているかどうか
                storagePriceMap.put(storageNo, new ArrayList<>());//入っていなかった場合の処理
            }
            storagePriceMap.get(storageNo).add(p.getPrice());
        }

        // storagePriceMapの中身を表示
        System.out.println("// storagePriceMapの中身チェック");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("PC金額:" + entry.getValue());
        }

        // 保管倉庫ごとの在庫内容を抽出したいのでマップにする
        // osMapの初期化をする
        Map<Integer, ArrayList<String>> osMap = new HashMap<>();

        // Key：StorageNo
        // Value：OS
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo();
            if (!osMap.containsKey(storageNo)) {
                osMap.put(storageNo, new ArrayList<>());
            }
            osMap.get(storageNo).add(p.getOs());
        }

        // osMapの中身を表示
        System.out.println("// osMapの中身チェック");
        for (Map.Entry entry : osMap.entrySet()) {
            System.out.println("倉庫番号" + entry.getKey() + ":");
            System.out.println("OS:" + entry.getValue());
        }
    }
}