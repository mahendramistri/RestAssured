package com.smallprog;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "Laptop";
        int length = str.length();
        String reverse_str = "";

        for (int i = length - 1; i>=0;i--)
        {
            reverse_str = reverse_str+ str.charAt(i);
        }
        System.out.println(reverse_str);
    }
}
