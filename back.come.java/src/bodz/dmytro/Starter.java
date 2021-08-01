package bodz.dmytro;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person();
        person1.setName(Inputer.InputerS(scanner));
        person1.setAge(Inputer.inputerAge(scanner));
        person1.setBirthday(Inputer.InputerS(scanner));
        System.out.println("My name is " + person1.getName() + ", my age " + person1.getAge() + ", my birthday " + person1.getBirthday() );
    }
}
