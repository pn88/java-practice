package com.pinodev.collections.maps.before;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements
{
    public static void main(String[] args)
    {
        Product defaultProd = new Product(
            -1, "Whatever the customer wants", 100);

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, com.pinodev.collections.maps.before.ProductFixtures.door);
        idToProduct.put(2, com.pinodev.collections.maps.before.ProductFixtures.floorPanel);
        idToProduct.put(3, com.pinodev.collections.maps.before.ProductFixtures.window);

    }
}
