import java.util.Scanner;

interface Sports {
    int score = 5;

    void set_sportMark(int ms);
}

class Student {
    int rollno;
    String name;

    Student(int roll, String name) {
        this.rollno = roll;
        this.name = name;
    }

    void details() {
        System.out.println("\nName: " + name + ", Roll No. " + rollno);
    }
}

class Test extends Student {
    int sem1_marks, sem2_marks;

    Test(int m1, int m2, int roll, String name) {
        super(roll, name);
        sem1_marks = m1;
        sem2_marks = m2;
    }
}

class Result extends Test implements Sports {
    int total;

    Result(int m1, int m2, int roll, String name) {
        super(m1, m2, roll, name);
    }

    public void set_sportMark(int ms) {
        // score = ms;
    }

    void calculate() {
        total = sem1_marks + sem2_marks + score;
    }

    void display() {
        System.out.println("\nMarks1 = " + sem1_marks + "\nMarks2 = " + sem2_marks + "\nSports Marks = " + score
                + "\nTotal = " + total);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.print("Enter the Roll no.: ");
        int roll = sc.nextInt();

        System.out.print("Enter the sem1 marks: ");
        int m1 = sc.nextInt();
        System.out.print("Enter the sem2 marks: ");
        int m2 = sc.nextInt();

        Result r = new Result(m1, m2, roll, name);
        r.details();
        r.calculate();
        r.display();

    }
}

// interface Dog {
// void dogSound();
// }
// interface Cat {
// void catSound();
// }
// class Hapy implements Cat, Dog {
// public void dogSound() {
// System.out.println("bhow bhow");
// }
// public void catSound() {
// System.out.println("meow meow meow, yamete kudasai");
// }
// }
// public class Main {
// public static void main(String[] args) {
// Hapy pet = new Hapy();
// pet.dogSound();
// pet.catSound();
// }
// }