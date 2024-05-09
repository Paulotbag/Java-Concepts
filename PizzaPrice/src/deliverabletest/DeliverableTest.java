package deliverabletest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

import pizza.foodItems.*;
import pizza.services.*;

/**
 * Test our deliverable interface and inheritance heirarchy for the pizza shop
 * app.
 */
public class DeliverableTest {
    final static boolean THIN_CRUST = true;

    /**
     * Main entry point for testing aspects of our pizza shop app.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        /*
         * Setup some toppings for pizza's onion, cheese, double cheese, pepperoni,
         * ham, olive and green pepper
         */
        Onion onion = new Onion("Onion");
        onion.setPricePerUnit(2.0);
        onion.setQuantity(1);
        onion.setUnitsOfMeasure("1/2 CUP");

        Cheese cheese = new Cheese("Cheese");
        cheese.setPricePerUnit(2.75);
        cheese.setQuantity(1);
        cheese.setUnitsOfMeasure("1/2 CUP");

        Cheese dblCheese = new Cheese("Double Cheese");
        dblCheese.setPricePerUnit(2.75);
        dblCheese.setQuantity(2);
        dblCheese.setUnitsOfMeasure("CUP");

        Pepperoni pepperoni = new Pepperoni("Pepperoni");
        pepperoni.setPricePerUnit(3.75);
        pepperoni.setQuantity(1);
        pepperoni.setUnitsOfMeasure("CUP");

        Ham ham = new Ham("Ham");
        ham.setPricePerUnit(2.75);
        ham.setQuantity(2);
        ham.setUnitsOfMeasure("CUP");

        Olive olive = new Olive("Olive");
        olive.setPricePerUnit(1.75);
        olive.setQuantity(1);
        olive.setUnitsOfMeasure("CUP");

        GreenPepper greenPepper = new GreenPepper("GreenPepper");
        greenPepper.setPricePerUnit(2.80);
        greenPepper.setQuantity(1);
        greenPepper.setUnitsOfMeasure("CUP");

        /* Create our pizza orders */
        Pizza pizzaPesto = new Pizza(12, "pesto");
        pizzaPesto.setBasePrice(25.00);
        pizzaPesto.setThinCrust(Pizza.THIN_CRUST);
        pizzaPesto.addTopping(dblCheese);
        pizzaPesto.addTopping(pepperoni);
        pizzaPesto.addTopping(ham);
        pizzaPesto.addTopping(greenPepper);

        Pizza pizzaMarinara = new Pizza(14, "marinara");
        pizzaMarinara.setBasePrice(35.25);
        pizzaMarinara.setThinCrust(Pizza.THIN_CRUST);
        pizzaMarinara.addTopping(onion);
        pizzaMarinara.addTopping(ham);
        pizzaMarinara.addTopping(cheese);
        pizzaMarinara.addTopping(olive);

		//CODE BELLOW uses normal array
//		Deliverable[] deliverableItems = { pizzaPesto, pizzaMarinara,
//				new SudsOrder("Rollicking Root Beer", 6, 473),
//				new SudsOrder("Super Citrus Fizz", 4, 473) };
		
		
		
		//ASSIGNMENT 3 - using LinkedList and iterator
        List<Deliverable> deliverableItems = new LinkedList<>();
        deliverableItems.add(pizzaPesto);
        deliverableItems.add(pizzaMarinara);

        // Using ArrayList for sud orders
        List<SudsOrder> sudOrders = new ArrayList<>();
        sudOrders.add(new SudsOrder("Rollicking Root Beer", 6, 473));
        sudOrders.add(new SudsOrder("Super Citrus Fizz", 4, 473));

        int pizzaCount = 0;

        System.out.printf("%s %31s %12s \n", "Item-Sauce", "#/Size", "Cost"); // header.

        Iterator<Deliverable> iterator = deliverableItems.iterator();
        while (iterator.hasNext()) {
            Deliverable item = iterator.next();
            if (item instanceof Pizza) {
                pizzaCount++;
                Pizza pizza = (Pizza) item;
                int spacing = 0;
                spacing = (31 - Math.max(spacing, pizza.getTypeOfSuace().length())) + 1;
                System.out.printf("\nPizza %d-%s" + "%" + spacing + "s" + "%d %12.2f - Delivery (%11.2f) Total->>$%11.2f \n",
                        pizzaCount,
                        pizza.getTypeOfSuace(),
                        "",
                        pizza.getSizeInInches(),
                        pizza.getBasePrice(),
                        pizza.deliveryCost(),
                        pizza.totalPrice());
                for (FoodItem topping : pizza.getToppings()) {
                    spacing = (43 - Math.max(0, topping.getName().length()));
                    System.out.printf("      - %s%" + spacing + "s%.2f\n", topping.getName(), "", topping.price());
                }
            }
        }

        for (SudsOrder sudsOrder : sudOrders) {
            int spacing = 0;
            spacing = (40 - Math.max(spacing, sudsOrder.getName().length())) + 1;
            System.out.printf("\n%s%" + spacing + "s%d %12.2f\n", sudsOrder.getName(), "", sudsOrder.getNumber(), sudsOrder.deliveryCost());
        }
    }
}
	                






















		//bellow code was used using normal array - I just left it here for comparison reasons.
//		for (int i = 0; i < deliverableItems.length ; i++ ) {
//			if ((deliverableItems[i].getClass().getName()).contains("Pizza")) { //counts how many pizzas are in the order.
//				++pizzaCount;
//			}
//			if (deliverableItems[i] instanceof Pizza) { //check if the element of the array is a pizza.
//				Pizza pizza = (Pizza) deliverableItems[i];
//				int spacing = 0;
//				spacing = (31 - Math.max(spacing, pizza.getTypeOfSuace().length()))+1;
//				System.out.printf("\nPizza %d-%s" + "%" + spacing + "s" + "%d %12.2f - Delivery (%11.2f) Total->>$%11.2f \n",
//						pizzaCount,
//						pizza.getTypeOfSuace(),
//						"",
//						pizza.getSizeInInches(), 
//						pizza.getBasePrice(),
//						pizza.deliveryCost(),
//						pizza.totalPrice());
//				for (FoodItem items : pizza.getToppings()) {
//					spacing = (43 - Math.max(0, items.getName().length()));
//					System.out.printf("      - %s%" +spacing+ "s%.2f\n", items.getName(), "", items.price());//printing toppings
//				}
//			}
//			else if (deliverableItems[i] instanceof SudsOrder) {
//				SudsOrder suds = (SudsOrder) deliverableItems[i];
//				int spacing = 0;
//				spacing = (40 - Math.max(spacing, suds.getName().length()))+1;
//				System.out.printf("\n%s%" + spacing + "s%d %12.2f\n",
//						suds.getName(),
//						"",
//						suds.getNumber(),
//						suds.deliveryCost());
//			}
//		}
//		
//		
//		
//
//	}
//
//}

