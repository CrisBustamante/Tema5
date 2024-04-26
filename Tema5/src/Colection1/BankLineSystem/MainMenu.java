package Colection1.BankLineSystem;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LineManagement lineManagement = new LineManagement();
        boolean close = false;
        while(!close) {
            showMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("""
                        -----------------------------------------------
                        1 : ADD USER TO THE LINE:
                        INSERT NAME:\s""");
                    String addName = scanner.next();
                    System.out.println("INSERT LAST NAME:");
                    String addLastName = scanner.next();
                    System.out.println("INSERT AGE:");
                    int addAge = scanner.nextInt();
                    System.out.println("INSERT DNI:");
                    String addDni = scanner.next();
                    lineManagement.addUserToLine(new User(addName, addLastName, addAge, addDni));
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    lineManagement.serveNextUser();
                    break;
                case 3:
                    System.out.println("INSERT DNI TO REMOVE USER FROM THE LINE:");
                    String removeDni = scanner.next();
                    lineManagement.removeUser(removeDni);
                    break;
                case 4:
                case 5:
                    System.out.println("BYE!");
                    close = true;
                    System.exit(0);
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN.");
            }
        }
    }
    public static void showMenu(){
        System.out.println("""
                MAIN MENU
                -----------------------------------------------
                INSERT THE NUMBER OF THE TASK YOU WANT TO PERFORM:
                 1 : ADD USER TO THE LINE.
                 2 : SERVE NEXT USER.
                 3 : REMOVE USER FROM THE LINE.
                 4 : EXIT.
                -----------------------------------------------
                """);
    }
}
