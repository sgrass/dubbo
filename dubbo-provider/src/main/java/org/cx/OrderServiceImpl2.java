package org.cx;

import org.springframework.stereotype.Service;

@Service(value="orderService2")
public class OrderServiceImpl2 implements OrderService {

  public DoOrderResponse doOrder(DoOrderRequest request) {
    System.out.println("曾经来过版本2：" + request);
    
    DoOrderResponse response = new DoOrderResponse();
    response.setCode("1111111");
    response.setMemo("处理成功,版本2");
    
    return response;
  }

}
