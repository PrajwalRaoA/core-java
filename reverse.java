package com.xworkz.inheritance;

public class reverse {
    public static void main(String[] args) {
        String str = "java";
        char[] ch = str.toCharArray();
       // for (int i = 0; i < ch.length; i++) {
       //     System.out.print(ch[i]);
     //   }
    for(int i=ch.length-1;i>=0;i--){
        System.out.print(ch[i]);
    }
   // System.out.println(ch[ch.length-1]);
    }

}
