package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public class HourCalculator extends BaseCalculator {
    public HourCalculator(Employee employee) {
        super(employee);
    }

    @Override
    public int calculate() {
        return employee.getHourPay() * employee.getHour();
    }
}
