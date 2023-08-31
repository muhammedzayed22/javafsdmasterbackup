package java1;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.*;

public class fileread {
	public static void main (String[] args) throws IOException{    

        FileReader f1 = new FileReader("C:\\Users\\muhammedzayed.a\\Desktop\\z.txt");

        int i;

        while((i=f1.read())!=-1)

        {

            System.out.println((char)i);

            

        }

        

        FileWriter w1 = new FileWriter("C:\\Users\\muhammedzayed.a\\Desktop\\z.txt");

        BufferedWriter b1 = new BufferedWriter(w1);

        b1.write("Good Morning");

        b1.close();

        f1.close();

    }

}

 