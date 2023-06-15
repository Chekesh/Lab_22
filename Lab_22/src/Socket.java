public class Socket{
    Cords cords;
    final public int voltage = 380;
    Socket(Cords cords){
        this.cords = cords;
    }
    public void supplyVoltage(){
        cords.plugIntoSocket380();
    }

}