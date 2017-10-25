/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.TypedQuery;


/**
 *
 * @author Student
 */
public class DerbyConnectionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Find customer by name: ");
        List<Customer> resultList = EntityManagerHelper.getEntityManager()
                .createNamedQuery("Customer.findByCity", Customer.class)
                .setParameter("city", "Miami").getResultList();
                //.createNamedQuery("Customer.findByName", Customer.class)
                //.setParameter("name", input.nextLine()).getResultList();
        resultList.forEach(customer -> {
            System.out.println("customer found: " + customer.toString());;
        });
        

    }

}
