package Colection1.GymMembersManageSystem;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GymManagement gymManagement = new GymManagement();
        boolean close = false;
        System.out.println("GYM MEMBERS MANAGE SYSTEM:");
        while(!close) {
        showMenu();
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("""
                        -----------------------------------------------
                        1 : SIGN UP A MEMBER:
                        INSERT DNI:\s""");
                String addDni = scanner.next();
                System.out.println("INSERT NAME:");
                String addName = scanner.next();
                System.out.println("INSERT LAST NAME:");
                String addLastName = scanner.next();
                System.out.println("INSERT AGE:");
                int addAge = scanner.nextInt();
                gymManagement.addMember(addDni, new Member(addName, addLastName, addAge));
                System.out.println("-----------------------------------------------");
                break;
            case 2:
                System.out.println("""
                        -----------------------------------------------
                        2 : UNSUBSCRIBE A MEMBER:
                        INSERT DNI TO ERASE MEMBER FROM DATABASE:
                        """);
                String eraseDNI = scanner.next();
                gymManagement.unsubscribeMember(eraseDNI);
                System.out.println("-----------------------------------------------");
                break;
            case 3:
                System.out.println("""
                        -----------------------------------------------
                        3 : SHOW MEMBER DATA:
                        INSERT DNI:
                        """);
                String showDNI = scanner.next();
                gymManagement.showMemberData(showDNI);
                System.out.println("-----------------------------------------------");
                break;
            case 4:
                System.out.println("""
                        -----------------------------------------------
                        4 : MODIFY MEMBER DATA:
                        INSERT DNI:
                        """);
                String modifyDNI = scanner.next();
                System.out.println("INSERT NEW NAME:");
                String newName = scanner.next();
                System.out.println("INSERT NEW LAST NAME:");
                String newLastName = scanner.next();
                System.out.println("INSERT NEW AGE:");
                int newAge = scanner.nextInt();
                gymManagement.modifyMember(modifyDNI, new Member(newName, newLastName, newAge));
                break;
            case 5:
                System.out.println("BYE!");
                close = true;
                System.exit(0);
            default:
                System.out.println("INVALID OPTION. TRY AGAIN.");

        }}
    }

    public static void showMenu(){
        System.out.println("""
                MAIN MENU
                -----------------------------------------------
                INSERT THE NUMBER OF THE TASK YOU WANT TO PERFORM:
                 1 : SIGN UP A MEMBER.
                 2 : UNSUBSCRIBE A MEMBER.
                 3 : SHOW MEMBER DATA.
                 4 : MODIFY MEMBER DATA.
                 5 : EXIT.
                -----------------------------------------------
                """);
    }
}