package ru.netology.service;

import ru.netology.model.PurchseItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CartService {
    private final List<PurchseItem> items = new ArrayList<>();

    public void add( PurchseItem item ) {

        items.add( item );
    }

    public List<PurchseItem> sortedBy(Comparator<PurchseItem> comparator) {

        List<PurchseItem> result = new LinkedList<>(items);
        result.sort(comparator);
        return result;
    }
}
