import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Задание 1
            Выведите на экран надпись "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs
            на разных строках. Пример вывода:
            “Your time is limited,
              so don’t waste it
                  living someone else’s life”
                       Steve Jobs

        */
        {
            System.out.println("""
                    Your time is limited,\s
                    \tso don’t waste it\s
                    \t\tliving someone else’s life\s
                    \t\t\tSteve Jobs""");
        }

        Scanner inputNumScanner = new Scanner(System.in);

        /*  Задание 2
            Пользователь вводит с клавиатуры два числа. Первое
            число — это значение, второе число процент, который
            необходимо посчитать. Например, мы ввели с клавиатуры
            50 и 10. Требуется вывести на экран 10 процентов от 50.
            Результат: 5
        */

        {
            float number, percent;

            try {

                System.out.println("Enter number Task2: ");
                number = Float.parseFloat(inputNumScanner.nextLine());

                System.out.println("Enter %: ");
                percent = Float.parseFloat(inputNumScanner.nextLine());

                float result = (number * percent / 100);

                System.out.println(percent + " % from " + number + " = " + result);
            }

            catch (NumberFormatException ex){
                System.out.println("Input number error");
                System.out.println(ex.getMessage());
            }

        }

        /*  Задание 3
            Пользователь вводит с клавиатуры три цифры. Необ-
            ходимо создать число, содержащее эти цифры. Например,
            если с клавиатуры введено 7, 3, 8, тогда нужно сформи-
            ровать число 738.

         */

        {
            try{
                System.out.println("Enter number Task3: ");
                String number = inputNumScanner.nextLine();
                int result = Integer.parseInt(number);
                System.out.println("Result number = " + result);
            }

            catch (NumberFormatException ex){
                System.out.println("Input number error");
                System.out.println(ex.getMessage());
            }

        }
    }
}