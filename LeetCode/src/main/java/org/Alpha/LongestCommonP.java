package org.Alpha;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

//Longest Common Prefix
public class LongestCommonP {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder cadenaNueva = new StringBuilder();
        cadenaNueva.append(strs[0]);
        if(strs.length > 1){
            for (int i = 1; i < strs.length ; i++){
                int k = 0;
                while(k < strs[i].length()){
                    if (cadenaNueva.charAt(k) != strs[i].charAt(k)){
                        cadenaNueva.deleteCharAt(cadenaNueva.length()-1);
                    }
                    k++;
                }
            }
        }
        return cadenaNueva.toString();
    }

    public static void main(String[] args) {
        LongestCommonP l = new LongestCommonP();
        System.out.println(l.longestCommonPrefix(new String[]{"flower","flow","flight"})); // "fl"
        System.out.println(l.longestCommonPrefix(new String[]{"dog","racecar","car"}));     // ""
        System.out.println(l.longestCommonPrefix(new String[]{"aros","arroz"}));            // "ar"
        System.out.println(l.longestCommonPrefix(new String[]{"vagon","vagoneta"}));        // "va"
        System.out.println(l.longestCommonPrefix(new String[]{"arcilla","silla"}));         //  ""
        System.out.println(l.longestCommonPrefix(new String[]{"a"}));
        System.out.println(l.longestCommonPrefix(new String[]{""}));
        System.out.println(l.longestCommonPrefix(new String[]{"",""}));
        System.out.println(l.longestCommonPrefix(new String[]{"a","a"}));



    }

}
