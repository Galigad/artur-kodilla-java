package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //GIVEN
        Product phone = new Product("Phone");
        Product laptop = new Product("Laptop");
        Product tablet = new Product("Tablet");

        Item item1 = new Item(phone, new BigDecimal(599), 2);
        Item item2 = new Item(laptop, new BigDecimal(1999), 1);
        Item item3 = new Item(tablet, new BigDecimal(999), 10);
        Item item4 = new Item(phone, new BigDecimal(899), 1);

        Invoice invoice1 = new Invoice("A1/01/01/2018");

        item1.setInvoices(invoice1);
        item2.setInvoices(invoice1);
        item3.setInvoices(invoice1);
        item4.setInvoices(invoice1);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        //WHEN
        invoiceDao.save(invoice1);

        //THEN
        int id = invoice1.getId();
        Assert.assertEquals(4, id);

        //CLEANUP
        invoiceDao.delete(id);
    }
}
