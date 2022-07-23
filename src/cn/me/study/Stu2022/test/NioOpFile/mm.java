package cn.me.study.Stu2022.test.NioOpFile;

import java.io.*;

public class mm {

    public static void main(String[] args) {


        File file = new File("E:\\testWrite.txt");
        try {
            readByFis(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private static long readByFis(File file) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream(file);
        byte[] buff = new byte[4096];
        long counts = 0;
        int offset = 0;
        while ((offset = is.read(buff)) != -1) {
            counts = counts + offset;
        }
        is.close();
        return counts;
    }

}
