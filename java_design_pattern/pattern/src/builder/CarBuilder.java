package builder;

public class CarBuilder implements Buildable {
    private String nameBuilder;
    private String bodyStyleBuilder;
    private int seatsBuilder;
    private String engineBuilder;

    public CarBuilder(){}

    public String getNameBuilder() {
        return nameBuilder;
    }

    public void setNameBuilder(String nameBuilder) {
        this.nameBuilder = nameBuilder;
    }

    public String getBodyStyleBuilder() {
        return bodyStyleBuilder;
    }

    public void setBodyStyleBuilder(String bodyStyleBuilder) {
        this.bodyStyleBuilder = bodyStyleBuilder;
    }

    public int getSeatsBuilder() {
        return seatsBuilder;
    }

    public void setSeatsBuilder(int seatsBuilder) {
        this.seatsBuilder = seatsBuilder;
    }

    public String getEngineBuilder() {
        return engineBuilder;
    }

    public void setEngineBuilder(String engineBuilder) {
        this.engineBuilder = engineBuilder;
    }

    @Override
    public CarBuilder setName(String name) {
        this.nameBuilder = name;
        return this;
    }

    @Override
    public CarBuilder setBodyStyle(String bodyStyle) {
        this.bodyStyleBuilder = bodyStyle;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seatsBuilder = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engineBuilder = engine;
        return this;
    }

    @Override
    public Car build(){
        return new Car(this);
    }
}
