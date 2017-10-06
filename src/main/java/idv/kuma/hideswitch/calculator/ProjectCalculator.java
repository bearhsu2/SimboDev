package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public class ProjectCalculator extends BaseCalculator {
    public ProjectCalculator(Employee employee) {
        super(employee);
    }

    @Override
    public int calculate() {
        return (int) (employee.getCommissionRate() / 100D * employee.getTurnover());
    }
}
