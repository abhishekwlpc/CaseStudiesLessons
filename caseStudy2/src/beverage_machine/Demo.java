package beverage_machine;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        BeverageMachine cf = new BeverageMachine();
        BeverageCup b =null;

        while(true){
            System.out.println("Enter Value");
            Scanner userInput = new Scanner(System.in);

            while(!userInput.hasNext());
            String s = "";
            if(userInput.hasNext()) s = userInput.nextLine();

            if(s.startsWith("0")){
                if(s.length()>2){
                    b=cf.produceBeverage(s.substring(2,s.length()));
                    System.out.println("cup type: "+b.getCuptype());
                    System.out.println("cup id: "+ b.getId());
                }
            }

            else if(s.startsWith("1")&& s.length()==1){
                if(b instanceof CoffeeCup || b instanceof TeaCup){
                    Checkable coffee = (Checkable) b;
                    System.out.println("amount of calories in "+b.getCuptype()+"is: "+cf.getCalories(coffee));
                }
            }
            else if(s.startsWith("2")&& s.length()==1){
                System.out.println("total tea and coffee cups: "+ cf.getTotalTeaCoffee());
            }
            else{
                System.out.println("invaild input" + s);
            }
            if(!s.equals("")){
                // main code
            }
        }
    }
}
