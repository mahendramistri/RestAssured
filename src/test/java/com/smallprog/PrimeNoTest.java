package com.smallprog;

public class PrimeNoTest {
    public static void main(String[] args) {
        // 2,3,4,5,6,7
        int n = 12 , temp = 0;

        for (int i = 2 ;i<=n ;i++)
        {
            if(n%2 == 0)
            {
                temp = temp +1;
            }
        }
        if (temp > 0)
        {
            System.out.println("No is not prime");
        }
        else
        {
            System.out.println("No is prime");
        }

    }
}
