package Day1;
public class Smart {
    public void fibonacci (int x) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for ( int i = 0; i < x; i++) {
            c = a + b; 
            a = b;
            b = c;
            System.out.println(c);
        }
       
    }
}
