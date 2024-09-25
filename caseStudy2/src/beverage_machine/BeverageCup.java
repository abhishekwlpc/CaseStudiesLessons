package beverage_machine;

public abstract class BeverageCup {

    private int id;
    private static int number_of_total_cups = 0;

    public BeverageCup(){
        number_of_total_cups = number_of_total_cups + 1;
        this.id = number_of_total_cups;
    }

    public abstract String getCuptype();

    public int getId(){
        return id;
    }
}
