package com.donny.decorate3.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) throws IOException {
        int c;//I know the Decorator Pattern therefore I RULE!

        InputStream in = new LowerCaseInputStream(//3.再用我们崭新的LowerCaseInputStream过滤器装饰它
                new BufferedInputStream(//2.先用BufferedInputStream装饰它，
                        new FileInputStream("/home/hadoop/test.txt")));//1.设置FileInputStream，

        while ((c = in.read()) >= 0){
            System.out.print((char) c);
        }
        in.close();
    }
}
