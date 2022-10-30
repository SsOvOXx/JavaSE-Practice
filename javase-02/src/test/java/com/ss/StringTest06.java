package com.ss;

import java.util.Scanner;

/**
 * @program: JavaSE-Practice
 * @ClassName StringTest06
 * @description:
 * @author: SsOvOXx
 * @create: 2022-09-20 19:04
 * @Version 1.0
 **/
public class StringTest06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chs[i] = str.charAt(i);
            if (chs[i]>='A' && chs[i] <='Z' ) {
                chs[i] += 32;
            }
        }
        if (chs[0] != chs[chs.length-1]) {
            char temp = chs[0];
            chs[0] = chs[chs.length-1];
            chs[chs.length-1] = temp;
        }

        for (int i = 0; i < chs.length; i++) {
            if (i%2==0) {
                chs[i] = '~';
            }
            System.out.print(chs[i] + " ");
        }
    }
}