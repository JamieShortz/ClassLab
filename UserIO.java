package murach.data;

import java.io.*;
import java.util.*;

import murach.business.*;

public class UserIO {

    public static User getUser(String userName, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(
                                new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String supportUser = t.nextToken();
                if (userName.equalsIgnoreCase(supportUser)) {
                    String passWord = t.nextToken();
                    //String userName = t.nextToken();
                    User s = new User();
                    s.setUserName(userName);
                    s.setPassWord(passWord);                   
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
                String userName = t.nextToken();
                String passWord = t.nextToken();
                User s = new User();
                s.setUserName(userName);
                s.setPassWord(passWord);
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
