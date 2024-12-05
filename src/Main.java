import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static Employee[] EMPLOYEES = new Employee[10];
    private final static String[] NAME = {"Step", "Nikita", "Denis", "Kirill", "NoahLiam", "William", "Mason", "James"};
    private final static String[] SECONDNAME = {"Stepanov", "Nikitov", "Kirilov", "lionov", "goodister"};
    private final static String[] LASTNAME = {"Stepanovich", "Nikitovich", "Kirilovich"};

    public static void initEmployers() {
        for (int i = 0; i < EMPLOYEES.length; i++) {

            EMPLOYEES[i] = new Employee(RANDOM.nextInt(0, 6),
                    RANDOM.nextInt(1000, 1000000),
                    NAME[RANDOM.nextInt(0, NAME.length)],
                    SECONDNAME[RANDOM.nextInt(0, SECONDNAME.length)],
                    LASTNAME[RANDOM.nextInt(0, LASTNAME.length)]);
        }

    }

    public static void main(String[] args) {
        initEmployers();
        ServiceCalculate.printInfo(EMPLOYEES);
        System.out.println(ServiceCalculate.calculateSumSalary(EMPLOYEES));
        System.out.println(ServiceCalculate.calculateMaxSalary(EMPLOYEES));
        System.out.println(ServiceCalculate.calculateMinSalary(EMPLOYEES));
        System.out.println(ServiceCalculate.calculateAvgSalary(EMPLOYEES));
        ServiceCalculate.getFullName(EMPLOYEES);
        ServiceCalculate.addPercent(23,EMPLOYEES);
        ServiceCalculate.printAllEmployeesByDepartment(EMPLOYEES,3);
        ServiceCalculate.printEmployeesWithSalaryAbove(EMPLOYEES, 80000);

    }

}














