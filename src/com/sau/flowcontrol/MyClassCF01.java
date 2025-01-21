package com.sau.flowcontrol;

public class MyClassCF01 {
    //Control Flow/Statement
    //กลุ่มที่ 1 Selection/Condition (if, if-else, if-else-if, switch-case)
    public static void main(String[] args) {
        //พิสูจครั้งเดียวจริงทำ เท็จไม่ทำ :if

        int a = 50;
        if( a > 35){
            System.out.println("----------------------");
            System.out.println("Hello....");
        }
        System.out.println("----------------------");
        //พิสูจครั้งเดียวจริงทำ เท็จไม่ทำ :if-else
        String b = "xyz";
        if( b.equals("SAU") ){
            System.out.println("Southease Asia University");
        }else{
            System.out.println("No No No");
        }

    }
}
