package org.cx;

import org.springframework.stereotype.Service;

@Service(value="orderQueryService")
public class OrderQueryServiceImpl implements OrderQueryService {

  public String doOrder(String params) {
    System.out.println(params);
    return "hello~~~";
  }

}
