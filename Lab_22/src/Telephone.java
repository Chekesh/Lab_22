public class Telephone implements Adapter{
    final public int voltage = 220;

    @Override
    public void plugIntoSocket220() {
        System.out.println("Телефон заряжается с напряжением 220V благодаря адаптеру, снижающему напряжение с 380v до 220V;");
    }
}
