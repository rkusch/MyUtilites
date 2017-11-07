/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.advjava.rgk.datetime;

import static edu.wctc.advjava.rgk.datetime.DateUtilites.compareMinutesElapsed;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rkusch
 */
public class DateUtilitesTest {

    public DateUtilitesTest() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of dateToStringasyyyyMMdd method, of class DateUtilites.
     */
    @Test
    public void testDateToStringasyyyyMMdd() {
        System.out.println("dateToStringasyyyyMMdd");
        LocalDate localDate = null;
        DateUtilites instance = new DateUtilites();
        String expResult = "";
        String result = instance.dateToStringasyyyyMMdd(localDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateToStringasddMMyyyy method, of class DateUtilites.
     */
    @Test
    public void testDateToStringasddMMyyyy() {
        System.out.println("dateToStringasddMMyyyy");
        LocalDate localDate = null;
        DateUtilites instance = new DateUtilites();
        String expResult = "";
        String result = instance.dateToStringasddMMyyyy(localDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareMinutesElapsed method, of class DateUtilites.
     */
    @Test 
    public void testCompareMinutesElapsed() {
        LocalDateTime startDateTime = LocalDateTime.of(2014, 10, 10, 7, 45, 55);
        LocalDateTime endDateTime = LocalDateTime.of(2014, 10, 10, 7, 50, 55);
        long test = compareMinutesElapsed(startDateTime, endDateTime);
        assertEquals(5,test);
    }

}
