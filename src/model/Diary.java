package model;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    private String password;
    private boolean isLocked;
    private List <Entry> enteries = new ArrayList<Entry>();

    public Diary(){}


    public String getUsername() {
        return username;
    }

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
