/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesprospace;

import java.util.Scanner;

/**
 *
 * @author ferri
 */
public class TesProspace {

    static String romanNumeral;
    static int decimalNum;

    public static void main(String[] args) {
        TesProspace rmtoD = new TesProspace();
        rmtoD.convertToDecimal();
        rmtoD.printRoman(romanNumeral);
    }

    public void convertToDecimal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        romanNumeral = scan.nextLine();
        romanNumeral = romanNumeral.toUpperCase();

        int l = romanNumeral.length();
        int num = 0;
        int previousnum = 0;
        for (int i = l - 1; i >= 0; i--) {
            char x = romanNumeral.charAt(i);
            x = Character.toUpperCase(x);
            switch (x) {
                case 'I':
                    previousnum = num;
                    num = 1;
                    break;
                case 'V':
                    previousnum = num;
                    num = 5;
                    break;
                case 'X':
                    previousnum = num;
                    num = 10;
                    break;
                case 'L':
                    previousnum = num;
                    num = 50;
                    break;
                case 'C':
                    previousnum = num;
                    num = 100;
                    break;
                case 'D':
                    previousnum = num;
                    num = 500;
                    break;
                case 'M':
                    previousnum = num;
                    num = 1000;
                    break;
            }
            if (num < previousnum) {
                decimalNum = decimalNum - num;
            } else {
                decimalNum = decimalNum + num;
            }
        }
    }

    public static void printRoman(String romanNumeral) {
        System.out.println("Roman Number " + romanNumeral + " is " + decimalNum);
    }

    public static void printDecimal(int decimalNum) {
        System.out.println("Decimal Number : " + decimalNum);
    }
}
