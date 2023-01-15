package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name, mangaka, manga;
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Who is your favorite mangaka?");
        mangaka = input.nextLine();
        System.out.println("What is the name of your favorite manga?");
        manga = input.nextLine();
        System.out.println("My name is " + name + " and my favorite managa is " + manga + " by " + mangaka);
        System.out.println("Arnav is learning to use git and github so that he can start working on open sorce projects");
        

    }
}
