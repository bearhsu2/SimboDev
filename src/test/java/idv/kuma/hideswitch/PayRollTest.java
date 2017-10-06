package idv.kuma.hideswitch;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class PayRollTest {
    @Test
    public void calculatePay() throws Exception {

        // Prepare data
        List<Employee> employees = new ArrayList<>();

        // Annual
        Employee annualBob = new Employee("Bob", ContractType.ANNUAL);
        annualBob.setYearPay(3000);
        employees.add(annualBob);

        // Month
        Employee monthAlice = new Employee("Alice", ContractType.MONTH_PAY);
        monthAlice.setMonthPay(280);
        employees.add(monthAlice);

        // Hour
        Employee hourJohn = new Employee("John", ContractType.HOUR);
        hourJohn.setHourPay(19);
        hourJohn.setHour(500);
        employees.add(hourJohn);

        // Project
        Employee projectDavid = new Employee("David", ContractType.PROJECT);
        projectDavid.setCommissionRate(30);
        projectDavid.setTurnover(30000);
        employees.add(projectDavid);


        // Run method
        PayRoll payRoll = new PayRoll();
        Map<String, Integer> result = payRoll.calculatePay(employees);

        // Check answer
        Assert.assertNotNull(result);
        Assert.assertEquals(4, result.size());

        Assert.assertEquals(3000, result.get("Bob").intValue());
        Assert.assertEquals(3360, result.get("Alice").intValue());
        Assert.assertEquals(9500, result.get("John").intValue());
        Assert.assertEquals(9000, result.get("David").intValue());

    }

}