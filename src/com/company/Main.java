package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String cAnswer = "";

        boolean looper = true;
        while(looper)
            System.out.println("What are you putting in to be converted?");
            System.out.println("The options are RBG, HTML or hexadecimal");
            try{
                cAnswer = sc1.nextLine().toLowerCase();
                if(cAnswer.equals("html") || cAnswer.equals("rgb") || cAnswer.equals("hexadecimal"))
                    looper = false;
            }catch(){
                System.out.println("Invalid input");
            }
        Scanner sc2 = new Scanner(System.in);
        if(cAnswer.equals("html")){

        }else if(cAnswer.equals("rgb")){

        }else if(cAnswer.equals("hexadecimal")){

        }else
            System.out.println("Ok man how the heck did you get here look just go back and try again");
    }
}
