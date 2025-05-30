// 📍 Arrays:
// 📍 Copying a Java Array
//  We can copy an array to another array by arraycopy() method of System class.
//  Syntax:
//  public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//  srcPos -> Starting position/index of source from where you want to start copying.
//  destPos -> Position/index of destination to where you want to paste.
//  length -> Number of elements to copy from source.

// 📍 Cloning an Array in Java
//  If we create a clone a single-dimensional array -> It creates the Deep copy of the Java array, which means it will copy the actual values.
//  If we create a clone a multi-dimensional array -> It creates the Shallow copy of the Java array, which means it copies the references.
public class _4_Arrays {
    public static void main(String[] args) {
        // 📍 Copying a Java Array
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};   // length = 13
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        // System.out.println(copyFrom);   //decaffeinated
        // System.out.println(copyTo);     //caffein
        System.out.println(String.valueOf(copyTo));
        // Output: caffein
        System.out.println("\n");

        // 📍 Cloning an Array in Java 
        int arr[]={33,3,4,5};  
        System.out.println("Printing original 1D array:");  
        for(int i:arr)  
            System.out.println(i);  
        System.out.println("Printing clone of the 1D array:");  
        int carr[]=arr.clone();
        for(int i:carr)  
            System.out.println(i);  
        System.out.println("Are both 1D arrays equal?");  
        System.out.println(arr==carr); 
        // 📌  Why false?
        // -->  arr.clone() creates a new array with the same contents but stored at a different memory location.
        System.out.println("-------------------------------------");
        int arr2[][]={{33,3},{4,5}};  
        System.out.println("Printing original 2D array:");  
        for (int[] row : arr2) {  // `row` is a 1D array
            for (int num : row) { // Iterate over each element in the row
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next row
        }  
        System.out.println("Printing clone of the 2D array:");  
        int carr2[][]=arr2.clone();
        for (int[] row : carr2) {  // `row` is a 1D array
            for (int num : row) { // Iterate over each element in the row
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next row
        }
        System.out.println("Are both 2D arrays equal?");  
        System.out.println(arr2==carr2); 
        // 📌  Why false? 
        // --> The top-level array (arr) is cloned, but the inner arrays are 
        //     not duplicated—they are still pointing to the same memory locations.
      
    }
}

// OUTPUT:
// caffein


// Printing original 1D array:
// 33
// 3
// 4
// 5
// Printing clone of the 1D array:
// 33
// 3
// 4
// 5
// Are both 1D arrays equal?
// false
// -------------------------------------
// Printing original 2D array:
// 33 3 
// 4 5
// Printing clone of the 2D array:
// 33 3
// 4 5
// Are both 2D arrays equal?
// false

// _________Data Type__________|_______clone() does______|_💡_Result Type___|
// Primitive array (int[])     | Copies values           | ✅ Deep Copy     |
// Object array (String[])     | Copies references       | ⚠️ Shallow Copy  |
// 2D arrays or custom objects | Copies outer array only | ⚠️ Shallow Copy  |