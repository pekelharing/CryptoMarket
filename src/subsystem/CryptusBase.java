package subsystem;

import java.util.HashMap;

public class CryptusBase implements Trade{
    HashMap<String, Double> cryptuStorage = new HashMap<String, Double>();
    private final String NAME = "CryptusBase";

    public CryptusBase() {
        this.cryptuStorage = storage();
    }

    private HashMap storage(){
        cryptuStorage.put("XRP", 0.42);
        cryptuStorage.put("ADA", 0.63);
        cryptuStorage.put("BNB", 287.6);
        cryptuStorage.put("ETH", 1780.8);
        cryptuStorage.put("BTC", 29960.59);
        return cryptuStorage;
    }

    @Override
    public CryptoAsset scan(Order order){
        if (cryptuStorage.containsKey(order.getCrypto()))
        {
            CryptoAsset cryptoAsset = new CryptoAsset(
                    order.getCrypto(), order.getStableCoin().getValue()/cryptuStorage.get(order.getCrypto()));
            return cryptoAsset;
        }
        else return null;
    }

    public String getNAME() {
        return NAME;
    }
}
