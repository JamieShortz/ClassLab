package murach.business;

import java.io.Serializable;

public class User implements Serializable {


    private String email;
    private String passWord;

    public User() {       
        email = "";
        passWord = "";
    }

    public User(String passWord, String email) {        
        this.email = email;
        this.passWord = passWord;
    }

        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
