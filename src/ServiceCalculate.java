public class ServiceCalculate {


    public static void printInfo(Employee[] EMPLOYEES) {
        for (Employee element : EMPLOYEES) {

            System.out.println(element);
        }
    }

    public static int calculateSumSalary(Employee[] EMPLOYEES) {
        int totalSum = 0;
        for (Employee element : EMPLOYEES) {
            totalSum += element.getSalary();
        }
        return totalSum;
    }

    public static double calculateMaxSalary(Employee[] EMPLOYEES) {
        double maxInter = 0;
        for (Employee element : EMPLOYEES) {
            double elementSalary = element.getSalary();
            if (maxInter < elementSalary) {
                maxInter = elementSalary;
            }
        }
        return maxInter;
    }

    public static double calculateMinSalary(Employee[] EMPLOYEES) {
        double minInter = EMPLOYEES[0].getSalary();
        for (Employee element : EMPLOYEES) {
            double elementSalary = element.getSalary();
            if (minInter > elementSalary) {
                minInter = elementSalary;
            }
        }
        return minInter;
    }

    public static int calculateAvgSalary(Employee[] EMPLOYEES) {
        int lenAry = EMPLOYEES.length;
        return calculateSumSalary(EMPLOYEES) / lenAry;
    }

    public static void getFullName(Employee[] EMPLOYEES) {
        String fullName = "";
        for (Employee employee : EMPLOYEES) {
            fullName = employee.getFirstName() + ' ' + employee.getSecondName() + ' ' + employee.getLastName();
            System.out.println(fullName);
        }
    }

    public static void addPercent(int percent, Employee[] EMPLOYEES) {
        for (Employee element : EMPLOYEES) {
            double newSalary = element.getSalary() * (1 + percent / 100.0);
            element.setSalary(newSalary);
            System.out.println(element.getSalary());


        }

    }
    public static Employee findMinSalaryEmployeeByDepartment(Employee[] employees, int department) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    // Сотрудник с максимальной ЗП в указанном отделе
    public static Employee findMaxSalaryEmployeeByDepartment(Employee[] employees, int department) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    // Сумма всех зарплат в отделе
    public static double calculateTotalSalaryByDepartment(Employee[] employees, int department) {
        double total = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    // Средняя зарплата в отделе
    public static double calculateAverageSalaryByDepartment(Employee[] employees, int department) {
        double totalSalary = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        return count == 0 ? 0 : totalSalary / count;
    }

    // Вывод всех сотрудников отдела
    public static void printAllEmployeesByDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeesWithSalaryAbove(Employee[] employees, double threshold) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= threshold) {
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getFirstName()+ employee.getLastName() + ", Salary: " + employee.getSalary());
            }
        }
    }
}
