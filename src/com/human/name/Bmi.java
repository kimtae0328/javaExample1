package com.human.name;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Bmi b = new Bmi();
        b.bmi();

    }

    public void bmi(){
        
        double height, weight, bmi;
        String bmiStr;
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("키(m) :");
        height = s.nextDouble();
        System.out.println("몸무게(kg) :");
        weight = s.nextDouble();

        
        System.out.println("사용자 정보");
        
        System.out.printf("키 : %.0f, 몸무게 : %.0f\n", height, weight);

        if(height >= 100){
            
            height = height/100;

        }
        
        bmi = weight/(height*height);

        if(bmi>=25){
            bmiStr = "비만";
        } else if(bmi>=23) {
            bmiStr = "과체중";
        } else if(bmi>=18.5){
            bmiStr="정상";
        } else {
            bmiStr="저체중";
        }
        
        System.out.printf("당신의 Bmi는 %.1f, %s입니다.\n", bmi, bmiStr);

        s.close();
    }

}