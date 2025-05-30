// 📍 Arrays:
// 📍 Multidimensional Array in Java:
//  Data is stored in row and column based index (also known as matrix)
//  1️⃣ Declaration Syntax:
//  datatype[][] arrayRefVar;
//  datatype [][]arrayRefVar;
//  datatype arrayRefVar[][];
//  datatype []arrayRefVar[];
//  2️⃣ Instantiation Syntax:
//  int[][] arr = new int[3][3]   // 3 rows and 3 columns
//  3️⃣ Initialization Syntax:
//  arr[0][0] = 1;
//  arr[0][1] = 2; and so on


// 📍 Jagged Array:
//  In Java, a jagged array refers to a 2D array where each row can have a different number of columns.
//  In other words, it is an array of arrays with different number of columns.

public class _3_Arrays {
    public static void main(String[] args) {
        // 📍 Multidimensional Array in Java:
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 📍 Jagged Array:
        //declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for(int i=0; i<arr.length; i++){  
            for(int j=0; j<arr[i].length; j++){ 
                arr[i][j] = count++; 
            }
        }
        //printing the data of a jagged array   
        for(int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();       //new line
        }
        System.out.println();

        // 📍 What is class name of java array ?
        // In Java, arrays are objects, and they have an associated class name that is dynamically generated at runtime. 
        // The class name follows the format: "[" followed by the type descriptor
        // 1. getClass() Method
        // ◉  The getClass() method is a built-in method in Java that returns the runtime class of an object.
        // ◉  It is defined in the Object class, which means every Java object inherits it.
        // ◉  It returns an instance of Class<?>, which represents the class type of the object.
        // 2. getName() Method
        // ◉  The getName() method belongs to the Class<?> class.
        // ◉  It returns the fully qualified class name (package + class name) as a String.
        // ◉  When used with arrays, it returns a special encoding (e.g., [I for int[]).
        int arr2[] = {1,2,3,4,5};
        Class c = arr2.getClass();
        String name = c.getName();
        System.out.println(c);
        System.out.println(name);

        
    }
}
// OUTPUT:
// 1 2 3 
// 4 5 6 
// 7 8 9 

// 0 1 2 
// 3 4 5 6 
// 7 8 

// class [I
// [I