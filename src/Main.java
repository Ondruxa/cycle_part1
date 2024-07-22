public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("task2");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
        System.out.println();

        System.out.println("task3");
        for (int nech = 1; nech <= 17; nech = nech + 2) {
            System.out.println(nech);
        }
        System.out.println();

        System.out.println("task4");
        for (int a = 10; a >= -10; a--) {
            System.out.println(a);
        }
        System.out.println();

        System.out.println("task5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println (year + " год является високосным");
        }
        System.out.println();

        System.out.println("task6");
        for (int s = 7; s <= 98; s = s + 7){
            System.out.print (s + "\t");    // захотелось горизонтально вывести
        }
        System.out.println();
        System.out.println();

        System.out.println("task7");
        for (int g = 1; g <= 512; g = g*2){
            System.out.print (g + "\t");   // также захотелось горизонтально вывести
        }
        System.out.println("\n");

        System.out.println("task8");
        int deposit = 0;
        int salary = 29000;
        for (int mounth = 1; mounth <= 12; mounth++){
            deposit = deposit + salary;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println();

        System.out.println("task9");
        int depositT = 0;        //формально можно было переменной присвоить тип float или double, чтобы учитывать копейки
        int salaryY = 29000;
        for (int mounth = 1; mounth <= 12; mounth++){
            depositT = depositT + depositT/100;
            depositT = depositT + salaryY;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + depositT + " рублей");
        }
        System.out.println();

        System.out.println("task10");
        int result;
        for (int numeral = 1; numeral <= 10; numeral++){
            result = 2 * numeral;
            System.out.println("2*" + numeral + "=" + result);
        }
    }
}