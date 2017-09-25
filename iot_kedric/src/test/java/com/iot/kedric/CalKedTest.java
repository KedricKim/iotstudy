package com.iot.kedric;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalKedTest {

   CalKed ck;
   @Before
   public void setUpKedBF() throws Exception {
      System.out.println(ck);
      ck = new CalKed();
      System.out.println(ck);
   }

   @Test
   public void plT() {
      double result = ck.plus(10, 20);
      assertEquals(30, result, 0);
   }

   @Test
   public void minT() {
	   double result = ck.minus(10, 20);
      assertEquals(-10, result, 0);
   }

   @Test
   public void divT() {
	   double result = ck.division(101, 100);
      assertEquals(1 , result, 0);
   }

   @Test
   public void mulT() {
	   double result = ck.multiple(10, 20);
      assertEquals(200, result, 0);
   }
   @After
   public void setUpKedAF() throws Exception {
      System.out.println(ck);
      ck = null;
   }
}