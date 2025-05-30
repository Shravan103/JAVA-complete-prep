// 📍 Abstract Class QnA:
// 📀 1. Is final method inherited?
// →  Yes, final method is inherited but you cannot override it.
// Example:
class Bike{
    final void run(){
        System.out.println("running");
    }
}
class Honda extends Bike{
    //Cannot override run() method
    // void run(){System.out.println("running safely with 100kmph");} // Compile Time Error
}

// 📀 2. What is blank or uninitialized final variable?
// →  A final variable that is not initialized at the time of declaration is known as blank final variable.
// →  If you want to create a variable that is initialized at the time of creating object 
//    and once initialized may not be changed,it is useful.
// →  It can be initialized only in constructor.
// Example:
// PAN CARD number of an student
class Student{
    int id;
    String name;
    final String PAN_CARD_NUMBER;
    Student(int id, String name, String PAN_CARD_NUMBER){
        this.id=id;
        this.name=name;
        this.PAN_CARD_NUMBER=PAN_CARD_NUMBER;
    }
}

// 📀 3. Can we initialize blank final variable?
// →  Yes, but only in constructor.
// Example:
class Bike10{
    final int speedlimit; //blank final variable declared
    Bike10(){
        speedlimit=70; //initialized in constructor
        System.out.println(speedlimit);
    }
}

public class _2_final_keyword {
    public static void main(String[] args) {
        // 📀 1. Is final method inherited?
        Honda honda= new Honda();
        honda.run();
        
        // 📀 2. What is blank or uninitialized final variable?
        Student s1=new Student(111,"Karan","ABCD1234");
        System.out.println(s1.id+" "+s1.name+" "+s1.PAN_CARD_NUMBER);

        // 📀 3. Can we initialize blank final variable?
        Bike10 b=new Bike10();

    }
}
