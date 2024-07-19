package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ToDoListApp {
    public static void main(String[] args) {
    ToDoListApp app = new ToDoListApp();

    System.out.println("Honey Do List MF");
    System.out.println("-------");
    //Task 1: Instantiate an Arraylist and 3 chores
    app.addChore("Wash Dishes");
    app.addChore("Fold Laundry");
    app.addChore("Code for an Hour");

    //Task 2 Print to console
    //    System.out.println("Step 2 ");
        app.displayChores();
        System.out.println("--------");
        System.out.println();

    //  Task 3: Remove
        app.removeChores("Wash Dishes");
    //    System.out.println();
        app.displayChores();
        System.out.println("--------");

    // Task 4: Updating the Chores
        app.updateChores("Code for an Hour", "Code all day");
    //    System.out.println("After Chore 4");
        app.displayChores();

    }

    private List <String> chores;

    public ToDoListApp() {
        chores = new ArrayList<>(); //using the List interface?
    }
    //Method to add an item to the list
    public void addChore(String item) {
        chores.add(item);
    }
    //Method to display items in the list to the console
    public void displayChores() {
        for (String item :chores) {
            System.out.println(item);
        }
    }

    //Method  updating an item
    public void updateChores(String oldChore, String newChore) {
        for (int i = 0; i < chores.size(); i++) {
            if (chores.get(i).equals(oldChore)) {
                chores.set(i, newChore);
                return;
            }
        }
    }
    //Method to remove items
    public void removeChores(String Chore) {
        chores.remove(Chore);
    }






//        List <String> toDooList = new ArrayList <>();
//        toDooList.add("Wash Dishes");
//        toDooList.add("Fold Laundry");
//        toDooList.add("Code For an Hour");
//        System.out.println(toDooList);
//
//
//        toDooList.remove(0);
//        System.out.println(toDooList);

}

