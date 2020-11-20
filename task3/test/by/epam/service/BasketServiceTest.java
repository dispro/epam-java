package by.epam.service;


import by.epam.entity.Ball;
import by.epam.entity.Basket;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BasketServiceTest {

    @Test
    public void getTotalWeightTest(){
        Basket basket = new Basket(
                new Ball("red", 0.4),
                new Ball("blue", 0.432),
                new Ball("orange", 0.35),
                new Ball("blue", 0.456),
                new Ball("blue", 0.5)
        );
        BasketService service = new BasketService();
        double actual = service.getTotalWeight(basket);
        assertEquals(actual, 2.138);
    }
    
    
    @Test
    public void getCountBlueBallsTest(){

        Basket basket = new Basket(
                new Ball("red", 0.4),
                new Ball("blue", 0.432),
                new Ball("orange", 0.35),
                new Ball("blue", 0.456),
                new Ball("blue", 0.5)
        );
        BasketService service = new BasketService();
        int actual = service.getCountBlueBalls(basket);
        assertEquals(actual, 3);
    }
}
