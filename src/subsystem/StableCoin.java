package subsystem;

public class StableCoin {
    private double value;

    public StableCoin(double value) {
        this.value = value;
    }

    private StableCoin convertEuros(double euros){
        StableCoin stableCoin = new StableCoin(euros);
        return stableCoin;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
