package com.dql.test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;


public class Test {

    private static final Pattern pattern = Pattern.compile("^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$");

    public static void main(String[] args) throws Exception {

        /*
            如果是JDK8的应用，可以使用Instant代替Date
            使用Instant时需要对时区进行设定
            LocalDateTime代替Calendar
            DateTimeFormatter代替SimpleDateFormat
         */
        Instant instant = Instant.now();
        // 设定时区
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(instant);
        System.out.println(zonedDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm;ss");
        String localDateTimeFormat = localDateTime.format(dateTimeFormatter);
        String zonedDateTimeFomat = zonedDateTime.format(dateTimeFormatter);
        System.out.println(localDateTimeFormat);
        System.out.println(zonedDateTimeFomat);

    }


}

