class EmployeeBonus {
    public static double[][] generateEmployeeData() {
        double[][] employees = new double[10][2];

        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = 10000 + (int)(Math.random() * 90000);
            employees[i][1] = 1 + (int)(Math.random() * 10);
        }

        return employees;
    }

    public static double[][] calculateBonus(double[][] employees) {
        double[][] result = new double[10][2];

        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displayTotals(double[][] employees, double[][] result) {
        double oldSalary = 0;
        double newSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tYears\tBonus\tNew Salary");

        for (int i = 0; i < employees.length; i++) {
            oldSalary += employees[i][0];
            totalBonus += result[i][1];
            newSalary += result[i][0];

            System.out.println(
                (i + 1) + "\t\t" +
                employees[i][0] + "\t" +
                employees[i][1] + "\t" +
                result[i][1] + "\t" +
                result[i][0]
            );
        }

        System.out.println("Total Old Salary = " + oldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + newSalary);
    }

    public static void main(String[] args) {
        double[][] employees = generateEmployeeData();
        double[][] result = calculateBonus(employees);

        displayTotals(employees, result);
    }
}
