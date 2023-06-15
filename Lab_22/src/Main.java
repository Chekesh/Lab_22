public class Main {
    public static void main(String[] args) {
        Cords corss = new Cords(new Adapter() {
            @Override
            public void plugIntoSocket220() {
                System.out.println("Вилка успешно вставлена в розетку с напряжением 380V, адаптер снижает напряжение до 220V;");
            }
        });
        Socket sockett = new Socket(corss);
        sockett.supplyVoltage();
        Cords cors = new Cords(new Telephone());
        Socket socket = new Socket(cors);
        socket.supplyVoltage();

    }
}