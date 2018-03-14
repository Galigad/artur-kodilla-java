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
import java.util.Arrays;
import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

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

        Invoice invoice = new Invoice("A1/01/01/2018");

        item1.setInvoices(invoice);
        item2.setInvoices(invoice);
        item3.setInvoices(invoice);
        item4.setInvoices(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //WHEN
        invoiceDao.save(invoice);

        //THEN
        int id = invoice.getId();
        Assert.assertEquals(4, id);

        //CLEANUP
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
