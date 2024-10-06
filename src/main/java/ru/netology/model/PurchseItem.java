package ru.netology.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchseItem {

    private int itemId;
    private int itemPrice;
    private int count;

}
