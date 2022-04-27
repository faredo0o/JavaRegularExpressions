package com.faredo0o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsAndOrNot {
    public static void main(String[] args) {
        System.out.println("harry".replaceAll("[h|H]arry","Larry")); // matches harry with H|h and replace with Larry
        System.out.println("Harry".replaceAll("[h|H]arry","Larry"));// same as above with H

        //Not operator
        String tvTest="tstvtkt";
       // String tNotVRegExp="t[^v]"; //matches all but not the final one because it needs any char after t to match (including v in the result match text)
        String tNotVRegExp="t(?!v)"; // Negative look ahead Exp that matches if t not followed by v or v followed by nothing (Not including v in the result match text)
       // String tNotVRegExp="t(?=v)"; Positive look ahead Exp matches all t that followed by v (Not including v in the result match text)
        Pattern tNotVPattern=Pattern.compile(tNotVRegExp);
        Matcher tNotvMatcher=tNotVPattern.matcher(tvTest);
        int count=0;
        while(tNotvMatcher.find()){
            count++;
            System.out.println("Occurrence "+count+" : "+tNotvMatcher.start()+" to "+tNotvMatcher.end());
        }
    }
}
