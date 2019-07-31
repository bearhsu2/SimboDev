package idv.kuma.hideswitch;

public class Employee {

    private String name;
    private ContractType contractType;
    private int yearPay;
    private int monthPay;
    private int hourPay;
    private int hour;
    private int commissionRate;  // in percentage
    private int turnover;

    public Employee(String name, ContractType contractType) {
        this.name = name;
        this.contractType = contractType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public int getYearPay() {
        return yearPay;
    }

    public void setYearPay(int yearPay) {
        this.yearPay = yearPay;
    }


    public int getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(int monthPay) {
        this.monthPay = monthPay;
    }

    public int getHourPay() {
        return hourPay;
    }

    public void setHourPay(int hourPay) {
        this.hourPay = hourPay;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }
}
