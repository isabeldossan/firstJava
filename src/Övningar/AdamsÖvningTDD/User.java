package Övningar.AdamsÖvningTDD;

public class User {
    private String userName;
    private String password;
    private String userType;

    public User(String myName, String myPassword) {
        userName = myName;
        password = myPassword;
        userType = "Normal"; //VI HAR INTE MED NORMAL I KONSTRUKTOR FÖR VI VILL ATT USER ALLTID SKA BÖRJA SOM NORMAL.
        userType = "Super";
    }

    public String getUserType() {
        return userType;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String newName) {
        if (newName.length() >= 4) {
            userName = newName;
        }
    }

    public void setPassword(String newPassword) {
        if(newPassword.length() >= 7 && newPassword.length() <= 20 && newPassword.matches(".*[!&].*")) {
            password = newPassword;
        }
    }

    public void setUserType(String newUsertype) {
        if(userType.equals("Normal") || userType.equals("Super")) {
            userType = newUsertype;
        }
    }









}