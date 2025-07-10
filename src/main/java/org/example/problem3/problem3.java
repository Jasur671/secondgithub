package org.example.problem3;

import java.io.*;
import java.util.*;

public class problem3 {


    public class Main {
        public static void main(String[] argv) throws IOException {
            Scanner sc = new Scanner(new File("input.txt"));
            int a = sc.nextInt();
            int b = sc.nextInt();
            PrintWriter pw = new PrintWriter(new File("output.txt"));
            pw.print(a + b);
            pw.close();
        }
    }
}
