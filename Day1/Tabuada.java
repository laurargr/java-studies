package Day1;
public class Tabuada {
    public void tabuadaOf1() {
        for (int i = 1; i <= 20; i++){
            System.out.println("1 * " + i + " = " + 1 * i);
        }
    }
    public static void tabuadaOf7() {
        for (int i = 0; i < 20; i++){
            int a = 7;
            int b = i + 1;
            int c = a * b;
            System.out.println( "7 * " + b + " = " + c);
        }
    }
}
