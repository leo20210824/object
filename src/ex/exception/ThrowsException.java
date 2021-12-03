package ex.exception;

import java.io.IOException;

public class ThrowsException {

    static void readFile(String filepath) throws IOException {
        throw new IOException("ファイル:" + filepath + "がありませんでした" );
    }
//呼び出し
    public static void main(String[] args) {
        try {
            readFile("c:\\text.txt");

        } catch (IOException e) {
            System.out.println("ファイル読み込みに失敗しました");
            e.printStackTrace();
        }

        }
    }

