package facade;

public class ShopKeeper {
    private Item startingItem;
    private Item coreItem;
    private Item situationalItem;

    public ShopKeeper(){
        startingItem = new StartingItem();
        coreItem = new CoreItem();
        situationalItem = new SituationalItem();
    }

    public void sellStartingItem(){
        System.out.println("-Starting Item-");
        startingItem.purchase();
    }

    public void sellCoreItem(){
        System.out.println("-Core Item-");
        coreItem.purchase();
    }

    public void sellSituationalItem(){
        System.out.println("-Situational Item-");
        situationalItem.purchase();
    }
}
