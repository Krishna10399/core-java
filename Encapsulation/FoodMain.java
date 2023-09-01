package Encapsulation;

public class FoodMain {
    public static void main(String[] args) {

        Food food = new Food();
        food.setFood("Samosa");
        System.out.println(food.getFood());
        food.setPrice(1200);
        System.out.println(food.getPrice());
    }
}
