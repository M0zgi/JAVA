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

    /*  Задание 2
        Пользователь вводит с клавиатуры два числа. Первое
        число — это значение, второе число процент, который
        необходимо посчитать. Например, мы ввели с клавиатуры
        50 и 10. Требуется вывести на экран 10 процентов от 50.
        Результат: 5
    */

        {
            int number, percent;
            Scanner inputNumScanner = new Scanner(System.in);

            System.out.println("Enter number: ");
            number = inputNumScanner.nextInt();

            System.out.println("Enter %: ");
            percent = inputNumScanner.nextInt();

            float result = (number * percent / 100);

            System.out.println(percent + " % from " + number + " = " + result);
        }
    }
}