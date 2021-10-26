package sample;

import java.util.Arrays;

public class StringSample {

    public static void main(String[] args) {
//分割
        String word1 = "aaa";
        System.out.println(word1.concat("bbb"));
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String)
        String sentence = "1-1,いのうえ,女,70,80,95";
        String[] date = sentence.split(",",6);
        System.out.println(Arrays.toString(date));

        //文字列の結合
        String joinWord = String.join("",date);
        System.out.println(joinWord);

        //文字の置換
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replace(char,char)
        String original = "This + is a pen.";
        String replace = original.replace("is","at");
        System.out.println(replace);

        //文字列の位置を検索する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(java.lang.String,int)
        sentence = "This is a pen.";
        int index = sentence.indexOf("is");
        System.out.println(index);//1.2
    }
}
