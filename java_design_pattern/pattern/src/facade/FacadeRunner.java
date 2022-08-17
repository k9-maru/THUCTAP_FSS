package facade;

public class FacadeRunner {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();

        shopKeeper.sellStartingItem();
        shopKeeper.sellCoreItem();
        shopKeeper.sellSituationalItem();
    }
}
