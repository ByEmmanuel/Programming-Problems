package org.Alpha;

import java.util.*;

public class RomanToInt {
    /*public int romanToInt(String s) {

    }*/

    /*
    * Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
    * */

    public static void main(String[] args) {
        ArrayList<String> entradas = new ArrayList<>();
        entradas.add("IV");     // 4
        entradas.add("XXV");    // 25
        entradas.add("III");    // 3
        entradas.add("VXX");    // 15
        entradas.add("VLM");    //945
        entradas.add("CM");    // 900

        Map<String, Integer> diccionario = new HashMap<>();
        diccionario.put("I",1);
        diccionario.put("V",5);
        diccionario.put("X",10);
        diccionario.put("L",50);
        diccionario.put("C",100);
        diccionario.put("D",500);
        diccionario.put("M",1000);


        /*for (int i = 0; i < entradas.size(); i++) {
            System.out.println(entradas.get(i));
        }*/

        //Map<Character, Integer> resultado = new HashMap<>();
        ArrayList<Integer> resultado = new ArrayList<>();
        Character c ;
        for (String numeroRom : entradas){
            System.out.println(numeroRom);
            Integer resultadoNum = 0;
            for (int i = 0; i < numeroRom.length(); i++) {

                c = numeroRom.charAt(i);

                /* mi linea
                *
                *   if(diccionario.get(c.toString()) < diccionario.get(String.valueOf(numeroRom.charAt(i + 1)))
                    && i + 1 < numeroRom.length())
                *  */

                /* CHAT GPT */
                if(i + 1 < numeroRom.length() && diccionario.get(c.toString()) < diccionario.get(String.valueOf(numeroRom.charAt(i + 1)))

                    ){
                    System.out.println(diccionario.get(c.toString()));

                    System.out.println("es menor");

                    resultadoNum = resultadoNum - diccionario.get(c.toString());

                    resultado.add(resultadoNum);

                }else {
                    resultadoNum = resultadoNum + asignarValor(diccionario,c);
                    resultado.add(resultadoNum);
                }
            }
            System.out.println("ResultadoNum: " + resultadoNum);
        }
    }
    public static int asignarValor(Map<String, Integer> diccionario, Character c){

        System.out.println(diccionario.get(c.toString()));

        return diccionario.get(c.toString());
    }

}

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> diccionario = new HashMap<>();
        diccionario.put("I",1);
        diccionario.put("V",5);
        diccionario.put("X",10);
        diccionario.put("L",50);
        diccionario.put("C",100);
        diccionario.put("D",500);
        diccionario.put("M",1000);

        ArrayList<Integer> resultado = new ArrayList<>();
        Character c ;
        Integer resultadoNum = 0;
        for (int i = 0; i < s.length(); i++) {



            c = s.charAt(i);


            if(i + 1 < s.length() && diccionario.get(c.toString()) < diccionario.get(String.valueOf(s.charAt(i + 1)))

            ){
                /*resultadoNum = resultadoNum - asignarValor(diccionario, c);*/
                //System.out.println(diccionario.get(c.toString()));

                /*System.out.println(diccionario.get(c.toString() + 1));*/
                //System.out.println("es menor");

                resultadoNum = resultadoNum - diccionario.get(c.toString());

                resultado.add(resultadoNum);

            }else {
                resultadoNum = resultadoNum + diccionario.get(c.toString());
                resultado.add(resultadoNum);
            }

        }
        return resultadoNum;
    }
}