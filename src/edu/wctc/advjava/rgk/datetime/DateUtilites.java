/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.advjava.rgk.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author rkusch
 */
public class DateUtilites {

    public final String dateToStringasyyyyMMdd(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        return localDate.format(formatter);

    }

    public final String dateToStringasddMMyyyy(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);

    }
    
    
    public static final long compareMinutesElapsed(LocalDateTime startTime, LocalDateTime endTime) {
        long minutes = ChronoUnit.MINUTES.between(startTime, endTime);
        return minutes;

    }
    
    public static void main(String[] args) {
        LocalDateTime fromDateTime = LocalDateTime.of(2014, 10, 10, 7, 45, 55);
        LocalDateTime toDateTime = LocalDateTime.of(2014, 10, 10, 7, 50, 55);
        System.out.println(compareMinutesElapsed(fromDateTime,toDateTime));
    }
}
