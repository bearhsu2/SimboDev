package idv.kuma.hideswitch;

import idv.kuma.hideswitch.calculator.CalculatorFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayRoll {

    public Map<String, Integer> calculateAll(List<Employee> employees) {

        Map<String, Integer> result = new HashMap<>();

        for (Employee employee : employees) {
            result.put(employee.getName(), CalculatorFactory.create(employee).calculate());
        }

        return result;

    }

}
