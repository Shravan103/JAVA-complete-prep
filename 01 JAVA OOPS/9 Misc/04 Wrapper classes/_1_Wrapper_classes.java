// 📍 _1_Wrapper_classes:
//  The wrapper class in java provides mechanism to convert:
//  ● primitive into object
//  ● object into primitive
//  Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically.
//  1. autoboxing:
//  ●  Automatic conversion of primitive into object.
//  2. unboxing:
//  ●  Automatic conversion of object into primitive.

// 📍 Key Differences
// Q) Storage & Performance:
// →  Primitives store only values and are faster.
// →  Wrapper classes are objects that store metadata, making them slower.

// Q) Memory Usage:
// →  Primitives require less memory.
// →  Wrapper classes need more memory because they are objects.

// Q) Nullability:
// →  Primitives cannot be null.
// →  Wrapper classes can be null.

// Q) Usage in Collections:
// →  Collections (ArrayList, HashMap, etc.) only work with wrapper classes, not primitives.


public class _1_Wrapper_classes{
    public static void main(String[] args) {
        // 📍 autoboxing:
        int a = 20;
        // Converting int to Integer explicitly, not used today(done automatically by compiler)
        Integer i = Integer.valueOf(a);
        // autoboxing, compiler writes Integer.valueOf(a) internally.
        Integer j = a;
        System.out.println(a+" "+i+" "+j);

        // 📍 unboxing:
        Integer x = 20;
        // Converting Integer to int explicitly, not used today(done automatically by compiler)
        int p = x.intValue();
        // unboxing, compiler writes x.intValue() internally.
        int q = x;
        System.out.println(x+" "+p+" "+q);
    }
}