package CaseStudy.Models;

public class Customer {
    private String idCus;
    private String nameCustomer;
    private String gender;
    private int idCard;
    private int phone;
    private String mail;
    private String typeCustomer;
    private String Address;
    private String birthday;
    private Service service;

    public Customer() {
    }

    public Customer(String idCus, String nameCustomer, String gender, int idCard, int phone, String mail, String typeCustomer, String address, String birthday) {
        this.idCus = idCus;
        this.nameCustomer = nameCustomer;
        this.gender = gender;
        this.idCard = idCard;
        this.phone = phone;
        this.mail = mail;
        this.typeCustomer = typeCustomer;
        this.Address = address;
        this.birthday = birthday;
//        this.service = service;
    }

    public String getIdCus() {
        return idCus;
    }
    public void setIdCus(String idCus) {
        this.idCus = idCus;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String showInfor() {
        return "\nId Customer: " + idCus+
                "\nName Customer: " + nameCustomer +
                "\nGender: " + gender +
                "\nId Card: " + idCard +
                "\nPhone: " + phone +
                "\nMail: " + mail  +
                "\nType Customer: " + typeCustomer +
                "\nAddress: " + Address +
                "\nBirthday: " + birthday;
    }
}
