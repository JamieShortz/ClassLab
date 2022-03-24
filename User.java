package murach.business;

import java.io.Serializable;

public class User implements Serializable {


    private String userName;
    private String passWord;

    public User() {       
        userName = "";
        passWord = "";
    }

    public User(String passWord, String userName) {        
        this.userName = userName;
        this.passWord = passWord;
    }

        public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
