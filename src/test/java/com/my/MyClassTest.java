package com.my;

import org.junit.Test;

import static org.junit.Assert.*;

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
        assertTrue(true);
    }
    
    @Test
    public void test2() {
    	System.out.println("작업");
        assertTrue(true);
    }
    
    
}