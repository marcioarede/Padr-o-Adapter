package com.ramesh.gof.adapter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterPatternDemoTest {

    @Test
    public void teste(){

        BankDetails banco = new BankDetails();
        banco.setBankName("Banco do Brasil");

        Assert.assertTrue(banco.getBankName().length()>5);
    }
}