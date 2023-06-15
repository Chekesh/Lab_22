public class Cords implements Insert{
    Adapter adapter;
    Cords(Adapter adapter){
        this.adapter = adapter;
    }
    @Override
    public void plugIntoSocket380(){
        adapter.plugIntoSocket220();
    }
}
