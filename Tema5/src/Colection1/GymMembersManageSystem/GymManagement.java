package Colection1.GymMembersManageSystem;
import java.util.HashMap;
import java.util.Map;

public class GymManagement {
    private Map<String, Member> members;

    public GymManagement() {
        members = new HashMap<>();
    }

    public void addMember(String dni, Member member) {
        members.put(dni, member);
        System.out.println("USER ADDED CORRECTLY.");
    }

    public void unsubscribeMember(String dni) {
        if (members.containsKey(dni)) {
            members.remove(dni);
            System.out.println("MEMBER UNSUBSCRIBED SUCCESSFULLY.");
        } else {
            System.out.println("THE DNI ENTERED DOES NOT EXIST IN DATABASE.");
        }
    }

    public void showMemberData(String dni) {
        if (members.containsKey(dni)) {
            System.out.println("MEMBER DATA:");
            System.out.println(members.get(dni));
        } else {
            System.out.println("THERE IS NO MEMBER WITH THAT DNI IN DATABASE.");
        }
    }

    public void modifyMember(String dni, Member newMember) {
        if (members.containsKey(dni)) {
            members.put(dni, newMember);
            System.out.println("USER SUCCESSFULLY MODIFIED.");
        } else {
            System.out.println("THERE IS NO MEMBER WITH THAT DNI IN DATABASE.");
        }
    }

}
