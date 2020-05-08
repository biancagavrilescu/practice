package practice;


import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {

    static boolean verifyPalindrome(String word) {

        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {

        String[] palindroms = new String[9];
        FileWriter fileWriter;
        FileReader fileReader;

        {
            try {
                fileReader = new FileReader("inputs");
                fileWriter = new FileWriter("palindroms.txt");

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                PrintWriter out = new PrintWriter(new BufferedWriter(fileWriter));
                String line = "";
                int i = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    palindroms[i] = line;
                    if (verifyPalindrome(line) == true) {
                        out.write(line + '\n');
                    }
                    i++;
                }
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
