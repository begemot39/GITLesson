package ru.netology;

import lombok.val;
import ru.netology.model.PurchseItem;
import ru.netology.service.CartService;

import java.util.Comparator;

import static jdk.vm.ci.sparc.SPARC.o1;
import static jdk.vm.ci.sparc.SPARC.o2;

public class Main {

    public static void main(String[] args) {
//
//        val item = new PurchseItem(1, 1000, 1);
//        System.out.println( item );

        CartService service = new CartService();
        service.add( new PurchseItem(1, 1_000, 1));
        service.add( new PurchseItem(2, 4_000, 4));
        service.add( new PurchseItem(3, 6_000, 1));
        service.add( new PurchseItem(4, 7_000, 9));
        service.add( new PurchseItem(5, 9_000, 1));
        service.add( new PurchseItem(6, 8_000, 10));

        // Lambda выражение.
        System.out.println( service.sortedBy((PurchseItem o1, PurchseItem o2) -> {
            return o1.getItemPrice() - o2.getItemPrice();
        }));

        // Lambda выражение, через добавление его в переменную.
        Comparator<PurchseItem> comparator = (PurchseItem o1, PurchseItem o2) -> {
            return o1.getItemPrice() - o2.getItemPrice();
        };

        // Lambda выражение, максимально сокращённый вариант написания:
        System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));
    }
}
