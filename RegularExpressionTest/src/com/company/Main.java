package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge1 = "I want a bike.";

        boolean result = challenge1.matches("([a-zA-Z]+[ ]?)+\\.");

        System.out.println(result);

        String challenge2 = "I want a ball.";

        boolean result2 = challenge2.matches("([a-zA-Z]+[ ]?)+\\.");

        System.out.println(result2);


        String rex = "([a-zA-Z]+[ ]?)+\\.";
        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(challenge1);
        boolean matches = matcher.matches();
        System.out.println(matches);

        matcher = pattern.matcher(challenge2);
        matches = matcher.matches();
        System.out.println(matches);


        String challenge4 = "Replace all blanks with underscores.";
        String temp = challenge4.replaceAll(" ", "_");
        System.out.println(temp);


        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-zA-Z]+"));

        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("^[a]{3}b[c]{8}[d]{3}e[f]{3}g$"));


        String challenge7 = "abcd.135";
        System.out.println(challenge7.matches("^[\\D]+\\.[\\d]+"));
        challenge7 = "kjisl.23";
        System.out.println(challenge7.matches("^[\\D]+\\.[\\d]+"));


        String challenge8 = "abcd.135uvqz.7tzik.999";
        String reg1 = "(.*?)(\\d+)(.*?)";
        Pattern pattern1 = Pattern.compile(reg1);
        Matcher matcher1 = pattern1.matcher(challenge8);

        while (matcher1.find()) {

            System.out.println(matcher1.group(2));
        }


        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        String reg2 = "(.*?)(\\d+)(.*?)";
        Pattern pattern2 = Pattern.compile(reg2);
        Matcher matcher2 = pattern2.matcher(challenge9);

        while (matcher2.find()) {

            System.out.println(matcher2.group(2));
        }


        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        String reg3 = "(.*?)(\\d+)(.*?)";
        Pattern pattern3 = Pattern.compile(reg3);
        Matcher matcher3 = pattern3.matcher(challenge10);

        while (matcher3.find()) {

            System.out.println("Starts at " + matcher3.start(2) + " and ends at " + (matcher3.end(2)-1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {3, 6}, {16, 18}";
        String reg4 = "(\\{)(\\d+, \\d+)(\\})[, ]?";
        Pattern pattern4 = Pattern.compile(reg4);
        Matcher matcher4 = pattern4.matcher(challenge11);

        while (matcher4.find()) {

            System.out.println(matcher4.group(2));
        }


        String challenge12 = "11111";
        System.out.println(challenge12.matches("^\\d{5}$"));


        String challenge13 = "11111-1111";
        System.out.println(challenge13.matches("^\\d{5}-{1}\\d{4}$"));


        System.out.println(challenge12.matches("^\\d{5}(-{1}\\d{4})?$"));
        System.out.println(challenge13.matches("^\\d{5}(-{1}\\d{4})?$"));

    }
}
