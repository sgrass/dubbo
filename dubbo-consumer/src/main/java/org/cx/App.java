package org.cx;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
    
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
    
    OrderService service = (OrderService) context.getBean("orderService");
    
    OrderQueryService orderQueryservice = (OrderQueryService) context.getBean("orderQueryService");
    System.out.println(orderQueryservice.doOrder("aaaa"));
    
    DoOrderRequest req = new DoOrderRequest();
    req.setName("aaa");
    DoOrderResponse res = service.doOrder(req);
    System.out.println(res);

   
    
    
  }
}
