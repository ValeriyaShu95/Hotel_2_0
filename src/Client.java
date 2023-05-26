public class Client {
    private String name;
    private String gender;
    private String phoneNumber;
    private String eMail;
    private Integer billAmmount;


    public Client(String name, String gender, String phoneNumber, String eMail, Integer billAmmount) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.billAmmount = billAmmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public Integer getBillAmmount() {
        return billAmmount;
    }

    public void setBillAmmountll(Integer billAmmountl) {
        this.billAmmount = billAmmount;
    }
}
