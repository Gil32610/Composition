public class Refrigerator extends State{

    public void orderFood(){
        if(this.getState()){
            System.out.println("Buying more supplies");
        }else System.out.println("No supplies needed");
        this.setHasWorkTodo(false);
    }
}
