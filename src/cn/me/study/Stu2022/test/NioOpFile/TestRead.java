package cn.me.study.Stu2022.test.NioOpFile;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestRead {

    public static void main(String[] args) {

        File file = new File("E:\\1.txt");
        try {
            readByBos(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static long readByBos(File file) throws FileNotFoundException, IOException {
        long counts = 0;
        int offset = 0;
        BufferedInputStream bos = new BufferedInputStream(new FileInputStream(file));
        byte[] buff = new byte[4096];
        while ((offset = bos.read(buff)) != -1) {
            counts = counts + offset;
        }
        bos.close();
        return counts;
    }

    private static long readByChannel(File file) throws FileNotFoundException, IOException {
        long counts = 0;
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteBuffer bbuf = ByteBuffer.allocate(2048);
        int offset = 0;
        while ((offset = fc.read(bbuf)) != -1) {
            counts = counts + offset;
            bbuf.clear();
        }
        fc.close();
        fis.close();
        return counts;
    }


}
