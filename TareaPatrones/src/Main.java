//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("John Doe", "1234-5678-9012-3456");
        Hotel hotel = new Hotel();
        hotel.hacerReserva(cliente);
        Sistema sys = new Sistema();
        System.out.println("Hola");

    }
}