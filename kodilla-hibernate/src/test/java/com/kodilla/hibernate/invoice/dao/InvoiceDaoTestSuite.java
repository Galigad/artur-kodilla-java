package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
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

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        Invoice invoice = new Invoice("A1/01/01/2018", items);
        invoice.setItems(items);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //WHEN
        invoiceDao.save(invoice);
        Invoice inv = invoiceDao.findById(invoice.getId());

        //THEN
        Assert.assertNotEquals(0, inv.getId());

        //CLEANUP
        //try {
        //    invoiceDao.delete(inv);
        //} catch (Exception e) {
        //    e.getMessage();
        //}
    }
}
