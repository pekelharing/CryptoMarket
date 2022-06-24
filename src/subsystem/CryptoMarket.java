package subsystem;

public class CryptoMarket {
    private CryptusBase cryptusBase;
    private Bubblinance bubblinance;

    public CryptoMarket(CryptusBase cryptusBase, Bubblinance bubblinance) {
        this.cryptusBase = cryptusBase;
        this.bubblinance = bubblinance;
    }

    public Trade scanMarkets(Order order){
        CryptoAsset fromCryptus = cryptusBase.scan(order);
        CryptoAsset fromBubblinance = bubblinance.scan(order);
        if (fromCryptus.getAmount() >= fromBubblinance.getAmount()) {
            return cryptusBase;
        } else return bubblinance;
    }

    public CryptoAsset executeOrder(Order order) {
        CryptoAsset yourAsset = scanMarkets(order).scan(order);
        return yourAsset;
    }


    public CryptusBase getCryptusBase() {
        return cryptusBase;
    }

    public Bubblinance getBubblinance() {
        return bubblinance;
    }

    public void setCryptusBase(CryptusBase cryptusBase) {
        this.cryptusBase = cryptusBase;
    }

    public void setBubblinance(Bubblinance bubblinance) {
        this.bubblinance = bubblinance;
    }
}
