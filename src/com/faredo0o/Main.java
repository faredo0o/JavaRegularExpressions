package com.faredo0o;

public class Main {

    public static void main(String[] args) {
	String alphanumeric="abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","YYY")); // replace any character
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY")); // replace the string start
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z")); // matches should be passed the full string
        System.out.println(alphanumeric.replaceAll("jkl99z$","THE END")); // replace at the end

        System.out.println(alphanumeric.replaceAll("[aei]","X")); // replace any a,e,i
        System.out.println(alphanumeric.replaceAll("[aei][Fj]","X"));// replace a,e,i if followed by F or j
        System.out.println(alphanumeric.replaceAll("[^ej]","X")); // replace all with X except e&j
        System.out.println(alphanumeric.replaceAll("[abcdef345678]","X")); // replace all matches CS
        System.out.println(alphanumeric.replaceAll("[a-f3-8]","X"));// same as above but using - is for range
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]","X"));// replace all without CS
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]","X")); // like the above with ignore CS using (?i)
        System.out.println(alphanumeric.replaceAll("[0-9]","X")); // replace all digits from 0 to 9 with X
        System.out.println(alphanumeric.replaceAll("\\d","X")); // same as above but using "\\d"
        System.out.println(alphanumeric.replaceAll("\\D","X")); // replace all non-numeric with X using "\\D"

        String hasWhiteSpaces="I have blanks and\ta tab, and also a new line\n !";
        System.out.println(hasWhiteSpaces);
        System.out.println(hasWhiteSpaces.replaceAll("\\s","")); // replace all white space and tab and new line
        System.out.println(hasWhiteSpaces.replaceAll("\t","X"));// replace only tab with X
        System.out.println(hasWhiteSpaces.replaceAll("\\S","X")); // replace all except white space and tabs and new line using "\\S" capital S
        System.out.println(alphanumeric.replaceAll("\\w","X")); // replace any a-zA-z0-9 and _
        System.out.println(hasWhiteSpaces.replaceAll("\\W","X"));// the opposite replace anything but a-zA-z0-9 and _
        System.out.println(hasWhiteSpaces.replaceAll("\\b","X")); // ech word separated by white space and surrounded by the replacement character

        //Quantifiers
        System.out.println(alphanumeric.replaceAll("^abcDe{3}","YYY")); // matches the e 3 times
        System.out.println(alphanumeric.replaceAll("^abcDe{2,5}","YYY")); // matches the e between 2 and 5 times
        System.out.println(alphanumeric.replaceAll("^abcDe+","YYY")); // matches 1 or more e
        System.out.println(alphanumeric.replaceAll("^abcDe*","YYY")); // matches 0 or more e
        System.out.println(alphanumeric.replaceAll("h+i*j","Y")); // matches h followed by 1 or more i followed by 0 or more j


    }
}
