package subsystem;

public class Order {

    private StableCoin stableCoin;
    private String crypto;

    public Order(StableCoin stableCoin, String crypto) {
        this.stableCoin = stableCoin;
        this.crypto = crypto;
    }

    public StableCoin getStableCoin() {
        return stableCoin;
    }

    public String getCrypto() {
        return crypto;
    }

    public void setStableCoin(StableCoin stableCoin) {
        this.stableCoin = stableCoin;
    }

    public void setCrypto(String crypto) {
        this.crypto = crypto;
    }
}
