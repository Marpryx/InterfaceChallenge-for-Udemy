package com.prykhodko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player maryna = new Player("Maryna", 3, 15, "Honda");
        System.out.println(maryna.toString());
        saveObject(maryna);

        maryna.setPoints(25);
        maryna.setCar("Suzuki");
        maryna.setLife(10);
        System.out.println(maryna.toString());
        saveObject(maryna);
        //loadObject(maryna);
        System.out.println(maryna);

        System.out.println("=================");
        ISaveable monster = new Monsters("Casper", 3, 1);
        System.out.println(monster);
        saveObject(monster);
        loadObject(monster);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


public static void saveObject(ISaveable object){
        for(int i=0; i<object.write().size(); i++){
            System.out.println(object.write().get(i) + " saved.");
        }
}

public static void loadObject(ISaveable object){
        List<String> values = readValues();
        object.read(values);
}




}
