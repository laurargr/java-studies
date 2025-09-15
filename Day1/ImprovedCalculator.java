package Day1;
public class ImprovedCalculator {
    public int calculate(int a, char b, int c) {
        int result = 0;
        if (b == '+') {
           result = a + c;
        }
        if (b == '-') {
           result = a - c;
        }
        if (b == '*') {
           result = a * c;
        }
        if (b == '/') {
           result = a / c;
        }
        return result;
    }
}
