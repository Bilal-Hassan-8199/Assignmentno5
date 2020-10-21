// Use of for loop 
public class d  
{ 
    public static void main(String[] args)  
    { 
        // a and b scope is only  
        // within for loop 
        for(int a = 0,b = 0; a < 3 && b < 3; a++, b++)  
        {
            { 
            System.out.println(b);
            } 
      
            System.out.println(a); 
        }
    } 
} 