package ru.zinnurov;

/**
 * @author Nail Zinnurov
 * cobratms@gmail.com
 * on 13.09.2018
 */

public class Mom {
    public static void main(String[] args) {
        Food[] food = new Food[]{
                new Food("Суп"),
                new Food("Мясо"),
                new Food("Брокколи")
        };

        Baby[] baby = new Baby[]{
                new Baby(food[0].getFood()),
                new Baby(food[1].getFood()),
                new Baby(food[2].getFood())
        };

        try {
            for(Baby i : baby) {
                i.eatFood();
            }
        } catch (RuntimeException e) {
            System.out.println("Останешься голодным ведь!");

        }
    }


}
