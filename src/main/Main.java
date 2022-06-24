package main;

import facade.CryptoMarketFacade;
import subsystem.CryptoAsset;
import subsystem.CryptoMarket;
import subsystem.CryptoWallet;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CryptoMarketFacade cryptoMarketFacade = new CryptoMarketFacade();

        CryptoWallet myCryptoWallet = new CryptoWallet("Hilversum");

//        cryptoMarketFacade.buyCrypto("ETH", 1200, new CryptoWallet("myAddreess"));

        cryptoMarketFacade.buyCrypto("BTC", 1200, myCryptoWallet);
        cryptoMarketFacade.buyCrypto("ETH", 1200, myCryptoWallet);
        cryptoMarketFacade.buyCrypto("ADA", 1200, myCryptoWallet);
        cryptoMarketFacade.buyCrypto("BNB", 1200, myCryptoWallet);
        cryptoMarketFacade.buyCrypto("XRP", 1200, myCryptoWallet);

        System.out.println();
        for (Map.Entry<String, CryptoAsset> entry : myCryptoWallet.getCryptoAssets().entrySet()) {
            System.out.println("Coin: " + entry.getKey() + ". Value: " + entry.getValue().getAmount());
        }

    }
}
