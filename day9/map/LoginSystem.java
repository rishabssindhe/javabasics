package day9.map;
import java.util.*;
public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> users=new HashMap<>();
        users.put("Admin","admin@123");
        users.put("User 1","pass1");
        users.put("User 2","pass2");
        users.put("User 3","pass3");
        users.put("User 4","pass4");
        users.put("Admin","admin@1234");
        System.out.println(users);// how usernames and passwords are stored  ans : HashMap
    }
}
