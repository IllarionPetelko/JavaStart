import java.util.Scanner;
import java.util.ArrayList;

public class IfElseStatementTheme {
    public static void main(String[] args) {

        task9();
    }

    public static void task9() {
//кол-во банкнот в банкомате
        int hundredsStored = 9999;
        int tensStored = 5;
        int onesStored = 9999;
//банкноты запрашиваемые пользователем
        int hundredsReq = 0;
        int tensReq = 0;
        int onesReq = 0;
//банкноты к выдаче
        int hundredsToGive = 0;
        int tensToGive = 0;
        int onesToGive = 0;
//хватает банкнот?
        boolean enoughMoney = true;
//ввод суммы снятия с проверкой
        Scanner sc = new Scanner(System.in);
        int withdrawSum = 0;
        do {
            System.out.print("Введите сумму снятия (больше нуля): ");
            withdrawSum = sc.nextInt();
        } while (withdrawSum <= 0);
//разбиваем сумму на составляющие => еденицы, десятки , сотни, тысячи.
        int[] deconstructedNum = deconstructNum(withdrawSum);//разбиваем число на составляющие 345 => {3, 4, 5}
        int decNumLen = deconstructedNum.length;//длина списка
        onesReq = deconstructedNum[decNumLen-1];//еденицы к выдаче
        if (decNumLen > 1) {
            tensReq = deconstructedNum[decNumLen-2];//десятки к выдаче
        }
        if (decNumLen > 2) {
            for (int i = 0; i <= (decNumLen-3); i++) {
                hundredsReq = (hundredsReq * 10) + deconstructedNum[i];
            }
        }
//проверка сотен
        if ((decNumLen > 2) && (hundredsReq > hundredsStored)) {
            hundredsToGive = hundredsStored;
            tensReq += (hundredsReq - hundredsStored) * 10;
        } else if (hundredsReq <= hundredsStored) {
            hundredsToGive = hundredsReq;
        }
// проверка десятков
        if ((decNumLen > 1) && (tensReq > tensStored)) {
            tensToGive = tensStored;
            onesReq += (tensReq - tensStored) * 10;
        }
//проверка едениц
        if (onesReq > onesStored) {
            enoughMoney = false;
        } else {
            onesToGive = onesReq;
        }
//если в банкомате хватает банкнот, выводим на экран кол-во к выдаче
        if (enoughMoney == false) {
            System.out.println("Ошибка: в банкомате не хватает банкнот");
        } else {
            System.out.println("Сотен: " + hundredsToGive);
            System.out.println("Десятков: " + tensToGive);
            System.out.println("едениц: " + onesToGive);
        }

    }

    public static int[] deconstructNum(int num) {
        /*раазбивает число на составляющие, возвращает список.
        Пример: deconstructNum(3459) => {3, 4, 5, 9}*/

        String numToString = String.valueOf(num); //переводим число в строку
        int numDigits = numToString.length(); //длина числа
        int result[] = new int[numDigits]; //создаем список длинной с число

        String[] strArr = numToString.split("");//используем split для разбития числа на состовляющие
//переводим String список в Integer список
        for (int i = 0; i < numDigits; i++) {
            String currentChar = strArr[i];
            int currentInt = Integer.valueOf(currentChar);
            result[i] = currentInt;
        }

        return result;

    }



}