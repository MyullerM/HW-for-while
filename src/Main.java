//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            System.out.println("Задача 1");
            int salary = 15000;
            int total = 0;
            int month = 0;
        int totalAccumulate = 2_459_000;
        while (total < totalAccumulate) {
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
        int population = 12_000_000;
        int perCapita = population / 1000;
            int birthRate = 17;
            int mortality = 8;
            for (int year = 1; year <= 10; year++) {
                population = population + ((birthRate - mortality) * perCapita);
                System.out.println(" Год " + year + " численность населения составляет " + population);
            }
            System.out.println("Задача 4");
        int accumulationEverything = 12_000_000;
            int accumulation = 15000;
            int totalA = 0;
            int monthA = 0;
        int procentInMonth = 7 / 100;
        for (; totalA < accumulationEverything; monthA++) {
                totalA = totalA + (totalA * 7 / 100);
                totalA = totalA + accumulation;
                System.out.println("Месяц " + monthA + " сумма накоплений равна " + totalA);
            }
            System.out.println("Задача 5");
        int accumulationEverythingTwo = 12_000_000;
            int accumulationTwo = 15000;
            int totalATwo = 0;
            int monthATwo = 0;
        for (; totalATwo < accumulationEverythingTwo; monthATwo++) {
                totalATwo = totalATwo + (totalATwo * 7 / 100);
                totalATwo = totalATwo + accumulationTwo;
                if (monthATwo % 6 == 0) {
                    System.out.println("Месяц " + monthATwo + " сумма накоплений равна " + totalATwo);
                }
            }
            System.out.println("Задача 6");
        int salaryVasil = 15000;
            int totalVasil = 0;
            int totalTime = 9 * 12;
        for (int monthOne = 0; monthOne <= totalTime; monthOne++) {
                totalVasil = totalVasil + (totalVasil * 7 / 100);
            totalVasil = totalVasil + salaryVasil;
            if (monthOne % 6 == 0) {
                System.out.println("Месяц " + monthOne + " сумма накоплений равна " + totalVasil);
                }
            }
            System.out.println("Задача 7");
        int daysPerMonth = 31;
        for (int friday = 5; friday <= daysPerMonth; friday = friday + 7) {
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