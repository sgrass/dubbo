package org.cx;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadBalance {

  public static void main(String[] args) throws InterruptedException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
    
    OrderService service = (OrderService) context.getBean("orderService");
    
    DoOrderRequest req = new DoOrderRequest();
    req.setName("aaa");
    DoOrderResponse res = service.doOrder(req);
    System.out.println(res);
    
    for (int i = 0; i < 10; i++) {
      DoOrderResponse response = service.doOrder(req);
      System.out.println(response);
      TimeUnit.SECONDS.sleep(1);
    }
  }

}
