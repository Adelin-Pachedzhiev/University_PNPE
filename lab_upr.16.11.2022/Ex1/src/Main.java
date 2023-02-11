import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            User[] db = {
                    new User("adelin321", "somestrongpassword", "0894231333"),
                    new User("ivanchoo", "sjdiafdasfwdss", "2123445673"),
                    new User("desitooo", "somepassssssdesi", "2321232132")};

            Scanner sc = new Scanner(System.in);
            System.out.println("choose 1 for registration or 2 for login");
            int command = sc.nextInt();
            System.out.println("Enter username");
            String username = sc.next();
            System.out.println("Enter password");
            String password = sc.next();
            if (command == 1) {
//                
                User newUser;
                boolean isExistingUser = false;
                for (User user : db) {
                    if (user.getUserName().equals(username)){
                        isExistingUser = true;
                        break;
                    }
                }
                if(isExistingUser){
                    System.out.println("User already exist");
                } else {
                    System.out.println("enter password again");
                    String secondPassword = sc.next();
                    if(!password.equals(secondPassword)){
                        System.out.println("passwords don't match");
                        return;
                    }
                    System.out.println("enter phone number");
                    String phoneNum = sc.next();
                    newUser = new User(username,password,phoneNum);
                    System.out.println("Registered successfully");
                }
            }else if (command == 2){
                boolean isExistingUser = false;
                for (User user : db) {
                    if (user.getUserName().equals(username)){
                        isExistingUser = true;
                        if(user.getPassword().equals(password)){
                            System.out.println("Logged in !");
                        } else {
                            System.out.println("Wrong password !");
                        }
                        break;
                    }
                }
                if (!isExistingUser){
                    System.out.println("User doesn't exist");
                }


            }
        } catch (WrongPhoneNumberException e) {
            System.err.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println(e.getMessage());
        } catch (WrongUserException e) {
            System.err.println(e.getMessage());
        }

    }

}