package ru.stqa.pft.addressbook;

public class NewUserData {
    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String mobile;
    private final String address;
    private final String email;
    private final String selectedGroup;
    private final String bday;
    private final String bmonth;
    private final String byear;

    public NewUserData(String firstname, String lastname, String nickname, String title, String company, String mobile, String address, String email, String selectedGroup, String bday, String bmonth, String byear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.mobile = mobile;
        this.address = address;
        this.email = email;
        this.selectedGroup = selectedGroup;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getSelectedGroup() {
        return selectedGroup;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
