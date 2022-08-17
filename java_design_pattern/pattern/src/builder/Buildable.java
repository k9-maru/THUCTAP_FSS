package builder;

public interface Buildable {
    public CarBuilder setName(String name);
    public CarBuilder setBodyStyle(String bodyStyle);
    public CarBuilder setSeats(int seats);
    public CarBuilder setEngine(String engine);

    // final step
    public Car build();
}
