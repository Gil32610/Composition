public class Main {

    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        SmartKitchen smart = new SmartKitchen(coffeeMaker,dishWasher,refrigerator);
        smart.doKitchenWork();
        smart.setKitchenState();
        smart.doKitchenWork();

        //Composition allows to use other classes to compose a more concise object.
        //Unlike Inheritance, it is flexible

//        smart.setKitchenState();
//        smart.getBrew().brewCoffee();
//        smart.getRefrigerator().orderFood();
//        smart.getDishWasher().doDishes();
//        smart.getBrew().brewCoffee();
//        smart.getRefrigerator().orderFood();
//        smart.getDishWasher().doDishes();

    }
}
