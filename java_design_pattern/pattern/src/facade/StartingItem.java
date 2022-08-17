package facade;

public class StartingItem extends Item{
    @Override
    public void purchase() {
        // logic...

        System.out.println("You bought starting item!");
    }
}
