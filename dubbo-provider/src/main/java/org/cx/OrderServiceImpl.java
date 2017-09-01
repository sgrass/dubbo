package org.cx;

import org.springframework.stereotype.Service;

@Service(value="orderService")
public class OrderServiceImpl implements OrderService {

  public DoOrderResponse doOrder(DoOrderRequest request) {
    System.out.println("曾经来过：" + request);
    
    DoOrderResponse response = new DoOrderResponse();
    response.setCode("1000");
    response.setMemo("处理成功");
    
    return response;
  }

}
