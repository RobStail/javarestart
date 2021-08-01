package bodz.dmytro;

import java.util.Scanner;

public class Inputer {

    public static String InputerS(Scanner scanner){
        String inpuerStr = scanner.nextLine();
        return inpuerStr;
    }
    public static int inputerAge(Scanner scanner){
         String inpuerInt = scanner.nextLine();
         return Integer.parseInt(inpuerInt);
    }
}
