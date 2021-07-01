package com.vitelco.training;


import com.vitelco.training.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondProjectApplication.class, args);

        Customer customer = new Customer();
        customer.setFirstName("Cevat");
        customer.setLastName("Talebi");
        customer.setId(10001);

        System.out.println(customer.placeOrder());

        /*Sample sample = new Sample("abc", "+905553332211"); //Class => Object: is an instance of a class
        System.out.println(sample);*/
    }

}


