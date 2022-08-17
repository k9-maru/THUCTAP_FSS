package builder;

public class Car{
    private String name;
    private String bodyStyle;
    private int seats;
    private String engine;

    public Car(){}

    public Car(CarBuilder carBuilder){
        this.name = carBuilder.getNameBuilder();
        this.bodyStyle = carBuilder.getBodyStyleBuilder();
        this.seats = carBuilder.getSeatsBuilder();
        this.engine = carBuilder.getEngineBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String carDetails(){
        return "name: " + this.name + "\n"
                + "type: " + this.bodyStyle + "\n"
                + "seats: " + this.seats + "\n"
                + "engine: " + this.engine + "\n";
    }
}
