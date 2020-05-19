import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //        Main main = new Main();
        //        StringUtils strUtil = new StringUtils();
        //        strUtil.isNumeric
        System.out.println("Enter something:");
        String input = sc.nextLine();
//        System.out.println("You Entered: \" " + input + "\"");
        System.out.printf("You Entered: \"%s\"\n", input);
        if(StringUtils.isNumeric(input)) {
            System.out.printf("\"%s\" is a number", input);
        } else {
            System.out.printf("\"%s\" is not a number", input);
        }




    }

}
