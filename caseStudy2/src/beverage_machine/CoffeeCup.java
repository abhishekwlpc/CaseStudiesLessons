package beverage_machine;

public class CoffeeCup extends BeverageCup implements Checkable{

    int calorie;

    public CoffeeCup(){
        calorie = 100;
    }

    public int checkCalorie(){
        return 150;
    }
    public String getCuptype(){
        return "coffee";
    }
}
