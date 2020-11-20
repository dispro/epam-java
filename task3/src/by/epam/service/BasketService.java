package by.epam.service;

import by.epam.entity.Ball;
import by.epam.entity.Basket;

public class BasketService {

    public double getTotalWeight(Basket basket){
        double weight = 0;
        for (Ball ball : basket.getBasket()){
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountBlueBalls(Basket basket){
        int count = 0;
        for (Ball ball : basket.getBasket()){
            if (ball.getColor().equals("blue")){
                count++;
            }
        }
        return count;
    }
}
