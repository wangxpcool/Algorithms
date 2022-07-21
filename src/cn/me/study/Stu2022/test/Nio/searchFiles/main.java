package cn.me.study.Stu2022.test.Nio.searchFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

public class main {


    public static void main(String[] args) {
        AtomicInteger atomicInteger= new AtomicInteger();
        AtomicInteger atomicInteger2= new AtomicInteger();
         Integer i=0;
        try {
            Files.walkFileTree(Paths.get("C:\\Users\\sharping\\Downloads"),new SimpleFileVisitor<>(){
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    System.out.println(dir);
                    atomicInteger.incrementAndGet();
//                    i++;
                    return super.preVisitDirectory(dir, attrs);
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    System.out.println(file);
                    atomicInteger2.incrementAndGet();
                    return super.visitFile(file, attrs);
                }
            })
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(atomicInteger);
        System.out.println(atomicInteger2);

    }

}
