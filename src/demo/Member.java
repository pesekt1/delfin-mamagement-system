package demo;

import java.time.LocalDate;

enum AgeType {
    JUNIOR, STANDARD, SENIOR
}

enum SwimType {
    COMPETITIVE, NONCOMPETITIVE
}

enum swimTeam {
    JUNIOR, SENIOR
}

public class Member {
    private String name; //console input
    private String BirthDate; //console input
    private boolean activeMembership; //console input
    private AgeType ageType; //calculated from BirthDate in constructor
    private SwimType swimType; //console input
    private int subscriptionFee; //calculated from ageType and activeMembership in constructor
    private String registrationDate; //calculated from LocalDate.now() in constructor
    private String trainer; //calculated from swimType in constructor
    private int balance; //default 0
    private SwimType swimTeam; //calculated from BirthDate in constructor
    private double ButterflyTime; //console input
    private String ButterflyDate; //console input
    private double BackstrokeTime; //console input
    private String BackstrokeDate; //console input
    private double BreaststrokeTime; //console input
    private String BreaststrokeDate; //console input

    public Member(String name, String BirthDate, boolean activeMembership, SwimType swimType, double ButterflyTime, String ButterflyDate, double BackstrokeTime, String BackstrokeDate, double BreaststrokeTime, String BreaststrokeDate) {
        this.name = name;
        this.BirthDate = BirthDate;
        this.activeMembership = activeMembership;
        //this.ageType = calculateAgeType(BirthDate);
        this.swimType = swimType;
        //this.subscriptionFee = calculateSubscriptionFee(ageType, activeMembership);
        this.registrationDate = LocalDate.now().toString();
        //this.trainer = calculateTrainerName(swimType);
        this.balance = 0;
        //this.swimTeam = calculateSwimTeam(BirthDate);
        this.ButterflyTime = ButterflyTime;
        this.ButterflyDate = ButterflyDate;
        this.BackstrokeTime = BackstrokeTime;
        this.BackstrokeDate = BackstrokeDate;
        this.BreaststrokeTime = BreaststrokeTime;
        this.BreaststrokeDate = BreaststrokeDate;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + BirthDate);
        System.out.println("Active Membership: " + activeMembership);
    }

}
