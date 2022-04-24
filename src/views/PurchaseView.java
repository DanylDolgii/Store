package views;

import models.Purchase;

import java.util.Scanner;

// view
public class PurchaseView {

        Purchase model;
        String title;
        String name;
        int quantity;
        double price;
        Scanner scanner;

        // Конструктор
        public PurchaseView(Purchase model) {
            this.model = model;
        }
}
