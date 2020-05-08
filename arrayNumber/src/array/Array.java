package array;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class Array {


    static void add(int[] number) {

        int n = number.length;

        number[n - 1] += 1;
        int carry = number[n - 1] / 10;
        number[n - 1] %= 10;

        for (int i = n - 2; i >= 0; i--) {
            if (carry == 1) {
                number[i] += 1;
                carry = number[i] / 10;
                number[i] %= 10;
            }
        }

        if (carry == 1)
            number[0] = 1;
    }


    public static void main(String[] args) {

        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        int[] number2 = new int[3];
        number2[0] = 1;
        number2[1] = 2;
        number2[2] = 0;
        int[] number3 = new int[29];
        number3[0] = 1;
        number3[1] = 2;
        number3[2] = 3;
        number3[3] = 4;
        number3[4] = 5;
        number3[5] = 6;
        number3[6] = 7;
        number3[7] = 8;
        number3[8] = 9;
        number3[9] = 1;
        number3[10] = 2;
        number3[11] = 3;
        number3[12] = 4;
        number3[13] = 5;
        number3[14] = 6;
        number3[15] = 7;
        number3[16] = 8;
        number3[17] = 9;
        number3[18] = 1;
        number3[19] = 2;
        number3[20] = 3;
        number3[21] = 4;
        number3[22] = 5;
        number3[23] = 6;
        number3[24] = 7;
        number3[25] = 8;
        number3[26] = 9;
        number3[27] = 1;
        number3[28] = 2;
        int[] number4 = new int[3];
        number4[0] = 1;
        number4[1] = 9;
        number4[2] = 9;
        int[] number5 = new int[2];
        number5[0] = 9;
        number5[1] = 9;



        add(number1);
        for (int i = 0; i < number1.length; i++)
            System.out.print(number1[i] + " ");
        System.out.println('\n');

        add(number2);
        for (int i = 0; i < number2.length; i++)
            System.out.print(number2[i] + " ");
        System.out.println('\n');

        add(number3);
        for (int i = 0; i < number3.length; i++)
            System.out.print(number3[i] + " ");

        System.out.println('\n');
        add(number4);
        for (int i = 0; i < number4.length; i++)
            System.out.print(number4[i] + " ");
        System.out.println('\n');
        add(number5);
        for (int i = 0; i < number5.length; i++)
            System.out.print(number5[i] + " ");
    }

}


