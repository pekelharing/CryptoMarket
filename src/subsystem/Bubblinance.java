package subsystem;

import java.util.HashMap;

public class Bubblinance implements Trade{

    HashMap<String, Double> bubbleStorage = new HashMap<String, Double>();

    private final String NAME = "Bubblinance";

    public Bubblinance() {
        this.bubbleStorage = storage();
    }

    private HashMap storage(){
        bubbleStorage.put("XRP", 0.41);
        bubbleStorage.put("ADA", 0.61);
        bubbleStorage.put("BNB", 287.9);
        bubbleStorage.put("ETH", 1780.9);
        bubbleStorage.put("BTC", 29960.6);
        return bubbleStorage;
    }

    @Override
    public CryptoAsset scan(Order order){
        if (bubbleStorage.containsKey(order.getCrypto()))
        {
            CryptoAsset cryptoAsset = new CryptoAsset(
                    order.getCrypto(), order.getStableCoin().getValue()/bubbleStorage.get(order.getCrypto()));
            return cryptoAsset;
        }
        else return null;
    }

    public String getNAME() {
        return NAME;
    }
}
