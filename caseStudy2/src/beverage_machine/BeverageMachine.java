package beverage_machine;

import java.util.ArrayList;

public class BeverageMachine {
    ArrayList<Checkable> calorie_drinks;

    public BeverageMachine(){
        calorie_drinks = new ArrayList<Checkable>();
    }
    public BeverageCup produceBeverage(String type){
        BeverageCup cup = null;

        if(type.equals("coffee")){
            CoffeeCup c_cup = new CoffeeCup();
            calorie_drinks.add(c_cup);
            cup = c_cup;
        }
        else if(type.equals("tea")){
            TeaCup c_cup = new TeaCup();
            calorie_drinks.add(c_cup);
            cup = c_cup;
        }else if(type.equals("water")){
            cup = new WaterCup();
        }
        return cup;
    }

    public int getTotalTeaCoffee(){
        return calorie_drinks.size();
    }

    public int getCalories(Checkable cup){
        return cup.checkCalorie();
    }
}
