

class A{
    public void add(int a, int b){
        int c= a+b;
        System.out.println("Sum a and b: "+c);
    }
}
class B extends A{
    public void add(int a,int b ,int c){
        int d = a+b+c;
        System.out.println("Suma,b,c: "+d);
    }
}
public class overloading{
    public static void main(String[] args){
        B obj=new B();
        obj.add(50,100);
        
    }
    
}