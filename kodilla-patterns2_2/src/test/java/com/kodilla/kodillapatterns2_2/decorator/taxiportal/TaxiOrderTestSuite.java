package com.kodilla.kodillapatterns2_2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicOrderGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        BigDecimal calculatedCost = taxiOrder.getCost();
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescr() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        String descr = theOrder.getDescription();
        assertEquals("Drive a course", descr);
    }

    @Test
    public void testTaxiNetworkGetCost(){
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost(){
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        BigDecimal theCost = taxiOrder.getCost();

        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testVipTaxiWitcChildSeatExpressGetCost(){
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        BigDecimal theCost = taxiOrder.getCost();

        assertEquals(new BigDecimal(52), theCost);
    }

    @Test
    public void testVipTaxiWitcChildSeatExpressGetDescription(){
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new VipDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);

        String descr = taxiOrder.getDescription();

        assertEquals("Drive a course by Taxi Network + variant VIP + child seat", descr);
    }
}
