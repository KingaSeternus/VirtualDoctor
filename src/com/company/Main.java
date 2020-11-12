package com.company;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your temperature?");
        int temperature = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you have cough?");
        String or = (new Scanner(System.in).nextLine());
        if (or.equals("yes")) {
            System.out.println("Okay");
        } else {
            System.out.println("");
        }
        System.out.println("Do you have chest pain?");
        String or1 = (new Scanner(System.in).nextLine());
        if (or1.equals("yes")) {
            System.out.println("Okay");
        }else{
            System.out.println("");
        }

        if (temperature > 38) {
            System.out.println("It's not good! You have to stay home and take your medication.");
        } else if (temperature >= 36) {
            System.out.println("It's nothing serious. You can stay home for a few days.");
        }


    }
}
