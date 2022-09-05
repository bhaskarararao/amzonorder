package org.example.controller;

import org.example.model.Billing;
import org.example.model.Order;
import org.example.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

     @Autowired
     orderService service;

   /* @GetMapping("/order")
    public ResponseEntity<String> getProductData(){
        String serv= service.dataService();
        return new ResponseEntity<>(serv,HttpStatus.ACCEPTED);
    }*/

    @PostMapping("/orderdetails")
    public List<Order> getOrders(@Valid @RequestBody Status status){
       System.out.println("orsedr");
        return service.getOrderDetailsBYName(status.getName());
    }

    @PostMapping("/createorder")
    public Order  createProduct(@RequestBody Order order){
        Billing bill = new Billing();
        bill.setBillingName("bhaskar");
        bill.setBillingStore("appleStore");
        order.setBilling(bill);
        Order lis  = service.saveOrderDetails(order);
        return lis;
    }


    public List<Order> getProductDetails(){
        List<Order> orderList = new ArrayList<>();


        return orderList;
    }

    private String fallback_hello() {
        return "Request fails. It takes long time to response";
    }

}
