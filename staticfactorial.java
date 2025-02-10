// factorial using static function

class factorialstatic
{
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
public class staticfactorial {
    public static void main(String[] args) {
        System.out.println(factorialstatic.fact(5));
    }
}