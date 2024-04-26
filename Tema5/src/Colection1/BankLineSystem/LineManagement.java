package Colection1.BankLineSystem;

import java.util.LinkedList;
import java.util.List;

public class LineManagement {
    private List<User> line;

    public LineManagement() {
        line = new LinkedList<>();
    }

    public void addUserToLine(User user) {
        line.add(user);
        System.out.println("USER ADDED TO THE LINE.");
    }

    public void serveNextUser() {
        if (!line.isEmpty()) {
            User servedUser = line.remove(0);
            System.out.println("SERVED USER: " + servedUser);
        } else {
            System.out.println("THERE IS NO USERS IN LINE.");
        }
    }

    public void removeUser(String dni) {
        boolean thisOne = false;
        List<User> temporaryLine = new LinkedList<>();
        for (User user : line) {
            if (user.getDni().equals(dni)) {
                System.out.println("USER REMOVED FROM THE LINE: " + user);
                thisOne = true;
            } else {
                temporaryLine.add(user);
            }
        }
        line = temporaryLine;
        if (!thisOne) {
            System.out.println("NO DNI MATCHES FOUND IN THE LINE");
        }
    }

}
