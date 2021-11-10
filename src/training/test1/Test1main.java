package training.test1;

import java.util.Arrays;

public class Test1main {
    public static void main(String[] args) {
//int
        int[] array = {10,20,30};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
//String
        String[] array1 = new String[3];
        array1[0] = "hirooka";
        array1[1] = "yamada";
        array1[2] = "kamada";
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        int[] array4 = {10,20,30};
        int[] array2 = array4;
        int[] array3 = Arrays.copyOf(array4,3);

        System.out.println("array1:" + Arrays.toString(array4));
        System.out.println("array2:" + Arrays.toString(array2));
        System.out.println("array3:" + Arrays.toString(array3));

        array4[1] = 40;
        System.out.println("array1:" + Arrays.toString(array4));
        System.out.println("array2:" + Arrays.toString(array2));
        System.out.println("array3:" + Arrays.toString(array3));
    }
}
