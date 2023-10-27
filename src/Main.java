import business.MarketManager;
import presentation.Controller;
import presentation.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        MarketManager marketManager = new MarketManager();

        Controller controller = new Controller(menu, marketManager);
        controller.run();
    }
}
