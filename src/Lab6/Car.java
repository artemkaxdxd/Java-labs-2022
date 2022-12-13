package Lab6;

public class Car {
    private final String model;
    private final int petrolPer100Km;

    private final int price;

    private final int speedKmPerH;

    public Car(String model, int petrolPer100Km, int price, int speedKmPerH) {
        this.model = model;
        this.petrolPer100Km = petrolPer100Km;
        this.price = price;
        this.speedKmPerH = speedKmPerH;
    }

    public String getModel() {
        return model;
    }

    public int getPetrolPer100Km() {
        return petrolPer100Km;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeedKmPerH() {
        return speedKmPerH;
    }

    public String showData() {
        return String.format("Model: %s | Petrol/100km: %d | Price: %d | Speed(km/h): %d", getModel(), getPetrolPer100Km(), getPrice(), getSpeedKmPerH());
    }
}
