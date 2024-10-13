package com.method.java;

public class Methods {

    // methods are classified in four types

    //1.method with no return and no parameters
    //2.method with  return and no parameters
    //3.method with  no return and parameters
    //2.method with  return and  parameters


    public void display(){
        System.out.println("method with no return and no parameters");
    }
    public String displayed(){
        return "method with  return and no parameters";
    }
    public int add( int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.display();
        methods.displayed();
        methods.add(15,23);

    }
}
