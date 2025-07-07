package WhileLoop;

import java.util.Scanner;

public class While {

    Scanner sc = new Scanner(System.in);

    void CheckNumber(){
        int number = 50;
        int even;

        while (number % 2 == 0 && number > 1) {
            System.out.println(" " + number);
            number -= 2;
        }
    }
        public static void main(String[] args)
        {
        While number = new While();
        number.CheckNumber();
        }

}
