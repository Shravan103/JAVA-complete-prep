// 📍 Arrays:
//  Collection of similar type of elements which has contiguous memory location.
//  Java array is an object which contains elements of a similar data type.
//  Array is index based, first element at index 0, Second at index 1 and so on.
//  Java array inherits the 'Object' class and implements the 'Serializable' as well as 'Cloneable' interfaces.
//  In java, We have length member to get length of Array, where as in c/c++ we use sizeof operator.
//  In java, We have feature of anonymous Arrays which is not available in c/c++.

// 📍 Disadvantage:
//  1. Size Limit:
//     We can store only fixed size of elements in the Array.
//     It doesn't grow it's size at runtime.
//     Solutions: collection framework is used in Java which grows automatically.

// 📍 Types of array in java:
//  1. Single Dimensional Array.
//  2. Multidimensional Array.

// 📍 Single Dimensional Array:
//  ● Different ways to 1️⃣ Declare an Array in Java:
//    datatype[] arr;
//    datatype []arr;
//    dataype arr[];
//  ● Instantiation of an Array in Java:
//    arrayRefVar = new datatype[size];


public class _1_Arrays{
    public static void main(String[] args) {
        // 📍 Example of Java Array:
        //  We are going to Instantiate, Initialize and Traverse an Array:
        // 2️⃣ Instantiate:
        int a[] = new int[5];
        // 3️⃣ Initialize:
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
        for(int i=0; i<a.length; i++){
            System.out.println("At index "+i+", value = "+a[i]);
        }
        System.out.println();

        // 📍 Declare, Instantiate and Initialize an Array at the same time:
        int b[] = {100, 200, 700, 300, 400};
        for(int i=0; i<b.length; i++){
            System.out.println("At index "+i+", value = "+b[i]);
        }
        System.out.println();

        // 📍 For-each loop for Java Array (cannot modify an array using For-Each loop)
        //  It holds an Array element in a variable, then executes the body of the loop.
        //  Syntax:
        //  for(datatype variable : array){
        //  }
        //  Example:
        int arr1[] = {33, 29, 34, 22, 90, 78, 49};
        for(int value : arr1){
            System.out.println("value = "+value);
        }
    }
}