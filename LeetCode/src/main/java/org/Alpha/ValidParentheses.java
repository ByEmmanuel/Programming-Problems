package org.Alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    // Dada una cadena de parentesis
    // El resultado de la cadena solo puede ser verdadera si los parentesis del mismo tipo se cierran
    // Es decir SI () -> True; [] -> True; [()] -> true;  [} -> false;

    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        if (s.contains("[]") || s.contains("()") || s.contains("{}") ){
            for (int i = 0;  i< s.length(); i++) {
                //stack.push());
            }
            int valorArbitrario = 0;
            for (Character c: stack){
                if (c.equals("[")){
                    valorArbitrario++;
                }
                if (c.equals("[")){
                    valorArbitrario++;
                }
            }
            valorArbitrario = 0;
            for (Character c : stack){
                if (c.equals("(")){
                    valorArbitrario++;
                }
                if (c.equals(")")){
                    valorArbitrario++;
                }
            }
            valorArbitrario = 0;
            for (Character c : stack){
                if (c.equals("}")){
                    valorArbitrario++;
                }
                if (c.equals("{")){
                    valorArbitrario++;
                }
            }
            if(valorArbitrario == 2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("()"));        // true
        System.out.println(v.isValid("()[]{}"));    // true
        System.out.println(v.isValid("(]"));        // false
        System.out.println(v.isValid("([)]"));      // false
        System.out.println(v.isValid("{[]}"));      // true

    }
}
