package idv.kuma.hideswitch.calculator;

import idv.kuma.hideswitch.Employee;

public abstract class BaseCalculator implements PayRollCalculator{

    protected Employee employee;

    public BaseCalculator(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {

        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
