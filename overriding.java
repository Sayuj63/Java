class A{
    public void add(int a, int b){
        int c=a+b;
        System.out.println("Sum of a, b: "+c);
    }
}
class B extends A{
    @Override
    public void add(int a, int b){
        int c=a-b;
        System.out.println("Sub: " +(a-b));
    }
}
public class overriding {
        public static void main(String[] args){
            B obj=new B();
            obj.add(2,4);
            obj.add(6,2);
            
        }
        
    }