package day8.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EmailNotification {
    public static void main(String[] args) {
        Set<String> emailQueue=new HashSet<>();
        emailQueue.add("rishabssindhe@gmail.com");//use when u want to remove duplicates
        emailQueue.add("rishabssindhe4@gmail.com");
        emailQueue.add("rishabssindhe@gmail.com");
        emailQueue.add("rishabssindhe@gmail.com");
        emailQueue.add("rishabssindhe@gmail.com");
        System.out.println(emailQueue);
        System.out.println(emailQueue.size());

    }
}
