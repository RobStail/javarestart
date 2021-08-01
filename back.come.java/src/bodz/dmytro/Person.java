package bodz.dmytro;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private int age;
    private String birthday;




  /* private Person(String getName, int getAge, String getBirthday){
       this.name = getName;
       this.age = getAge;
       this.birthday = getBirthday;*/

}
