package Day1;
public class Smart2 {
    public void factorialWithFor(int a) {
        for ( int i = a; i > 1; i--) {
           a = a * (i -1);    
        }   
         System.out.println(a); 
    }
      public void factorialWithWhile(int a) {
        int i = a;
        while (i > 1) {
            a = a * (i -1); 
            i--;
        }
        System.out.println(a);
    }
      public void factorialWithDoWhile(int a) {
        if (a <= 1) {
            System.out.println(a);
        }
        else {
            int i = a;
            do {
                a = a * (i -1); 
                i--;
            } while (i > 1);
            System.out.println(a);
        }
    }
}
