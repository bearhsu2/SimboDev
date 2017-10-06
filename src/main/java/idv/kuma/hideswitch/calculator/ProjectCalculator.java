package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public class ProjectCalculator extends BaseCalculator {

    public static final double HUNDRED = 100D;

    public ProjectCalculator(Employee employee) {
        super(employee);
    }

    @Override
    public int calculate() {
        return (int) (employee.getCommissionRate() / HUNDRED * employee.getTurnover());
    }
}
