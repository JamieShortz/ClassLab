package murach.email;

import java.io.*;
import java.util.*;

import murach.business.*;

public class TechSupportIO {

    public static TechSupport getTechSupport(String name, String filepath) {
        try {
            File file = new File(filepath);
            BufferedReader in = new BufferedReader(
                                new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String supportName = t.nextToken();
                if (name.equalsIgnoreCase(supportName)) {
                    String phone = t.nextToken();
                    String email = t.nextToken();
                    TechSupport s = new TechSupport();
                    s.setName(name);
                    s.setPhone(phone);
                    s.setEmail(email);
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

    public static ArrayList<TechSupport> getTechSupport(String filepath) {
        ArrayList<TechSupport> support = new ArrayList<TechSupport>();
        File file = new File(filepath);
        try {
            BufferedReader in = new BufferedReader(
                                new FileReader(file));

            String line = in.readLine();
            while (line != null) {
                StringTokenizer t = new StringTokenizer(line, "|");
                String name = t.nextToken();
                String phone = t.nextToken();
                String email = t.nextToken();
                TechSupport s = new TechSupport();
                s.setName(name);
                s.setPhone(phone);
                s.setEmail(email);
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
