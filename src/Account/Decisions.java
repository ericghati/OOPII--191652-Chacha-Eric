import java.util.Scanner;

public class Decisions {

        Scanner sc = new Scanner(System.in);

        void checkGrade(){
            int mark;

            System.out.println("Enter mark: ");
            mark = sc.nextInt();

            if (mark >= 70) {
                System.out.println("You have an A grade");
            } else if (mark >= 60) {
                System.out.println("You have a B grade");
            } else if (mark >= 50) {
                System.out.println("You have a C grade");
            } else {
                System.out.println("You have  a D grade");
            }
        }

        public static void main(String[] args) {
            Decisions mark1 = new Decisions();
            mark1.checkGrade();
        }
}