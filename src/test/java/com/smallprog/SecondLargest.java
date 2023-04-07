package com.smallprog;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {8,5,3,6,7,12,9};
        int temp = 0;

        for (int i = 0;i<a.length;i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Secnd largest no is "+a[1]);
    }
}
