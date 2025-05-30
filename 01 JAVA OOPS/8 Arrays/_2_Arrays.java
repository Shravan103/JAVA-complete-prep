// 📍 Arrays:
// 📍 Passing Array to a Method in Java:
class Testarray2{
    static void min(int arr[]){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        arr[0] = 1000;
        System.out.println(arr[0]);     //1000
        System.out.println(min);
    }
}

// 📍 Anonymous array in Java
//  Java supports the feature of anonymous array, so you dont need to declare the array while passing an array to the method.
class TestAnonymousArray{
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}

// 📍 Returning Array from the Method
class TestReturnArray{
    static int[] get(){
        return new int[] {1,2,3,4,5,6,7,8,9,10};
    }
}

// 📍 ArrayIndexOutOfBoundsException
//  JVM throws an ArrayIndexOutOfBoundsException if length of the array in negative, 
//  equal to the array size of greater than the array size while traversing the array.

public class _2_Arrays{
    public static void main(String[] args) {
        // 📍 Passing Array to a Method in Java:
        int a[] = {33,45,6,2,80};
        Testarray2.min(a);              // 2
        System.out.println(a[0]);       //1000, it means that arrays are passed by reference.

        // 📍 Anonymous array in Java
        TestAnonymousArray.printArray(new int[] {10,20,30,40});

        // 📍 Returning Array from the Method
        int arr2[] = TestReturnArray.get();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();

        // 📍 ArrayIndexOutOfBoundsException
        //  Example:
        int arr3[] = {11, 22, 33, 44, 55};
        for (int i = 0; i <= arr3.length; i++) {
            System.out.print(arr3[i] + "  ");
        }
        // Output:
        // 11  22  33  44  55  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 
        // out of bounds for length 5 at _2_Arrays.main(_2_Arrays.java:62)

    }
}