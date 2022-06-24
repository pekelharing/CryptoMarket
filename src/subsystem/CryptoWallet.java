package subsystem;

import java.util.Map;
import java.util.TreeMap;

public class CryptoWallet {
    private String address;
    private Map<String, CryptoAsset> cryptoAssets;

    public CryptoWallet(String address) {
        this.address = address;
        this.cryptoAssets = new TreeMap<String, CryptoAsset>();
    }

    public String getAddress() {
        return address;
    }

    public Map<String, CryptoAsset> getCryptoAssets() {
        return cryptoAssets;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCryptoAssets(Map<String, CryptoAsset> cryptoAssets) {
        this.cryptoAssets = cryptoAssets;
    }

    @Override
    public String toString() {
        return "CryptoWallet{" +
                "address='" + address + '\'' +
                ", cryptoAssets=" + cryptoAssets +
                '}';
    }
}
