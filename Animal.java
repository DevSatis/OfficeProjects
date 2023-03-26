public class Animal {

    String color;
    int age;

    public static void main(String[] args) {

        Animal aa = new Animal();
        aa.initObj("Red", 18);
        aa.display();

        
    }
    public void initObj(String c, int d){
        color = c;
        age = d;
    }
    public void display(){
        System.out.println("This is to display Color: " + color);
        System.out.println("This is to display age: " + age);
    }
}
