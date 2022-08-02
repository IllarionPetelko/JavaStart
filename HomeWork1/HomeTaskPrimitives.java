public class HomeTaskPrimitives {
    public static void main (String[] args) {
    //по очеререди вызываем все задания

        System.out.println("Задание №2");
        task2();
        System.out.println(" ");
        System.out.println("Задание №3");
        task3();
        System.out.println(" ");
        System.out.println("Задание №4");
        task4();
        System.out.println(" ");
        System.out.println("Задание №5");
        task5();
        System.out.println(" ");
        System.out.println("Задание №6");
        task6();
        System.out.println(" ");
        System.out.println("Задание №7");
        task7();
        System.out.println(" ");
        System.out.println("Задание №8");
        task8();
        System.out.println(" ");
        System.out.println("Задание №9");
        task9();
        System.out.println(" ");
        System.out.println("Задание №10");
        task10();
        System.out.println(" ");
    }

    public static void task2() {
    /*товар X стоит 100 руб, а товар Y — 200 руб.
    вместе на них действует скидка 11%
    отобразите в консоли:
        сумму скидки
        общую стоимость товаров со скидкой*/

        int x = 100;
        int y = 200;
        int discount = ((x + y)/100) * 11;
        int total = (x + y) - discount;
        System.out.println("Скидка: " + discount);
        System.out.println("Сумма со скидкой: " + total);
    }

    public static void task3(){
        //отобразите в консоли слово JAVA как на картинке

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

    }

    public static void task4() {
        /*создайте переменные всех целых числовых типов
присвойте им самые большие числа, которые они могут хранить
инкрементируйте, а затем декрементируйте все значения на единицу 
выводите данные на консоль для каждой переменной в следующей последовательности:
    первоначальное значение
    значение после инкремента
    значение после декремента*/

        byte b = Byte.MAX_VALUE;
        short s = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE;
        float f = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;

        System.out.println(b);
        System.out.println(b + 1);
        System.out.println(b - 1);
        System.out.println(s);
        System.out.println(s + 1);
        System.out.println(s - 1);
        System.out.println(i);
        System.out.println(i + 1);
        System.out.println(i - 1);
        System.out.println(l);
        System.out.println(l + 1);
        System.out.println(l - 1);
        System.out.println(f);
        System.out.println(f + 1);
        System.out.println(f - 1);
        System.out.println(d);
        System.out.println(d + 1);
        System.out.println(d - 1);
    }

    public static void task5() {
        //создайте две переменные типа int, присвоив им значения 1 и 2

        int a = 1;
        int b = 2;
        //поменяйте значения переменных местами разными способами:
        //1.с помощью третьей переменной

        System.out.println("с помощью третьей переменной");
        System.out.println("a = " + a + " b = " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("a = " + a + " b = " + b);

        //с помощью арифметических операций
        System.out.println("с помощью арифметических операций");
        System.out.println("a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);

        //с помощью побитовой операции
        System.out.println("с помощью побитовой операции");
        System.out.println("a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }

    public static void task6() {
        /*создайте 5 переменных, присвоив им значения: 35, 38, 64, 94, 95
отобразите в консоли в столбец:
код символа
а напротив соответствующий ему символ (делайте это программно, а не написав его самим)*/

        int one = 35;
        int two = 38;
        int three = 94;
        int four = 95;

        System.out.println(one + " = " + Character.toString((char)one));
        System.out.println(two + " = " + Character.toString((char)two));
        System.out.println(three + " = " + Character.toString((char)three));
        System.out.println(four + " = " + Character.toString((char)four));
    }

    public static void task7() {
        /*имеется число 345
найдите произведение, а затем сумму его цифр
не используйте цикл
выделяйте каждую цифру числа программно, а не написав их самим
используйте для этого только операции / и %
выведите результат в следующем формате:
сумма цифр числа N = столько-то
произведение цифр числа N = столько-то*/

    int a = 345;
    int hundreds = a / 100;
    int tens = (a - (hundreds * 100)) / 10;
    int ones = (a - (tens * 10) - (hundreds * 100));
    int sum = hundreds + tens + ones;
    int multipy = hundreds * tens * ones;

    System.out.println("сумма цифр числа 345 = " + sum);
    System.out.println("произведение цифр числа 345 = " + multipy);
    }

    public static void task8() {
        /*отобразите в консоли Java-талисман, используя символы из примера ниже:
    /\    
   /  \   
  /_( )\  
 /      \ 
/____/\__\
каждый уникальный символ, включая пробел, храните в отдельной переменной
отобразите (построчно, а не посимвольно) результат в консоль, используя значения переменных*/
        
        String s = " ";
        String l = "/";
        String r = Character.toString((char)92);
        String d = "_";
        String q = "(";
        String w = ")";

        System.out.println(s+s+s+s+l+r+s+s+s+s);
        System.out.println(s+s+s+l+s+s+r+s+s+s);
        System.out.println(s+s+l+d+q+s+w+r+s+s);
        System.out.println(s+l+s+s+s+s+s+s+r+s);
        System.out.println(l+d+d+d+d+l+r+d+d+r);
    }

    public static void task9() {
        /*имеется число 123
выделите у него программно сотни, десятки и единицы
используйте для этого только операции / и %
отобразите результат, как “Число N содержит:”
X сотен
Y десятков
Z единиц*/

        int a = 123;
        int hundreds = a / 100;
        int tens = ((a - (hundreds * 100)) / 10);
        int ones = (a - (tens * 10) - (hundreds * 100));

        System.out.println(hundreds + "сотен");
        System.out.println(tens + "десятков");
        System.out.println(ones + "едениц");
    }

    public static void task10() {
        /*имеется количество секунд 86399
переведите его в часы, минуты и секунды
используйте для этого только операции / и %
отобразите полученные значения в формате ЧЧ:ММ:СС*/

        int totalseconds = 86399;
        int hours = totalseconds / 3600;
        int minutes = (totalseconds % 3600) / 60;
        int secs = totalseconds % 60;
        System.out.println(hours + ":" + minutes + ":" + secs);

    }

}