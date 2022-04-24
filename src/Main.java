import controllers.PurchaseController;
import models.Purchase;
import views.PurchaseView;

public class Main {
    public static void main(String[] args) {

            Purchase model = new Purchase();
            PurchaseView view = new PurchaseView(model);
            PurchaseController controller = new PurchaseController(model, view);
            // Запуск программы/приложения
            controller.runApp();
    }
}
