import Day2.Exc10.*;
import Day2.exc4.Student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Tabuada tab = new Tabuada();
        // tab.tabuadaOf1();
        // Tabuada.tabuadaOf7(); 

        // IAmSimple test = new IAmSimple();
        // System.out.println(test.testingReturn());

        // Operations op = new Operations();
        // System.out.println(op.findTheLargestNumber(90, 2));

        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2, 2));
        // System.out.println(calc.sub(2, 2));
        // System.out.println(calc.mult(5, 5));
        // System.out.println(calc.div(25, 5));

        // ImprovedCalculator calc = new ImprovedCalculator();
        // System.out.println(calc.calculate(2, '+', 3));
        // System.out.println(calc.calculate(2, '-', 3));
        // System.out.println(calc.calculate(2, '*', 3));
        // System.out.println(calc.calculate(3, '/', 3));

        // Smart fib = new Smart();
        // fib.fibonacci(90);

        // Smart2 fac = new Smart2();
        // fac.factorialWithFor(5);
        // fac.factorialWithWhile(5);
        // fac.factorialWithDoWhile(1);

        // Animal cachorro = new Animal("hope", 2);
        // System.out.println(cachorro.getName());
        // cachorro.setName("laura");
        // System.out.println(cachorro.getName());

        // Animal novocachorro = new Animal(String("hope", 2, "brown");
        // System.out.println(novocachorro.t));

        // Animal [] meusAnimais = new Animal[5];
        // Animal cachorro = new Animal("hope", 2);
        // Animal gato = new Animal("sasha", 7);

        // meusAnimais[0] = cachorro;
        // meusAnimais[1] = gato;
        // System.out.println(meusAnimais[0]);
        // System.out.println(meusAnimais[1]);
        
        // Cat cat = new Cat();
        // System.out.println(cat.name);
        // System.out.println(cat.age);
        // Dog hope = new Dog("hope", "bown");
        // System.out.println(hope.name);
        // System.out.println(hope.color);

        // Book a = new Book();
        // Book b = new Book("null", "nuuu");
        // Book c = new Book("null", "nuuuu", 40);

        // System.out.println(a.title);
        // System.out.println(b.outhor);
        // System.out.println(c.price);

        // Student lala = new Student(333, "lala", 10);
        // System.out.println(lala.studentName);
        // System.out.println(lala.studentId);
        // System.out.println(lala.grade);

        // System.out.println(ComplexInicialization.x);
        // System.out.println(ComplexInicialization.y);
        // System.out.println(ComplexInicialization.z);

//         Rectangle rec = new Rectangle(10, 12);
//         Rectangle rec2 = new Rectangle(rec);
//         System.out.println(rec.length);
//         System.out.println(rec2.width);

        // Account ac = new Account(-1, 2);
        // Account ab = new Account(2, 2);
        // System.out.println(ac.accountNumber);
        // System.out.println(ab.accountNumber);

//        Point p = new Point(11.2, 0);
//        Point p2 =  new Point(3, 2);
//        System.out.println(p.x);
//        System.out.println(p.y);
//        System.out.println(p2.x);
//        System.out.println(p2.y);

//        String [] addName = new String[10];
//        for (int i = 0; i < 10; i++) {
//            addName[i] = "alice" + (i + 1);
//        }
//        Classroom classB = new Classroom("8avo B", addName);
//        System.out.println(classB.className);
//        System.out.println(Arrays.toString(classB.students));

        Person p = new Person("laura", 26, "Brazil");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getCountry());
    }
}
