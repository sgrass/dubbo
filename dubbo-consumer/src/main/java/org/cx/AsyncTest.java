package org.cx;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;

public class AsyncTest {

  public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
    OrderService service = (OrderService) context.getBean("orderService");
    
    //异步调用 async="true"
    DoOrderRequest req = new DoOrderRequest();
    service.doOrder(req);
    Future<DoOrderResponse> response = RpcContext.getContext().getFuture();
    System.out.println(response.get());  //response.get()阻塞
    
    System.in.read();
  }

}
