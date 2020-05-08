package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    static boolean anagrams(String s1, String s2)
    {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 != n2)
            return false;

        char array1[] = s1.toCharArray();
        char array2[] = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < n1; i++) {
            if (array1[i] != array2[i])
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
	// write your code here
        
    }
}
