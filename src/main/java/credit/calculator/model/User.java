package credit.calculator.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Long amount;
    private Long time;
    private double income;
    private int age;
    private String typeOfContract;

    public User(){

    }

    public User(double income, String typeOfContract, int age){
        this.income = income;
        this.typeOfContract = typeOfContract;
        this.age = age;

    }

    public User(Long amount, Long time, double income, int age, String typeOfContract) {
        this.amount = amount;
        this.time = time;
        this.income = income;
        this.age = age;
        this.typeOfContract = typeOfContract;
    }



    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }
}
