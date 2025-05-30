// 📍 Creating the custom wrapper class
//  →  In Java, the System.out.println(Object obj) method automatically calls obj.toString().
//  →  String.valueOf(x) internally calls x.toString()

// 📍 How Does This Code Represent a Custom Wrapper Class?
//  →  A wrapper class in Java is a class that encapsulates (wraps) a primitive data type inside an object.
//  →  Your class codemeals is a custom wrapper class because it wraps the primitive 
//     int inside an object and provides methods to interact with it.

class codemeals{  
    private int i;  
    codemeals(){}  
    codemeals(int i){  
    this.i=i;  
    }  
    public int getValue(){  
    return i;  
    }  
    public void setValue(int i){  
    this.i=i;  
    }  
    @Override  
    public String toString() {  
      return Integer.toString(i);  
    }  
    }  
    //Testing the custom wrapper class  
    public class _2_Wrapper_classes{  
    public static void main(String[] args){  
    codemeals j=new codemeals(10);  
    System.out.println(j);  
    }}
    