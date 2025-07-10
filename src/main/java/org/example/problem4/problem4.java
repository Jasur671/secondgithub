package org.example.problem4;

import java.util.*;
import java.io.*;

public class problem4 {


    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(new File("input.txt"));


            PrintWriter pw = new PrintWriter(new File("output.txt"));

            Long N = sc.nextLong();
            Long P = sc.nextLong();
            Long t = N * P;
            pw.print(t);

            pw.close();
            sc.close();
        }
    }
}
