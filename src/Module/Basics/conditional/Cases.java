package Module.Basics.conditional;

import java.util.Scanner;

//here we talk about switch
public class Cases {
    static void main() {
// you have  calendar, and you want to match the day with the phone   then we use swith
        Scanner scanner=new Scanner(System.in);
        int day =scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");

        }
       /* Example of fall through*/
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
        /*New syntax of switch */
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");//its optional
        }
        /*  Switch as Expression*/
        String value="five";
        String result =switch (value){
            case "one" -> {
                System.out.println(" no is one " );
                yield "value is one ";
            }
            case "two" -> {
                System.out.println(" no is one " );
                yield "value is two ";
            }
            case "five" -> {
                System.out.println(" no is one " );
                yield "value is five ";
            }
            case "negative" -> {
                System.out.println(" no is one " );
                yield "value is  negative";
            }

            default -> "case not matched";//an expression case it's not optional must be present
        };
        System.out.println("result = " + result);
      /*  Switch as Expression*/

    }
}