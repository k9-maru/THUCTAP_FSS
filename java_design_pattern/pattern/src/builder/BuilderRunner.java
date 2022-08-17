package builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Car bmw_i8 = new CarBuilder()
                .setName("bmw i8")
                .setBodyStyle("coupe")
                .setSeats(4)
                .setEngine("B38K15T0 1.5L turbocharged I3 engine gasoline")
                .build();
        System.out.println(bmw_i8.carDetails());

        Car lamborghini_huracan = new CarBuilder()
                .setName("Lamborghini Huracan")
                .setBodyStyle("coupe")
                .setSeats(2)
                .setEngine("5.2 L odd-firing V10")
                .build();
        System.out.println(lamborghini_huracan.carDetails());
    }
}
