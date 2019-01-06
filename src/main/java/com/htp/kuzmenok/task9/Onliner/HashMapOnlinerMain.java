package com.htp.kuzmenok.task9.Onliner;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class HashMapOnlinerMain {
    public static void main(String[] args) {
        Onliner onliner1 = new Onliner("Mobile Phone", 201);
        Onliner onliner2 = new Onliner("Laptop", 91);
        Onliner onliner3 = new Onliner("Tires", 0);
        Onliner onliner4 = new Onliner("Tablet", 100);
        Onliner onliner5 = new Onliner("Smart Watch", 15);
        Onliner onliner6 = new Onliner("TV-set", 150);
        Onliner onliner7 = new Onliner("PC", 85);
        Onliner onliner8 = new Onliner("Refrigerator", 217);
        Onliner onliner9 = new Onliner("Micro Oven", 18);
        Onliner onliner10 = new Onliner("Chair", 0);

        Map<String, Onliner> hashMap = new HashMap();

        hashMap.put(onliner1.getCategory(), onliner1);
        hashMap.put(onliner2.getCategory(), onliner2);
        hashMap.put(onliner3.getCategory(), onliner3);
        hashMap.put(onliner4.getCategory(), onliner4);
        hashMap.put(onliner5.getCategory(), onliner5);
        hashMap.put(onliner6.getCategory(), onliner6);
        hashMap.put(onliner7.getCategory(), onliner7);
        hashMap.put(onliner8.getCategory(), onliner8);
        hashMap.put(onliner9.getCategory(), onliner9);
        hashMap.put(onliner10.getCategory(), onliner10);

        System.out.println("Onliner categories:");
        for (Map.Entry<String, Onliner> stringOnlinerEntry : hashMap.entrySet()) {
            System.out.println(stringOnlinerEntry.getKey());
        }

        // Sort catalog by amount of items
        System.out.println("\nSorted catalog by amount of items: ");
        List<Onliner>catalogByAmount = new ArrayList<>(hashMap.values());

        catalogByAmount.sort(new Onliner());
        int max = 0; //var for max amount of items in catalog
        Onliner maxOnliner = new Onliner();
        for (Onliner onliner : catalogByAmount) {
            if (onliner.getAmount() > max) {
                max = onliner.getAmount();
                maxOnliner = onliner;
            }
            System.out.println(onliner.getAmount() + " " + onliner.getCategory());
        }

        System.out.println("\nCategory with the highest amount of items: ");
        System.out.println(maxOnliner.getAmount() + " " + maxOnliner.getCategory());

        System.out.println("\nCatalog without categories with zero items: ");
        int zero = 0; // Constant for comparison
        for (Onliner onliner : catalogByAmount) {
            if (onliner.getAmount() == zero) {
                catalogByAmount.remove(onliner);
               break; // I don't know why do i need this break, without it for remove only one zero item
            }
            System.out.println(onliner.getAmount() + " " + onliner.getCategory());
        }

    }
}
