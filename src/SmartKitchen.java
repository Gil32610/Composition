public class SmartKitchen {
private CoffeeMaker brew;
private DishWasher dishWasher;
private Refrigerator refrigerator;

    public SmartKitchen(CoffeeMaker brew, DishWasher dishWasher, Refrigerator refrigerator) {
        this.brew = brew;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
    }

    public void addWater(){
        brew.setHasWorkTodo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkTodo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkTodo(true);
    }
    public void setKitchenState(){
        pourMilk();
        addWater();
        loadDishWasher();
    }

//    public CoffeeMaker getBrew() {
//        return brew;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public Refrigerator getRefrigerator() {
//        return refrigerator;
//    }

    public void doKitchenWork(){
        brew.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();
    }
}
