package murach.business;

import java.io.Serializable;

public class TechSupport implements Serializable {

    private String Name;
    private String Phone;
    private String email;

    public TechSupport() {
        Name = "";
        Phone = "";
        email = "";
    }

    public TechSupport(String Name, String Phone, String email) {
        this.Name = Name;
        this.Phone = Phone;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
