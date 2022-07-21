package cn.me.study.Stu2022.test.NioOpFile;

import java.io.*;

public class TestWrite {

    static String word2048 = "1233333333333333";

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\test\\testWrite.txt");
        writeBuffer(file);



    }

    //  FileOutputStream的写入方式类似，在此略
    static void writeBuffer(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
        int i = 1000000000;
        while(i > 0) {
            //  word2048为字符串常量，刚好4800个字节
            writer.write(word2048);
            i --;
        }
        writer.close();
        fos.close();
    }


}
