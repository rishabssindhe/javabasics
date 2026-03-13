package day9.map;
import java.util.*;
public class ApiLogs {
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","Sign Up");
        logs.put("1","Login");
        logs.put("4","Browse videos ");
        logs.put("3","Scroll up or scroll down");
        logs.put("5","Logout");
        System.out.println("Arr logs: "+logs);
    }
}
