package Lesson7;

public class Main {
    public static void main(String[] args) {

        HotDrink coffee = new  HotDrink("coffee", 0.2, true, 60, 100);
        HotDrink tea = new  HotDrink("tea", 0.3, true, 75, 40);
        HotDrink capuchino = new  HotDrink("capuchino", 0.4, false, 50, 120);
        HotDrinksVendingMachine hotDrVenMach = new HotDrinksVendingMachine();
        hotDrVenMach.addHotDrinks(coffee);
        hotDrVenMach.addHotDrinks(capuchino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());

        hotDrVenMach.shopHotDrinks();
    }
}
