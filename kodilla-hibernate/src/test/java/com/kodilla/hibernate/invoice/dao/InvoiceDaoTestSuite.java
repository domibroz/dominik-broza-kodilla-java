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

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Pencil");
        Product product2 = new Product("Rubber");
        Product product3 = new Product("Scissors");
        Item item1 = new Item(new BigDecimal(1.20), 2, new BigDecimal(2.40));
        product1.getItem().add(item1);
        Item item2 = new Item(new BigDecimal(1.00), 5, new BigDecimal(5));
        product2.getItem().add(item2);
        Item item3 = new Item(new BigDecimal(5.20), 1, new BigDecimal(5.20));
        product3.getItem().add(item3);

        Invoice invoice = new Invoice("2/02/18");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        //when
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //then
        Assert.assertNotEquals(0, id);

        //cleanUp
        // invoiceDao.delete(id);
    }
}
