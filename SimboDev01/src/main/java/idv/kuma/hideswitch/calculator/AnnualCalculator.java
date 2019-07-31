package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public class AnnualCalculator extends BaseCalculator {
    public AnnualCalculator(Employee employee) {
        super(employee);
    }

    @Override
    public int calculate() {
        return employee.getYearPay();
    }
}
