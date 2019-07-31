package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public class MonthCalculator extends BaseCalculator {

    public static final int MONTHS_PER_YEAR = 12;

    public MonthCalculator(Employee employee) {
        super(employee);
    }

    @Override
    public int calculate() {
        return MONTHS_PER_YEAR * employee.getMonthPay();
    }
}
