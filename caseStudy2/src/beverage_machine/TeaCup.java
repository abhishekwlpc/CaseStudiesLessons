package beverage_machine;

public class TeaCup extends BeverageCup implements Checkable{
    int calorie = 50;

    public TeaCup(){
        calorie =50;
    }

    public int checkCalorie(){
        return 100;
    }

    public String getCuptype(){
        return "tea";
    }
}
