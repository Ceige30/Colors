package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int [] RGB = new int [3];
        boolean looper = true;
        boolean looperPrt2 = true;
        String cPick = "";
        String cAnswer = "";

        while (looper) {
            System.out.println("What are you putting in to be converted?");
            System.out.println("The options are RBG, HTML or hexadecimal");

            cPick = sc1.next().toLowerCase();
            if (cPick.equals("html")) {
                looper = false;
                System.out.println("Enter an HTML color.");
                cAnswer = sc2.nextLine().toLowerCase();
                Converter.colorIndex(cAnswer);

            } else if (cPick.equals("rgb")) {
                looper = false;
                for (int i = 0; i < RGB.length; i++) {
                    while (looperPrt2) {
                        if (i == 0) {
                            System.out.println("Enter an RGB value for Red (0-255, both numbers inclusive)");
                        } else if (i == 1) {
                            System.out.println("Enter an RGB value for Green (0-255, both numbers inclusive)");
                        } else {
                            System.out.println("Enter an RGB value for Blue (0-255, both numbers inclusive)");
                        }
                        RGB[i] = sc2.nextInt();
                        if (RGB[i] < 0 || RGB[i] > 255) {
                            System.out.println("Come on enter something between 0-255");
                        } else {
                            looperPrt2 = false;
                        }
                    }
                    looperPrt2 = true;
                }
                Converter.convertToHex(RGB);

            } else if (cPick.equals("hexadecimal")) {
                looper = false;
                while (looperPrt2) {
                    System.out.println("Enter a valid hexadecimal");
                    cAnswer = sc2.nextLine().toLowerCase();
                    if (cAnswer.length() == 6) {
                        looperPrt2 = false;
                    } else {
                        System.out.println("The hexadecimal inputted is not 6 characters in length.");
                    }
                }
                Converter.convertToRGB(cAnswer);

            } else {
                System.out.println("Please input either RBG HTML or hexadecimal not "+cPick);
            }
        }
    }
}
//Update?