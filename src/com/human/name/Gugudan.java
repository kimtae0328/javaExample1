package com.human.name;

public class Gugudan {

    public static void main(String[] Fargs) {
        int result = 0;
        for (int i = 0; i < 9; i++) {
            if (i == 8)
                break;
            for (int j = 0; j < 9; j++) {
                result = (i + 2) * (j + 1);
                if (i % 2 != 0)
                    System.out.printf("%d * %d = %d\n", i + 2, j + 1, result);
                else
                    continue;
            }
            System.out.println();
        }
    }
}