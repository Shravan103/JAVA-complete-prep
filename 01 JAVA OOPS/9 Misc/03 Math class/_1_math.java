// 📍 Math class:
//  • java.lang.Math
//  • Math class provides several methods to work on math calculations like min(), max(), avg(), sin(), cos(), round(), ceil(), etc.
//  • If the size os int/long and the results overflow the range of value, the methods addExact(), subtractExact(),
//    multiplyExact() throw an arithmeticException.



public class _1_math{
    public static void main(String[] args) {
        // 📍 Example 1:
        System.out.println("Example 1:");
        double x = 28;    
        double y = 4;    
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));
        // return the square root of y   
        System.out.println("Square root of y is: " + Math.sqrt(y));   
        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
        // return e^x   
        System.out.println("exp of a is: " +Math.exp(x));    
        // return exponential function minus one (e^x -1)
        System.out.println("expm1 of a is: " +Math.expm1(x));

        System.out.println("----------------------------------------");

        // 📍 Example 2:
        System.out.println("Example 2:");
        double a = 30;    
        // converting degrees values to radian    
        double rad = Math.toRadians(a);   
        System.out.println(a+" degrees converted to radians = "+ rad);
        // converting radian values to degrees
        double deg = Math.toDegrees(rad); 
        System.out.println(rad+" radians converted to degrees = "+ deg);
        // return the trigonometric sine of a      
        System.out.println("Sine value of a is: " +Math.sin(a));    
        // return the trigonometric cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cos(a));  
        // return the trigonometric tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tan(a));  
        // return the trigonometric arc sine of a      
        System.out.println("Sine value of a is: " +Math.asin(a));    
        // return the trigonometric arc cosine value of a  
        System.out.println("Cosine value of a is: " +Math.acos(a));  
        // return the trigonometric arc tangent value of a  
        System.out.println("Tangent value of a is: " +Math.atan(a));  
        // return the hyperbolic sine of a      
        System.out.println("Sine value of a is: " +Math.sinh(a));    
        // return the hyperbolic cosine value of a  
        System.out.println("Cosine value of a is: " +Math.cosh(a));  
        // return the hyperbolic tangent value of a  
        System.out.println("Tangent value of a is: " +Math.tanh(a));

        System.out.println("----------------------------------------");

        // 📍 Example 3:
        System.out.println("Example 3:");
        int p = 49;
        int n = -40;
        double dec1 = 23.2;
        double dec2 = 23.5;
        double dec3 = 23.8;
        // returns the absolute value of a value
        System.out.println("Math.abs(n) = "+ Math.abs(n));
        // returns the largest of two values
        System.out.println("Math.max(p,n) = "+ Math.max(p,n));
        // returns the smallest of two values
        System.out.println("Math.min(p,n) = "+ Math.min(p,n));
        // rounds the decimal number to its nearest value
        System.out.println("Math.round(dec1) = "+ Math.round(dec1));
        System.out.println("Math.round(dec2) = "+ Math.round(dec2));
        System.out.println("Math.round(dec3) = "+ Math.round(dec3));
        // returns the square root of a nymber
        System.out.println("Math.sqrt(p) = "+ Math.sqrt(p));
        // returns the cube root of a number
        System.out.println("Math.cbrt(p) = "+ Math.cbrt(p));
        // returns the value of 1st argument raised to the power to second argument
        System.out.println("Math.pow(p,2) = "+Math.pow(p,2));
        // used to find the sign of a given value
        System.out.println("Math.signum(p) = "+Math.signum(p));
        System.out.println("Math.signum(n) = "+Math.signum(n));
        // returns the ceil value of a number
        System.out.println("Math.ceil(dec1) = "+Math.ceil(dec1));
        System.out.println("Math.ceil(dec2) = "+Math.ceil(dec2));
        System.out.println("Math.ceil(dec3) = "+Math.ceil(dec3));
        // returns the floor value of a number
        System.out.println("Math.floor(dec1) = "+Math.floor(dec1));
        System.out.println("Math.floor(dec2) = "+Math.floor(dec2));
        System.out.println("Math.floor(dec3) = "+Math.floor(dec3));
        // returns a pseudorandom double value in the range [0.0, 1.0)
        System.out.println("Math.random() = "+ Math.random());

        // 📍 Study more from app.



    }
}