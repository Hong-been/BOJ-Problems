package com.company;

import java.util.*;

public class BOJ11022 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.format("Case #%d: %d + %d = %d",i+1,a,b,(a+b)));
        }}
}

