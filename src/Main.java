//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int salary = 15000;
            int total = 0;
            int month = 0;
            while (total < 2_459_000) {
                month++;
                total = total + total / 100;
                total = total + salary;
                System.out.println(" Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            System.out.println("Задача 2");
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i = i + 1;
            }
            System.out.println(" ");
            for (i = 10; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println(" ");

            System.out.println("Задача 3");
            int y = 12_000_000;
            int pyDifference = y / 1000;
            int birthRate = 17;
            int mortality = 8;
            for (int year = 1; year <= 10; year++) {
                y = y + ((birthRate - mortality) * pyDifference);
                System.out.println(" Год " + year + " численность начеления составляет " + y);
            }
            System.out.println("Задача 4");
            int accumulation = 15000;
            int totalA = 0;
            int monthA = 0;
            for (; totalA < 12_000_000; monthA++) {
                totalA = totalA + (totalA * 7 / 100);
                totalA = totalA + accumulation;
                System.out.println("Месяц " + monthA + " сумма накоплений равна " + totalA);
            }
            System.out.println("Задача 5");
            int accumulationTwo = 15000;
            int totalATwo = 0;
            int monthATwo = 0;
            for (; totalATwo < 12_000_000; monthATwo++) {
                totalATwo = totalATwo + (totalATwo * 7 / 100);
                totalATwo = totalATwo + accumulationTwo;
                if (monthATwo % 6 == 0) {
                    System.out.println("Месяц " + monthATwo + " сумма накоплений равна " + totalATwo);
                }
            }
            System.out.println("Задача 6");
            int SalaryVasil = 15000;
            int totalVasil = 0;
            int totalTime = 9 * 12;
            for (int z = 0; z <= totalTime; z++) {
                totalVasil = totalVasil + (totalVasil * 7 / 100);
                totalVasil = totalVasil + SalaryVasil;
                if (z % 6 == 0) {
                    System.out.println("Месяц " + z + " сумма накоплений равна " + totalVasil);
                }
            }
            System.out.println("Задача 7");
            for (int friday = 5; friday <= 31; friday = friday + 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
            System.out.println("Задача 8");
            int nowYear = 2024;
            for (int h = 0; h < nowYear + 100; h = h + 79) {
                if (h > nowYear - 200) {
                    System.out.println(h);
                }

            }
        }
    }
}