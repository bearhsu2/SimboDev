package idv.kuma.hideswitch.calculator;


import idv.kuma.hideswitch.Employee;

public class CalculatorFactory {


    public static PayRollCalculator create(Employee employee) {

        switch (employee.getContractType()) {
            case ANNUAL:
                return new AnnualCalculator(employee);
            case MONTH_PAY:
                return new MonthCalculator(employee);
            case HOUR:
                return new HourCalculator(employee);
            case PROJECT:
                return new ProjectCalculator(employee);
            default:
                System.out.println("Wrong pay type. Skip user " + employee.getName());
                return null;
        }

    }

}
