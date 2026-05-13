package com.example;

import java.io.*;

public class App {

    public static void main(String[] args) throws Exception {

        String s1 = "Venisha";
        String s2 = s1.concat("1BI23CS239");

        System.out.println("Original String: " + s1);
        System.out.println("New String: " + s2);

        FileWriter source = new FileWriter("source.txt");
        source.write("This is DevOps Lab Program");
        source.close();

        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");

        int i;

        while((i = fr.read()) != -1) {
            fw.write(i);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully");
    }
}
