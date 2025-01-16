package org.example;

public class Test1{

    private void checkCondition() {
        String str = "Hello this is my first program";
        if (str.length()>10){
            System.out.println("It is greater than 10");
        }
        else{
            System.out.println("It is not greater than 10");
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.checkCondition();
    }



}
