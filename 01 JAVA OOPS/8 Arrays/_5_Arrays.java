// 📍 Arrays:
// 📍 Addition of 2 Matrices in Java:
// 📍 Multiplication of 2 Matrices in Java:
public class _5_Arrays {
    public static void main(String[] args) {
        // 📍 Addition of 2 Matrices in Java:
        //Java Program to demonstrate the addition of two matrices in Java  
        //creating two matrices  
        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};  
        //creating another matrix to store the sum of two matrices  
        int c[][]=new int[2][3];  
        //adding and printing addition of 2 matrices  
        for(int i=0;i<2;i++){  
            for(int j=0;j<3;j++){  
                c[i][j]=a[i][j]+b[i][j];  
                System.out.print(c[i][j]+" ");  
            }  
            System.out.println();   //new line  
        }

        // 📍 Multiplication of 2 Matrices in Java:
        //Java Program to multiply two matrices  
        //creating two matrices    
        int a2[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b2[][]={{1,1,1},{2,2,2},{3,3,3}};  
        //creating another matrix to store the multiplication of two matrices    
        int c2[][]=new int[3][3];  //3 rows and 3 columns   
        //multiplying and printing multiplication of 2 matrices    
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c2[i][j]=0;      
                for(int k=0;k<3;k++){      
                    c2[i][j]+=a2[i][k]*b2[k][j];      
                }   //end of k loop  
                System.out.print(c2[i][j]+" ");  //printing matrix element  
            }   //end of j loop  
        System.out.println();   //new line    
        }    
    }
}
