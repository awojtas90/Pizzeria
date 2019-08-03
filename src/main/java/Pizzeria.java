

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

    Pizza hawajska = new Pizza ("Pizza hawajska",25.00 );
    Pizza margerita = new Pizza ("Pizza Margerita", 20.00);
    Pizza premium = new Pizza ("Pizza Premium", 27.00);

    double totalSum = 0;

    public void order(){
        while(true){
            System.out.println("Podaj nr pizzy" +"\n" + 1 + ". " + hawajska.getNazwa()
                            +"\n" + 2 + ". " + margerita.getNazwa()
                            +"\n" + 3 + ". " + premium.getNazwa()
                            +"\n" + "Aby zakończyć wybierz 99");


            List<Pizza> listofPizza = List.of(hawajska, margerita, premium);

            Scanner scanner = new Scanner(System.in);
            int wybór =  scanner.nextInt();

            Pizza chosenPizza = listofPizza.get(wybór - 1);
            double valueofOrder = chosenPizza.getCena();
            totalSum += valueofOrder;
            System.out.println("Wybrałeś " + chosenPizza.getNazwa());
            System.out.println("Aktualna wartość zamóienia: " + totalSum);



        }
    }
}
