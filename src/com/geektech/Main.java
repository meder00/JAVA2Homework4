package com.geektech;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        User user1 = new User("Камера");
        User user2 = new User("Браузер");
        User user3 = new User("Телеграмм");
        User user4 = new User("Настройка");
        User user5 = new User("Пабж");

        ArrayList<User> listA = new ArrayList<>();
        listA.add(user1);
        listA.add(user2);
        listA.add(user3);
        listA.add(user4);
        listA.add(user5);
        System.out.println( " Список А " + listA);
        System.out.println("___________");


        User user6 = new User("Инстаграмм");
        User user7 = new User("Ватсап");
        User user8 = new User("Темы");
        User user9 = new User("Ютуб");
        User user10 = new User("Галерея");

        ArrayList<User> listB = new ArrayList<>();
        listB.add(user6);
        listB.add(user7);
        listB.add(user8);
        listB.add(user9);
        listB.add(user10);
        System.out.println(" Список B " + listB);
        System.out.println("___________");

        ArrayList<User> listC = new ArrayList<>();
        listC.add(listA.get(0));
        listC.add(listB.get(4));
        listC.add(listA.get(1));
        listC.add(listB.get(3));
        listC.add(listA.get(2));
        listC.add(listB.get(2));
        listC.add(listA.get(3));
        listC.add(listB.get(1));
        listC.add(listA.get(4));
        listC.add(listB.get(0));
        System.out.println(" Список C" + listC);
        System.out.println("___________");


        Iterator<User> iterator = listA.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_____________");
        iterator = listB.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_____________");
        iterator = listC.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
        System.out.println("______________");
        listC.sort(Comparator.comparing(User::getName));
        System.out.println(listC);
    }

}
