package org.example.service;

//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.example.exception.ErrorDetails;
import org.example.model.Order;
import org.example.repositry.OrderRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.List;

@Service
public class orderService {

    @Autowired
    OrderRepositry orderRepositry;

    @Transactional
     public Order saveOrderDetails(Order order){
          Order ordData = orderRepositry.save(order);
          return ordData;
     }

     public List<Order> getOrderDetailsBYName(String name){
         //String str=null;
         //System.out.println(str.toString());
         return orderRepositry.findByName(name);
     }


/*    @HystrixCommand(fallbackMethod = "callStudentServiceAndGetData_Fallback")
    public String dataService(){
        String str=null;
        str.charAt(0);
        return "bhaskar is down";
    }*/

    @SuppressWarnings("unused")
    private String callStudentServiceAndGetData_Fallback( ) {

        System.out.println("Student Service is down!!! fallback route enabled...");

        return "CIRCUIT BREAKER ENABLED!!! No Response From Student Service at this moment. " +
                " Service will be back shortly - " + new Date();
    }
}
