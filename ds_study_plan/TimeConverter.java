package com.example.demo.leetcode.ds_study_plan;


import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {
    public static void main(String[] args) throws ParseException {
        DateTimeFormatter globalFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' HH:mma z");
        DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' HH:mma 'ET'");

        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");


        ZonedDateTime currentISTime = ZonedDateTime.now(); // "Asia/Kolkata"
        ZonedDateTime asiaZonedDateTime = currentISTime.withZoneSameInstant(singaporeZoneId);
        ZonedDateTime currentETime = currentISTime
                .withZoneSameInstant(ZoneId.of("America/New_York")); //ET Time

        System.out.println(etFormat.format(currentISTime));
        System.out.println(etFormat.format(currentETime));
        System.out.println(etFormat.format(asiaZonedDateTime));
    }
}
