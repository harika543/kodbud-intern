import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Store dummy credentials
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("user", "pass");
        users.put("harika", "java123");

        // Input from user
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Validate login
        if (users.containsKey(username)) {
            if (users.get(username).equals(password)) {
                System.out.println("✅ Login Successful!");
            } else {
                System.out.println("❌ Incorrect Password!");
            }
        } else {
            System.out.println("❌ Username not found!");
        }

        sc.close();
    }
}
