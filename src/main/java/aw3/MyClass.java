package aw3;

public class MyClass {
    static void myMethod(){
        System.out.println("Hello World!");
        int x = 10;
        int y = 20;
        
        int z= x+y;
        System.out.println("Z ist "+z+"!");
    }
    
    public static void main(String[] args) {
        myMethod();
        TestMethod();
        
    }
    static void TestMethod(){
        System.out.println("schlawiener!");
        
        int a = 50;
        int b = 30;
        int c = 15;
        
        a=b/c;
        System.out.println("a = "+a+"!");
    }
    
}
