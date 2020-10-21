package com.zhai1.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class TestHelloWorld extends BaseTest{
  @Test
  public void  testEmailGenerator() {
	  RandomEmailGenerator obj = new RandomEmailGenerator();
      String email = obj.generate();
      System.out.println("执行了方法");
      Assert.assertNotNull(email);
      Assert.assertEquals(email, "feedback@yiibai.com");

  }
}
