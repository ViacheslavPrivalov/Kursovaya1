public class Main {

    public static double salarySum(Employee[] employee) {
        double sum = 0;
        for (Employee emp : employee) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static String minSalaryEmployee(Employee[] employee) {
        double min = Double.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getSalary() < min) {
                    min = emp.getSalary();
                    minSalaryEmp = emp;
                }
            }
        }
        return minSalaryEmp.toString();
    }

    public static String maxSalaryEmployee(Employee[] employee) {
        double max = Double.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getSalary() > max) {
                    max = emp.getSalary();
                    maxSalaryEmp = emp;
                }
            }
        }
        return maxSalaryEmp.toString();
    }

    public static double averageSalary(Employee[] employee) {
        return salarySum(employee) / employee.length;
    }

    public static void printEmployeesNames(Employee[] employee) {
        for (Employee emp : employee) {
            if (emp != null) {
                System.out.println("Сотрудник: " + emp.getEmployeeName());
            }
        }
    }

    // Методы повышенной сложности
    public static void indexSalary(Employee[] employee) {
        double index = 0.1;
        for (Employee emp : employee) {
            if (emp != null) {
                emp.setSalary(emp.getSalary() * (1 + index));
            }
        }
    }

    public static String findMinSalaryEmployee(Employee[] employee, int department) {
        double min = Double.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() < min) {
                        min = emp.getSalary();
                        minSalaryEmp = emp;
                    }
                }
            }
        }
        return minSalaryEmp.toString();
    }

    public static String findMaxSalaryEmployee(Employee[] employee, int department) {
        double max = Double.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    if (emp.getSalary() > max) {
                        max = emp.getSalary();
                        maxSalaryEmp = emp;
                    }
                }
            }
        }
        return maxSalaryEmp.toString();
    }

    public static double findSalarySum(Employee[] employee, int department) {
        double sum = 0;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    sum += emp.getSalary();
                }
            }
        }
        return sum;
    }

    public static double findSalaryAverage(Employee[] employee, int department) {
        int count = 0;
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    count++;
                }
            }
        }
        return findSalarySum(employee, department) / count;
    }

    public static void indexSalaryDepartment(Employee[] employee, int department, double index) {
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    emp.setSalary(emp.getSalary() * (1 + index));
                }
            }
        }
    }

    public static void toStringDepartment(Employee[] employee, int department) {
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getDepartment() == department) {
                    System.out.println(emp);
                }
            }
        }
    }

    public static void printLessSalary(Employee[] employee, double num) {
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getSalary() < num) {
                    System.out.println(emp);
                }
            }
        }
    }

    public static void printMoreSalary(Employee[] employee, double num) {
        for (Employee emp : employee) {
            if (emp != null) {
                if (emp.getSalary() >= num) {
                    System.out.println(emp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович1", 1, 50_000);
        employees[1] = new Employee("Иванов Иван Иванович2", 2, 60_000);
        employees[2] = new Employee("Иванов Иван Иванович3", 3, 70_000);
        employees[3] = new Employee("Иванов Иван Иванович4", 4, 80_000);
        employees[4] = new Employee("Иванов Иван Иванович5", 5, 90_000);
        employees[5] = new Employee("Иванов Иван Иванович6", 1, 100_000);
        employees[6] = new Employee("Иванов Иван Иванович7", 2, 110_000);
        employees[7] = new Employee("Иванов Иван Иванович8", 3, 120_000);
        employees[8] = new Employee("Иванов Иван Иванович9", 4, 130_000);
        employees[9] = new Employee("Иванов Иван Иванович10", 5, 140_000);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
        System.out.println("salarySum(employees) = " + salarySum(employees));
        System.out.println("minSalaryEmployee(employees) = " + minSalaryEmployee(employees));
        System.out.println("maxSalaryEmployee(employees) = " + maxSalaryEmployee(employees));
        System.out.println("averageSalary(employees) = " + averageSalary(employees));
        printEmployeesNames(employees);
        System.out.println("Повышенная сложность");
//        indexSalary(employees);
//        toString(employees);
        System.out.println("findMinSalaryEmployee(employees, 1) = " + findMinSalaryEmployee(employees, 1));
        System.out.println("findMaxSalaryEmployee(employees, 1) = " + findMaxSalaryEmployee(employees, 1));
        System.out.println("findSalarySum(employees, 1) = " + findSalarySum(employees, 1));
        System.out.println("findSalaryAverage(employees, 1) = " + findSalaryAverage(employees, 1));
        indexSalaryDepartment(employees, 1, 0.1);
        toStringDepartment(employees, 1);
        System.out.println();
        printLessSalary(employees, 100_000);
        System.out.println();
        printMoreSalary(employees, 100_000);
    }
}