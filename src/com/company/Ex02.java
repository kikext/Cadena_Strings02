package com.company;
import java.util.Scanner;
/**
 * Created by 25374183p on 22/11/2016.
 */
public class Ex02 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean happy = false;
            System.out.println("Dime un texto:");
            String str = scanner.next();

            for (int i =0; i<str.length()-1;i++){

                if (str.charAt(i)=='g'){
                    if (i==0){
                        if (str.charAt(i) == str.charAt(i+1)){
                            happy = true;
                        }
                        else {
                            happy = false;
                        }
                    }
                    if (i>=1 && i<str.length())
                        if (str.charAt(i) == str.charAt(i+1) || str.charAt(i-1) == str.charAt(i)){
                            happy = true;
                        }
                        else {
                            happy=false;
                        }
                }

            }

            System.out.println(happy);

        }
    }

