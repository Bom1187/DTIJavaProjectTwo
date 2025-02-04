package com.sau.flowcontrol;

public class MyClassCF04 {
    //คำสั่ง break และ continue ใน loop
    //break ใน loop ทำงานเมื่อไหร่จนจบ
    //continue ใน loop ทำงานเมื่อไหร่จบตอนนั้นเลย แล้วไปรอบต่อไป
    public static void main(String[] args) {
        //break
        for( int k = 1 ; k <= 5 ; k++ ){
            if(k == 3){
                break;
            }
            System.out.println(k + " : Hoo...");
        }
        System.out.println("*******************");
        //continue
        for( int  k = 1 ; k <= 5 ; k++ ){
            if(k == 3){
                continue;
            }
            System.out.println(k + " : Hey....");
        }
    }
}
