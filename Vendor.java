public class Vendor {

    private String companyName;
    private String address;
    private String nameOfRepresentative;
    private String phoneNumber;

    public Vendor(){}

    public Vendor(String companyName, String address, String nameOfRepresentative, String phoneNumber){
        this.companyName = companyName;
        this.address = address;
        this.nameOfRepresentative = nameOfRepresentative;
        this.phoneNumber = phoneNumber;
    }

    String getCompanyName(){
        return companyName;
    }
    void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String address){
        this.address = address;
    }
    String getNameOfRepresentative(){
        return nameOfRepresentative;
    }
    void setNameOfRepresentative(String nameOfRepresentative){
        this.nameOfRepresentative = nameOfRepresentative;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return companyName + " " + address + " " + nameOfRepresentative + " " + phoneNumber;
    }

}
