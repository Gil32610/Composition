public class DishWasher extends State{

    public void doDishes(){
        if(this.getState()){
            System.out.println("Dishes being washed");
        }else System.out.println("No dishes to be cleaned");
        this.setHasWorkTodo(false);
    }
}
