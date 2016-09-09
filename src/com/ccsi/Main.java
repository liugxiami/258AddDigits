package com.ccsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(addDigits3(22888));
    }
    //Given a non-negative integer num,repeatedly add all its digits until the result has only one digit.
    //1.recursion, not good enough
    public static int addDigits1(int num){
        int count=0;
        int temp=num;
        while(num!=0){
            num=num/10;
            count++;
        }
        return sum(temp,count);
    }
    public static int sum(int num,int digits){
        if(num<10) return num;
        int s=0;
        while(num!=0){
            s+=num%10;
            num/=10;
        }
        return sum(s,digits-1);
    }
    //2.loop
    public static int addDigits2(int num){

        while (true){
            if(num<10) return num;
            int next=0;
            while(num!=0){
                next+=num%10;
                num/=10;
            }
            num=next;
        }
    }
    //3.math 列出1到29(in) 及其对应的输出值(out)，观察找出规律，公式是out=(in-1)%9+1;
    public static int addDigits3(int num){
        return (num-1)%9+1;
    }
}
