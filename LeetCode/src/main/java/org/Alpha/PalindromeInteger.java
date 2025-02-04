package org.Alpha;

import java.util.ArrayList;

public class PalindromeInteger {

    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        System.out.println(y.length());
        StringBuilder cadenaNueva = new StringBuilder();
        for (int i = y.length() -1; i >= 0; i--) {
            cadenaNueva.append((y.charAt(i)));
        }
        if(cadenaNueva.toString().equals(y)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeInteger p = new PalindromeInteger();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
        System.out.println(p.isPalindrome(-101));


    }
}
