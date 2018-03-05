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
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //given
        Product product1 = new Product("Pencil");
        Product product2 = new Product("Rubber");
        Product product3 = new Product("Scissors");

        Item item1 = new Item(new BigDecimal(1.20), 2, new BigDecimal(2.40));
        Item item2 = new Item(new BigDecimal(1.00), 5, new BigDecimal(5));
        Item item3 = new Item(new BigDecimal(5.20), 1, new BigDecimal(5.20));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        Invoice invoice = new Invoice("6/02/18");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        Invoice returnedInvoice = invoiceDao.save(invoice);
        int id = returnedInvoice.getId();
        int productId = product1.getId();

        //then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(3, returnedInvoice.getItems().size());

        //cleanUp
        invoiceDao.delete(id);

        //then
        //check if product removed after invoice deleted
        //if not assertion true
        Assert.assertEquals(product1.getName(), productDao.findOne(productId).getName());


    }
}
