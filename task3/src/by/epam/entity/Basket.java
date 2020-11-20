package by.epam.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> basket;

    public Basket(Ball ...basket){
        this.basket = new ArrayList<Ball>();
        for (Ball ball : basket){
            this.basket.add(ball);
        }
    }

    public ArrayList<Ball> getBasket() {
        return basket;
    }

    public void clear(){
        this.basket.clear();
    }

    public boolean remove(Ball ball){
        int i = 0;
        for (Ball b : this.basket){
            if (b.equals(ball)){
                this.basket.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    public Ball add(Ball ball){
        this.basket.add(ball);
        return ball;
    }
}
