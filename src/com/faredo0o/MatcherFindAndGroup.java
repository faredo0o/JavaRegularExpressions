package com.faredo0o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindAndGroup {
    public static void main(String[] args) {
        StringBuilder htmlText=new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is a paragraph about something else.</p>");
        htmlText.append("<h2>Summery</h2>");
        htmlText.append("<p>Here is the summery.</p>");

        String h2Pattern="<h2>";
        Pattern pattern=Pattern.compile(h2Pattern);
        Matcher matcher=pattern.matcher((htmlText));
        System.out.println(matcher.matches());
        int count=0;
        matcher.reset();
        while(matcher.find()){
            count++;
            System.out.println("Occurrence "+count+" : "+matcher.start()+" to "+matcher.end());
        }

        //group pattern
        String h2GroupPattern="(<h2>.*?</h2>)"; // ? for lazy finding
        Pattern groupPattern=Pattern.compile(h2GroupPattern);
        Matcher groupMatcher=groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();
        while(groupMatcher.find()){
            System.out.println("Occurrence :"+groupMatcher.group(1));
        }

        // Text group inside the h2 tag

        String h2TextGroup="(<h2>)(.+?)(</h2>)"; // ? for lazy finding
        Pattern h2TextPattern=Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher= h2TextPattern.matcher(htmlText);
        while(h2TextMatcher.find()){
            System.out.println("Occurrence : "+h2TextMatcher.group(2));
        }

    }
}
