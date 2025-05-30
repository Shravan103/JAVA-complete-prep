// 📍 Method Overloading and Type Promotion:
// 2. Type Promotion:
// →  One type is promoted to another implicitly if no matching datatype is found.
// →  If a match is not found, then the compiler will promote the smaller datatype(char) to the bigger datatype(int).

class OverloadingCalculatiom{
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class _2_Type_Promotion {
    public static void main(String[] args) {
        OverloadingCalculatiom obj = new OverloadingCalculatiom();
        obj.sum(20, 20); // Now second int literal will be promoted to long
        obj.sum(20, 20, 20); // 60
    }
}
// Output:
// 40
// 60

// Example of Method Overloading with Type Promotion in case of ambiguity:
// →  If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
// class OverloadingCalculatiom{
//     void sum(int a, long b){
//         System.out.println(a+b);
//     }
//     void sum(long a, int b){
//         System.out.println(a+b);
//     }
// }
// public class _2_Type_Promotion {
//     public static void main(String[] args) {
//         OverloadingCalculatiom obj = new OverloadingCalculatiom();
//         obj.sum(20, 20); // Ambiguity
//     }
// }