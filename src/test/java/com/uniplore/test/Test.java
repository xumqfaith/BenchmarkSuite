package com.uniplore.test;

import com.uniplore.benchmarksuite.controller.TestController;

public class Test {

  @org.junit.Test
  public void test() {
    TestController testController = new TestController();
    testController.toIndex();
  }
}
