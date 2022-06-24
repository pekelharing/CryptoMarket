package subsystem;

public class CryptoAsset {

    private String cryptoName;
    private double amount;

    public CryptoAsset(String cryptoName, double amount) {
        this.cryptoName = cryptoName;
        this.amount = amount;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public double getAmount() {
        return amount;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
