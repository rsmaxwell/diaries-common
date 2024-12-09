package com.rsmaxwell.diaries.common.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeParser {

    public static int parseTimeToSeconds(String input) {
        // Regular expression to match hours (h), minutes (m), and seconds (s)
        Pattern pattern = Pattern.compile("(?:(\\d+)h)?(?:(\\d+)m)?(?:(\\d+)s)?");
        Matcher matcher = pattern.matcher(input);
        
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid time format");
        }

        // Parse the values or set them to 0 if missing
        String hoursString = matcher.group(1);
        String minutesString = matcher.group(2);
        String secondsString = matcher.group(3);

        int hours = hoursString != null ? Integer.parseInt(hoursString) : 0;
        int minutes = minutesString != null ? Integer.parseInt(minutesString) : 0;
        int seconds = secondsString != null ? Integer.parseInt(secondsString) : 0;

        // Calculate total seconds
        return (hours * 3600) + (minutes * 60) + seconds;
    }

    public static void main(String[] args) {
        String input = "1h2m3s";  // Example input
        int totalSeconds = parseTimeToSeconds(input);
        System.out.println("Total seconds: " + totalSeconds);
    }
}
