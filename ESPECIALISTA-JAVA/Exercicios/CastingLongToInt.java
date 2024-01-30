public class CastingLongToInt {

    public static void main(String[] args) {
 
       long x = 10;
       //int y = x; Não compila sem o casting
       int y = (int) x;
       System.out.println(y);
       System.out.println("----------------------------");
       
        long a = 93000000000035L;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);
        
    }

}