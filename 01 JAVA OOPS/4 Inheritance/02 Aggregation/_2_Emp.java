public class _2_Emp {  
    int id;  
    String name;  
    _2_Address address;  
      
    public _2_Emp(int id, String name,_2_Address address) {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
    System.out.println(id+" "+name);  
    System.out.println(address.city+" "+address.state+" "+address.country);  
    }  
      
    public static void main(String[] args) {  
    _2_Address address1 = new _2_Address("gzb","UP","india");  
    _2_Address address2 = new _2_Address("gno","UP","india");  
      
    _2_Emp e = new _2_Emp(111,"varun",address1);  
    _2_Emp e2 = new _2_Emp(112,"arun",address2);  
          
    e.display();  
    e2.display();  
          
    }  
}

// Output:
// 111 varun
// gzb UP india
// 112 arun
// gno UP india