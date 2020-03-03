public class Main {
    public static void main(String[] args) {

    Vehicles v1 = new Vehicles("biały", 4, 240, "Audi");
    Vehicles v2 = new Vehicles("zielony", 4, 300, "Porshe");

    v1.getOpisKompletny();

    v1.generateVehiclesId();
    v1.getMarka();

    v2.getOpisKompletny();
    v2.getMarka();




    }
}
