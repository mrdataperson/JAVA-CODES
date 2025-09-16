import java.util.Scanner;
// method without parameter without return type


/* public class metarr
{   
    static void greet()
    {
        System.out.println("good morning");
    }
    public static void main(String[] args)
    {
        greet();
    }
}*/

// call method with obj 

/*public class metarr
{   
    void greet()
    {
        System.out.println("good morning.....");
    }
    public static void main(String[] args)
    {   metarr obj = new metarr();
        obj.greet();
    }
}*/


// method without parameter with return type

/*public class metarr
{   
    static String greet()
    {
        return ("good__ morning");
    }
    public static void main(String[] args)
    {
    //String s = greet();
    System.out.println(greet());
    }
}*/



// method with parameter with return type
/*public class metarr
{   
    static String greet(String a)
    {
        return ("good__ morning"+ a);
    }
    public static void main(String[] args)
    {
    String a = "cse";
    System.out.println(greet(a));
    }
}*/

// method with parameter without return type
public class metarr
{   
    static void greet(String a, int b)
    {
        System.out.println(a + b);
    }
    public static void main(String[] args)
    {
    
    greet("cse", 5);
    }
}