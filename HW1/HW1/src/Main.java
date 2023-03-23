
import java.util.InputMismatchException;
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
//
//        /*  Задание 2
//            Пользователь вводит с клавиатуры два числа. Первое
//            число — это значение, второе число процент, который
//            необходимо посчитать. Например, мы ввели с клавиатуры
//            50 и 10. Требуется вывести на экран 10 процентов от 50.
//            Результат: 5
//        */
//
//        {
//            float number, percent;
//
//            try {
//
//                System.out.println("Enter number (Task2): ");
//                number = Float.parseFloat(inputNumScanner.nextLine());
//
//                System.out.println("Enter %: ");
//                percent = Float.parseFloat(inputNumScanner.nextLine());
//
//                float result = (number * percent / 100);
//
//                System.out.println(percent + " % from " + number + " = " + result);
//            }
//
//            catch (NumberFormatException ex){
//                System.out.println("Input number error");
//                System.out.println(ex.getMessage());
//            }
//
//        }
//
//        /*  Задание 3
//            Пользователь вводит с клавиатуры три цифры. Необ-
//            ходимо создать число, содержащее эти цифры. Например,
//            если с клавиатуры введено 7, 3, 8, тогда нужно сформи-
//            ровать число 738.
//
//         */
//
//        {
//            try{
//                System.out.println("Enter number (Task3): ");
//                String number = inputNumScanner.nextLine();
//                int result = Integer.parseInt(number);
//                System.out.println("Result number = " + result);
//            }
//
//            catch (NumberFormatException ex){
//                System.out.println("Input number error");
//                System.out.println(ex.getMessage());
//            }
//
//        }
//
//        /*
//            Задание 4
//            Пользователь вводит шестизначное число. Необходимо
//            поменять в этом числе первую и шестую цифры, а также
//            вторую и пятую цифры.
//            Например, 723895 должно превратиться в 593827.
//            Если пользователь ввел не шестизначное число число требуется вывести сообщение об ошибке.
//         */
//
//        {
//            try{
//                System.out.println("Enter 6 digit number (Task4): ");
//                String number = inputNumScanner.nextLine();
//
//                int a = 1, b = 6, c = 2, d = 5;
//
//                if (number.length() > 6) {
//
//                    System.out.println("Error! You enter more then 6 digit ");
//                }
//                else {
//                    number = String.copyValueOf(swap(number, a - 1, b - 1));
//                    number = String.copyValueOf(swap(number, c - 1, d - 1));
//                    System.out.println("Result number = " +  number);
//                }
//            }
//
//            catch (ArrayIndexOutOfBoundsException ex){
//                System.out.println("Input number error");
//                System.out.println(ex.getMessage());
//            }
//        }
//
//        /*
//            Задание 5
//            Пользователь вводит с клавиатуры номер месяца (от
//            1 до 12). В зависимости от полученного номера месяца
//            программа выводит на экран надпись: Winter (если введено
//            значение 1,2 или 12), Spring (если введено значение от 3
//            до 5), Summer (если введено значение от 6 до 8), Autumn
//            (если введено значение от 9 до 11).
//            Если пользователь ввел значение не в диапазоне от 1
//            до 12 требуется вывести сообщение об ошибке.
//         */
//
//        {
//            System.out.println("Enter number of month (Task5): ");
//
//            String month = inputNumScanner.nextLine();
//
//            switch (month) {
//                case "1", "2", "12" -> System.out.println("Winter");
//                case "3", "4", "5" -> System.out.println("Spring");
//                case "6", "7", "8" -> System.out.println("Summer");
//                case "9", "10", "11" -> System.out.println("Autumn");
//                default -> System.out.println("Error number of month:" + month);
//            }
//
//        }
//
//        /*
//            Задание 6
//            Пользователь вводит с клавиатуры количество метров.
//            В зависимости от выбора пользователя программа
//            переводит метры в мили, дюймы или ярды.
//         */
//
//        {
//            try{
//                System.out.println("Enter meter (Task6): ");
//                float value = inputNumScanner.nextFloat();
//                System.out.println("Enter in which system to convert the entered value in miles (1), inches (2) or yards (3):");
//                int systemConvert = inputNumScanner.nextInt();
//                float result;
//                float miles = 1609;
//                float inches = 39.37f;
//                float yards = 1.094f;
//
//
//                    switch (systemConvert) {
//                        case 1 -> {
//                            result = value / miles;
//                            System.out.println(value + "m = " + result + " miles");
//                        }
//                        case 2 -> {
//                            result = value * inches;
//                            System.out.println(value + "m = " + result + " inches");
//                        }
//                        case 3 -> {
//                            result = value * yards;
//                            System.out.println(value + "m = " + result + " yards");
//                        }
//                        default -> System.out.println("Error value!");
//                    }
//            }
//            catch (InputMismatchException ex){
//            System.out.println("Input error");
//            System.out.println(ex.getMessage());
//        }

        /*   Задание 7
            Пользователь вводит с клавиатуры два числа. Нужно
            показать все нечетные числа в указанном диапазоне. Если
            границы диапазона указаны неправильно требуется произвести
            нормализацию границ. Например, пользователь ввел 20 и 11,
            требуется нормализация, после которой
            начало диапазона станет равно 11, а конец 20.
        */
        {
            try{
            System.out.println("Enter first number (Task7): ");
            int numberOne = inputNumScanner.nextInt();
            System.out.println("Enter second number:");
            int numberTwo = inputNumScanner.nextInt();

            if(numberOne == numberTwo)
                System.out.println("You entered the same values");

            else {
                if (numberOne > numberTwo) {
                    int temp = numberOne;
                    numberOne = numberTwo;
                    numberTwo = temp;
                }
                String result = "";
                result = OddNumbers(result, numberOne, numberTwo);
                System.out.println(result);
            }
            }
            catch (InputMismatchException ex){
            System.out.println("Input number error");
            System.out.println(ex.getMessage());
            }


        }
    }

    //Task4
    static char[] swap(String str, int a, int b)
    {
        char[] ch = str.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return ch;
    }

    static String OddNumbers(String result, int numberOne, int numberTwo)
    {
        StringBuilder resultBuilder = new StringBuilder(result);
        do{
            if (numberOne % 2 != 0)
            {
                resultBuilder.append(numberOne).append(" ");
                numberOne++;
            }
            else
                numberOne++;

        }while(numberOne < numberTwo);
        result = resultBuilder.toString();
        return result;
    }
}