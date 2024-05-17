package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MembersDatabase membersDatabase = new MembersDatabase();
        generateSomeMembers(membersDatabase);

        userInputMenu(membersDatabase);
    }

    private static void userInputMenu( MembersDatabase membersDatabase) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println();
            System.out.println("Welcome to the Swimming Club Management System!");
            System.out.println("Please choose an option:");
            System.out.println("*************************************************");
            System.out.println("1. Insert a new member");
            System.out.println("2. Update a members swimming time");
            System.out.println("3. Register a payment");
            System.out.println("4. Print all members");
            System.out.println("5. Print members with outstanding balance");
            System.out.println("6. Print top 5 fastest breaststroke swimmers");
            System.out.println("7. Print top 5 fastest butterfly swimmers");
            System.out.println("8. Print top 5 fastest backstroke swimmers");
            System.out.println("10. Exit");
            System.out.println("*************************************************");

            option = scanner.nextInt();

            if (option < 1 || option > 10) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }
            switch(option){
                case 1:
                    System.out.println("Insert a new member");
                    break;
                case 2:
                    System.out.println("Update a members swimming time");
                    break;
                case 3:
                    System.out.println("Register a payment");
                    break;
                case 4:
                    System.out.println("Print all members");
                    membersDatabase.printAllMembers();
                    break;
                case 5:
                    System.out.println("Print members with outstanding balance");
                    membersDatabase.printMembersWithBalance();
                    break;
                case 6:
                    System.out.println("Print top 5 fastest breaststroke swimmers");
                    break;
                case 7:
                    System.out.println("Print top 5 fastest butterfly swimmers");
                    break;
                case 8:
                    System.out.println("Print top 5 fastest backstroke swimmers");
                    break;
                case 10:
                    System.out.println("Exit");
                    break;
            }
        } while (option != 10);
    }

    private static void generateSomeMembers(MembersDatabase membersDatabase){
        membersDatabase.addMember(new Member("John Doe", "01/01/2000", true, SwimType.COMPETITIVE, 10.0, "01/01/2021", 10.0, "01/01/2021", 10.0, "01/01/2021"));
        membersDatabase.addMember(new Member("Jane Doe", "01/01/2000", true, SwimType.COMPETITIVE, 10.0, "01/01/2021", 10.0, "01/01/2021", 10.0, "01/01/2021"));
        membersDatabase.addMember(new Member("John Smith", "01/01/2000", true, SwimType.COMPETITIVE, 10.0, "01/01/2021", 10.0, "01/01/2021", 10.0, "01/01/2021"));

        Member memberWithBalance = new Member("Jane Smith", "01/01/2000", true, SwimType.COMPETITIVE, 10.0, "01/01/2021", 10.0, "01/01/2021", 10.0, "01/01/2021");
        memberWithBalance.setBalance(1600);

        membersDatabase.addMember(memberWithBalance);
    }
}
