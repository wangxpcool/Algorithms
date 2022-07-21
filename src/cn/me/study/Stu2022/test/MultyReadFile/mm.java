package cn.me.study.Stu2022.test.MultyReadFile;

import java.io.*;

public class mm {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.start();
        myThread2.start();

    }

    static class MyThread extends Thread{

        @Override
        public void run() {

            // 使用ArrayList来存储每行读取到的字符串
            try {
                File file = new File("E:\\1.txt");
                InputStreamReader inputReader = new InputStreamReader(new FileInputStream(file));
                BufferedReader bf = new BufferedReader(inputReader);
                // 按行读取字符串
                String str;
                while ((str = bf.readLine()) != null) {
                    Thread.sleep(3);
                    if ("11121111".equals(str)){
                        System.out.println(str);

                        Thread.sleep(3000);
                    }

                }
                bf.close();
                inputReader.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}

