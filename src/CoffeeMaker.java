public class CoffeeMaker extends State {
    public void brewCoffee(){
        if(this.getState()){
            System.out.println("Brewing coffee");
        }else System.out.println("Coffee was already made!");
        this.setHasWorkTodo(false);
    }
}
