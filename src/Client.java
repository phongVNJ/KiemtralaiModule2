import jdk.nashorn.internal.ir.WhileNode;

import java.io.IOException;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Client {
    Person person = new Person();
    Scanner scanner = new Scanner(System.in);
    Thaotac thaotac = new Thaotac();
    RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
    RegexEmail regexEmail = new RegexEmail();


    public void showList() {
        thaotac.showList();
    }

    public void writeFile() throws IOException {
        thaotac.writeFile();
    }

    public void removePhoneNumber() {
        System.out.println("Nhap so dt muon xoa");
        String number = scanner.nextLine();
        boolean check = thaotac.checkPhoneNumber(number);
        if (check){
            System.out.println("Tim duoc so can xoa");
            System.out.println("Nhap Y de xoa");
            String input = scanner.nextLine();
            if (input.equals("Y")){
                thaotac.remove(number);
            }
        }else {
            System.out.println("Khong tim thay");
        }
    }

    public void searchPhoneNumber() {
        System.out.println("Nhap so dt muon tim");
        String phoneNumber = scanner.nextLine();
        thaotac.search(phoneNumber);
    }

    public void readFile() throws IOException {

        thaotac.readFile();
    }

    public void updatePhoneNumber() {
        System.out.println("Nhap so dt can sua");
        String number =scanner.nextLine();
        while (!regexPhoneNumber.validate(number)){
            System.out.println("sdt khong hop le");
            System.out.println("Nhap lai so dt");
            number =scanner.nextLine();
        }if (thaotac.checkPhoneNumber(number)){
            System.out.println("Nhap ten");
            String name =scanner.nextLine();
            System.out.println("Nhap ngay sinh");
            String bthday = scanner.nextLine();
            System.out.println("Nhap dia chi");
            String address = scanner.nextLine();
            System.out.println("Nhap email");
            String email = scanner.nextLine();
            while (!regexEmail.validate(email)){
                System.out.println("Email khong hop le");
                System.out.println("Nhap lai email");
                email = scanner.nextLine();
            }
            System.out.println("nhap gioi tinh");
            String sex = scanner.nextLine();
            thaotac.update(number,name,bthday,address,email,sex);
        }else {
            System.out.println("Khong tim thay so can sua");
        }

    }

    public void add() {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Nhap so dt");
        String phone = scanner.nextLine();
        while (!regexPhoneNumber.validate(phone)){
            System.out.println("so dien thoai khong hop le");
            System.out.println("Nhap lai sdt");
            phone = scanner.nextLine();
        }
        person.setPhoneNumber(phone);
        System.out.println("Nhap ngay sinh");
        String bthday=scanner.nextLine();
        person.setBirthday(bthday);
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        person.setAddress(address);
        System.out.println("Nhap email");
        String email = scanner.nextLine();
        while (!regexEmail.validate(email)){
            System.out.println("Email khong hop le");
            System.out.println("Nhap lai Email");
            email = scanner.nextLine();
        }
        person.setEmail(email);
        System.out.println("Nhap gioi tinh");
        String sex = scanner.nextLine();
        person.setSex(sex);
        thaotac.add(person);
    }

    public void demo() {
        thaotac.demo();
    }
    public void menu(){
        thaotac.menu();
    }
    public void checkRegexPhoneNumber(String phoneNumber){
        while (!regexPhoneNumber.validate(phoneNumber)){
            System.out.println("so dien thoai khong hop le");
            System.out.println("Nhap lai so dt");
            phoneNumber = scanner.nextLine();
        }
    }
    public void checkRegexEmail(String email){
        while (!regexEmail.validate(email)){
            System.out.println("Email khong hop le");
            System.out.println("Nhap lai email");
            email = scanner.nextLine();
        }
    }

}
