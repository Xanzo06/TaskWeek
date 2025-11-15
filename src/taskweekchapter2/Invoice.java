package taskweekchapter2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {
    public static class Item { // вложенный класс
        String description; // описание
        int quantity; // количество
        double unitPrice; // цена за 1 штуку

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;


        }

        private double getTotalPrice() {
            return quantity * unitPrice;
        }
    }

    int accountNumber;
    String nameSeller;
    String nameBuyer;
    LocalDate date = LocalDate.now();
    ArrayList<Item> items = new ArrayList<>();


    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description, quantity, unitPrice);
        items.add(newItem);
    }


    public double getTotalInvoicePrice() {
        int total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getTotalPrice();

        }
        return total;
    }

    public Invoice( int accountNumber ,String nameSeller ,String nameBuyer) {
        this.nameBuyer = nameBuyer;
        this.accountNumber = accountNumber;
        this.nameSeller = nameSeller;
    }
    public void printInvoice(){
    System.out.println("СЧЁТ-ФАКТУРА №" + accountNumber);
    System.out.println("Дата: " + date);
    System.out.println("Продавец: " + nameSeller);
    System.out.println("Покупатель: " + nameBuyer);
    System.out.println();
    System.out.println("Товары:");
        for (Item item : items) {
            System.out.println("- " + item.description + "\t" + item.quantity + " шт × " + item.unitPrice + " руб = " + item.getTotalPrice() + " руб");
        }
    System.out.println();
    System.out.println("Сумма всех товаров: " + getTotalInvoicePrice() + " руб");
    }
}
    
