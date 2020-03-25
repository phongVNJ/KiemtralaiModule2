public class Person {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String sex;
    private String birthday;

    public Person(String name,String phoneNumber,String address,String email,String sex,String birthday){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address =address;
        this.birthday = birthday;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
    }

    public Person() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String toString(){
        return this.name + ","+this.phoneNumber + ","+ this.email + ","+this.address+","+this.sex+","+ this.birthday;
    }
}
