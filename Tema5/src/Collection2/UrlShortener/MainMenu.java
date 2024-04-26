package Collection2.UrlShortener;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UrlShortenerFunctions urlShortener = new UrlShortenerFunctions();

        boolean close = false;
        while (!close) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("ENTER THE URL TO SHORTEN:");
                    String url = scanner.nextLine();
                    urlShortener.createNewRecord(url);
                    break;
                case 2:
                    System.out.println("ENTER THE SHORT KEY TO RESOLVE THE URL:");
                    String shortKey = scanner.nextLine();
                    urlShortener.resolveURL(shortKey);
                    break;
                case 3:
                    System.out.println("ENTER THE SHORT KEY TO DELETE THE RECORD:");
                    String deleteKey = scanner.nextLine();
                    urlShortener.deleteRecord(deleteKey);
                    break;
                case 4:
                    urlShortener.showAllRecords();
                    break;
                case 5:
                    System.out.println("BYE!");
                    close = true;
                    break;
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("""
        URL SHORTENER MENU:
        ----------------------------------------------------
        1 : CREATE NEW RECORD");
        2 : RESOLVE URL");
        3 : DELETE RECORD");
        4 : SHOW ALL RECORDS");
        5 : EXIT");
        ----------------------------------------------------
        PLEASE, ENTER YOUR CHOICE:
        """);
    }
}