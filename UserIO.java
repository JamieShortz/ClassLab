package murach.data;

import java.io.*;
import java.util.*;

import murach.business.*;

public class UserIO {

    public static User getUser(String username, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(
                                new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String supportUser = t.nextToken();
                if (username.equalsIgnoreCase(supportUser)) {
                    String password = t.nextToken();
                    //String username = t.nextToken();
                    User s = new User();
                    s.setPassWord(password);
                    s.setUserName(username);
                    in.close();
                    return s;
                }
                line = in.readLine();
            }
            in.close();
            return null;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }

    public static ArrayList<User> getTechSupport(String filepath) {
        ArrayList<User> support = new ArrayList<User>();
        File file = new File(filepath);
        try {
            BufferedReader in = new BufferedReader(
                                new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String password = t.nextToken();
                String username = t.nextToken();
                User s = new User();
                s.setPassWord(password);
                s.setUserName(username);
                support.add(s);
                line = in.readLine();
            }
            in.close();
            return support;
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }
}
