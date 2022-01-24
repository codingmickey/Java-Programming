import java.util.Scanner;

class Result {
    int seatNo, centerNo, deMarks, dbmsMarks, dsMarks, disMarks, mathMarks, total;
    String name, date;

    int checkMarks(int marks, String sub) {
        while (true) {
            try {
                if (marks < 0 || marks > 100) {
                    throw new MarksOutOfBoundsException("Invalid " + sub + " marks!!");
                } else {
                    return marks;
                }
            } catch (MarksOutOfBoundsException me) {
                Scanner sc = new Scanner(System.in);
                System.out.println(me);
                System.out.print("\nEnter " + sub + " marks again: ");
                marks = sc.nextInt();
            }
        }
    }

    void displayResult() {
        total = deMarks + dbmsMarks + dsMarks + disMarks + mathMarks;
        System.out.println("\n\tCenter No.: " + centerNo + "\n\tDate: " + date);
        System.out.println("\nStudent Name: " + name + "\tSeat No.: " + seatNo + "\nMarks(Out of 100):");
        System.out.println("DE\tDBMS\tDS\tDIS\tMaths\tTotal(500)");
        System.out.printf("%d\t%d\t%d\t%d\t%d\t%d", deMarks, dbmsMarks, dsMarks, disMarks, mathMarks, total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RESULT DATA");
        Result r = new Result();

        System.out.println("Enter Center No.: ");
        r.centerNo = sc.nextInt();
        System.out.println("Enter Seat No.: ");
        r.seatNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name of student: ");
        r.name = sc.nextLine();
        System.out.println("Enter Date: ");
        r.date = sc.nextLine();
        System.out.println("Enter marks of DE: ");
        r.deMarks = r.checkMarks(sc.nextInt(), "DE");
        System.out.println("Enter marks of DBMS: ");
        r.dbmsMarks = r.checkMarks(sc.nextInt(), "DBMS");
        System.out.println("Enter marks of DS: ");
        r.dsMarks = r.checkMarks(sc.nextInt(), "DS");
        System.out.println("Enter marks of DIS: ");
        r.disMarks = r.checkMarks(sc.nextInt(), "DIS");
        System.out.println("Enter marks of Maths: ");
        r.mathMarks = r.checkMarks(sc.nextInt(), "Maths");

        r.displayResult();
    }
}

class MarksOutOfBoundsException extends Exception {
    MarksOutOfBoundsException(String msg) {
        System.out.println(msg);
    }
}
