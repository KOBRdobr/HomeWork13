package ru.zinnurov;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 13.09.2018
 */

public class Baby {

    String foodName;

    public Baby(String foodName) {
        this.foodName = foodName;
    }

    public void eatFood() {
        switch (foodName) {
            case "Суп":
                System.out.println("Спасибо мама, очень вкусно!");
                break;

            case "Мясо":
                System.out.println("Ого! Это то что я люблю!");
                break;

            case "Брокколи":
                System.out.println("Мама, я не люблю брокколи, но все равно спасибо!");
                throw new RuntimeException();
        }
    }
}

