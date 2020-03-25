import java.io.*;
import java.util.ArrayList;

public class Thaotac {
    ArrayList<Person> arrayList = new ArrayList<>();
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String path = "C:\\Users\\Admin\\IdeaProjects\\ThiLai\\Save.txt";
    File file = new File(path);

    Person person1 = new Person("Phong","0372229197","Ha Noi","abc@gmail.com","Nam","06/03/1997");
    Person person2 = new Person("Tho","0123456789","Nghe An","xyz@gmail.com","Nu","14/3/1995");
    Person person3 = new Person("Kieu Anh","08769543565","Ha Dong","Vukieuanh@gmail.com","nu","30/4/1992");


    public void menu(){
        System.out.println("-----QUAN LI DANH BA------");
        System.out.println(".CHOOSE A NUMBER TO CONTINUE");
        System.out.println("1.ShowList");
        System.out.println("2.ADD");
        System.out.println("3.Update");
        System.out.println("4.Remove");
        System.out.println("5.Search");
        System.out.println("6.ReadtoFile");
        System.out.println("7.WritetoFile");
        System.out.println("8.Exit ");
        System.out.println("Please chose");
    }
    public void demo(){
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
    }
    public void showList(){
        for (Person person:arrayList){
            System.out.println(person);
        }
    }
    public boolean update(String number, String name, String address, String birthday, String email, String sex){
        for (Person person:arrayList){
            if (person.getPhoneNumber().equals(number)){
                person.setName(name);
                person.setBirthday(birthday);
                person.setAddress(address);
                person.setSex(sex);
                System.out.println("Update is complete");
                return true;
            }
        }
        return false;
    }
    public boolean add(Person person){
        if (!arrayList.contains(person)){
            return arrayList.add(person);
        }return false;
    }
    public boolean remove(String phoneNumber){
        for (Person person:arrayList){
            if (person.getPhoneNumber().equals(phoneNumber)){
                arrayList.remove(phoneNumber);
                return true;
            }
        }
        return false;
    }
    public void readFile() throws IOException {
        bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine())!=null){
            String[] tmp = line.split(",");
            Person person = new Person(tmp[0],tmp[1],tmp[2],tmp[3],tmp[4],tmp[5]);
            arrayList.add(person);
        }
        bufferedReader.close();
    }
    public void writeFile() throws IOException {
        bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Person person:arrayList){
            bufferedWriter.write(String.valueOf(person));
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }


    public boolean checkPhoneNumber(String number) {
        for (Person person:arrayList){
            if (person.getPhoneNumber().equals(number)){
                return true;
            }
        }
        return false;
    }

    public void search(String phoneNumber) {
    }
}
