package com.uniplore.benchmarksuite.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
   
  @RequestMapping(value = "/Test")
  public String toIndex() {
    System.out.println("maven测试");
    return "test";  
  }
}
