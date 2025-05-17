public class MainApplication {

    public static void main(String[] args) {

        Admin admin1 = new Admin(0001, "Eric", "4tyU3$dW");

        User user1 = new User(4455, "Mary Jane");

        admin1.performOperation(new Update()); // Admin Updates the data.

        user1.performOperation(new View()); // User can view the data.


    }

}
