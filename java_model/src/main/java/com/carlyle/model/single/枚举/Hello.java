package com.carlyle.model.single.枚举;

enum Color{
    RED,GREEN,BLUE,num;
   
}
enum Color2{
    RED(1),GREEN(2),BLUE(3);
    private int code;
    Color2(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
public class Hello {
    public static void main(String[] args){
        Color color=Color.RED;
        int counter=10;
        while (counter-->0){
            switch (color){
                case RED:
                    System.out.println("Red"+"==="+Color2.GREEN);
                    color=Color.BLUE;
                    break;
                case BLUE:
                    System.out.println("Blue");
                    color=Color.GREEN;
                    break;
                case GREEN:
                    System.out.println("Green");
                    color=Color.RED;
                    break;
            }
        }
    }
}
