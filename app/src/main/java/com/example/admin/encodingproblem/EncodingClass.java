package com.example.admin.encodingproblem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EncodingClass {
    public static void main(String [] args) {
        String input_string = "acp";
        System.out.println("Input String: " + input_string);
        System.out.println("Encoded String: " + encode(input_string));
        System.out.println("Frecuency of Strings: ");
        frecuency(input_string);

    }

    public static String encode(String input){
        char[] in = input.toCharArray();
        char[] out = new char[in.length];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] count = new int[alphabet.length];

        for (int i = 0; i < in.length; i++ ){
            for (int j = 0; j < alphabet.length; j++){
                if (in[i] == alphabet[j]) {
                    out[i] = alphabet[25 - j];
                }
            }
        }
        return new String(out);
    }

    public static void frecuency(String input){
        char[] in = input.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] count = new int[alphabet.length];

        for (int i = 0; i < in.length; i++ ){
            for (int j = 0; j < alphabet.length; j++){
                if (in[i] == alphabet[j]) {
                    count[j] = count[j] + 1;
                }
            }

        }

        System.out.println("{");
        for (int j = 0; j < alphabet.length; j++){
            System.out.println("     " +alphabet[j] + ":" + count[j] + ",");
        }
        System.out.println("}");

    }

}
