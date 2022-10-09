public class Main {
    public static void main(String[] args) {
        System.out.println(" циклы 2");

        System.out.println(" Задание №1 ");
        int salary = 15_000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
        }
        System.out.println(" Месяц " + i + ", сумма накоплений равна " + total + " рублей ");
        System.out.println();
        System.out.println(" Задание №2 ");

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + " ");
        }
        for (; number > 0; --number) {
            System.out.print(number + "  ");
        }
        System.out.println();
        System.out.println(" Задание № 3 ");
        int b = 12_000_000;
        int nowYear = 0;
        for (int y = 1; y <= 10; y++) {
            nowYear = (b / 1000) * (17 - 8);
            nowYear = nowYear * y;
            nowYear = b + nowYear;
            System.out.println(" Год " + y + ", численость населения составит " + nowYear + " человек ");
        }
        System.out.println();
        System.out.println("  Задание № 4 ");
        int salary2 = 15_000;
        int total2 = 0;
        int p = 0;
        for (; total2 < 12_000_000; p++) {
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + salary2;
            //    if (p % 1  == 0)}
            {  System.out.println(" Месяц " + p + ", сумма накоплений равна " + total2 + " рублей ");
            }
        }
        System.out.println();
        System.out.println(" Задание №5");
        int total3 = 0;
        int salary3 = 15_000;
        int s = 0;
        for (; total3 < 12_000_000; s++) {
            total3 = total3 + total3 * 7 / 100;
            total3 = total3 + salary3;
            if (s % 6 == 0) {
                System.out.println(" Месяц " + s + ", сумма накоплений равна " + total3 + " рублей ");
            }
        }
        System.out.println();
        System.out.println("Задание № 6 ");
        int salary4 = 15_000;
        int total4 = 0;
        int mon = 0;
        while (mon <= 108) {
            total4 = total4 + total4 * 7 / 100;
            total4 = total4 + salary4;
            mon++;
            if (mon % 6 == 0) {
                System.out.println(" Месяц " + mon + ", сумма накоплений равна " + total4 + " рублей ");
            }
        }
        System.out.println();
        System.out.println(" Задание № 7 ");
        int f = 1;
        for (; f <= 31; f += 7) {
            System.out.printf(" Сегодня пятница , %d -e число . Необходимо подготовить отчет .\n", f);
        }
        System.out.println();
        System.out.println(" Задание № 8 ");
        int cometCycle = 2022;
        int beginning = cometCycle - 200;
        int ending = cometCycle + 100;
        for (int j = beginning; j < ending; ++j) {
            if (j % 79 == 0) {
                System.out.println(j);
            }
        }
        System.out.println();
        System.out.println(" Задание № 9 ");
        int result;
        for (int h = 1; h <= 10; h++) {
            result = h * 2;
            System.out.println(" 2 * " + h + " = " + result);
        }
    }
}
