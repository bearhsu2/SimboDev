package idv.kuma.hideswitch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayRoll {

    public Map<String, Integer> calculatePay(List<Employee> employees) {

        Map<String, Integer> result = new HashMap<>();

        for (Employee employee : employees) {

            int pay;

            switch (employee.getContractType()) {

                case ANNUAL:

                    pay = employee.getYearPay();
                    result.put(employee.getName(), pay);

                    break;
                case MONTH_PAY:

                    pay = employee.getMonthPay() * 12;
                    result.put(employee.getName(), pay);

                    break;
                case HOUR:

                    pay = employee.getHourPay() * employee.getHour();
                    result.put(employee.getName(), pay);

                    break;
                case PROJECT:

                    pay = (int) (employee.getCommissionRate() / 100D * employee.getTurnover());
                    result.put(employee.getName(), pay);

                    break;
                default:
                    System.out.println("Wrong pay type. Skip user " + employee.getName());
            }

        }

        return result;

    }

}
