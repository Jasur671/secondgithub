package org.example.problem2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem2 {


    public class Main {
        public static void main(String[] args)throws IOException {
            Scanner sc = new Scanner(new File("input.txt"));


            PrintWriter pw = new PrintWriter(new File("output.txt"));

            long A = sc.nextLong();
            long B = sc.nextLong();

            if (A > B) {

                pw.print(">");
            } else if (A < B) {
                pw.print("<");
            } else {
                pw.print("=");

            }


            pw.close();
            sc.close();
        }
    }
}
