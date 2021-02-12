package com.pinodev.collections.sets.after;

import com.pinodev.collections.common.Product;
import com.pinodev.collections.common.Supplier;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductCatalogue implements Iterable<Product>
{
    private final Set<Product> products = new HashSet<>();

    public void addSupplier(final Supplier supplier)
    {
        products.addAll(supplier.getProducts());
    }

    @Override
    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
