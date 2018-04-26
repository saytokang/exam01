package com.my;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 테스트 주석. 
 * @author knowwheresoft
 *
 */
public class MyClassTest {

    @Test
    public void test1() {
        System.out.print("한글로.");
        System.out.print("한글로...");
        System.out.print("한글로...");
        System.out.print("한글로...");
        System.out.print("한글로...");
        System.out.print("한글로...");
        System.out.print("한글로...");
        assertTrue(true);
    }
    
    @Test
    public void test2() {
       System.out.println("1");
       System.out.println("2");
       System.out.println("3");
       assertTrue(true);
    }
    
    @Test
    public void test3() {
    	System.out.println("작업");
    	System.out.println("작업");
    	System.out.println("작업");
        assertTrue(true);
    }
    
    
}