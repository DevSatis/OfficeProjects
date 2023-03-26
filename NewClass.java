import java.io.IOException;
public class NewClass{

    public void  numberSum(int a, int b){
        int resultOfNumbers = 0;
        resultOfNumbers = a + b;
        System.out.println(resultOfNumbers); 
    }
    public void eat(){
        System.out.println("I'm eating!");
    }

    public static void main(String args[]){
        System.out.println("Hello world!");
        System.out.println("Hello Satish");
        System.out.println("Hope You are enjoying Java Programming!");

        NewClass obj1 = new NewClass();
        obj1.eat();
        obj1.numberSum(12, 18);
        obj1.run(); 
    }
    public void run(){
        System.out.println("I'm running!");
    }
    
}