package ConstructorPerson;

import java.util.Date;

public class PensionFund extends Person {
    private String fundName;
    private boolean isGovernmental;
    private Date creationDate;
    private int participantCount;
    private int age;


    public PensionFund(String name, int age, double height, double weight, int money, String fundName, boolean isGovernmental, Date creationDate, int participantCount) {
        super(name, age, height, weight, money);
        this.fundName = fundName;
        this.creationDate = creationDate;
        this.participantCount = participantCount;
        this.isGovernmental = isGovernmental;
    }

    public int getAge(int age) {
        return age;
    }

    public String getFundName() {
        return fundName;

    }

    public void setFundName(String fundName) {
        //           this.fundName = FundName;

    }

    public boolean isGovernmental() {
        return isGovernmental;

    }

    public void setGovernmental(boolean governmental) {
        isGovernmental = governmental;

    }

    public Date getCreationDate() {
        return creationDate;
    }

    // Запрещаем изменение даты создания фонда
    public void setCreationDate(Date creationDate) {
        //           this.creationDate = creationDate;

    }

    public int getParticipantCount() {
        return participantCount;

    }

    public void setParticipantCount(int participantCount) {
//            this.participantCount = participantCount;

    }

    public void info() {
        if (isGovernmental) {
            System.out.println("Государственный фонд, используется " + participantCount + " тысяч человек.");
        } else {
            System.out.println("Негосударственный фонд, используется " + participantCount + " не тысяч человек.");
        }
    }
}







