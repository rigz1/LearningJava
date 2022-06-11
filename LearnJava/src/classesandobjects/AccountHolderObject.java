package classesandobjects;

import classesandobjects.AccountHolder;

public class AccountHolderObject {
    public static void main(String[] args) {
        AccountHolder tom = new AccountHolder();
        AccountHolder henry = new AccountHolder();
        AccountHolder sarah = new AccountHolder();

        tom.firstName = "Tom";
        tom.lastName = "Hills";
        tom.age = 20;
        tom.accountBalance = 10000;
        tom.testEligibilityForCreditCard();
        System.out.println("Is Tom eligible for CC?"+" "+tom.eligibleForCreditCard);

        henry.firstName = "Henry";
        henry.lastName = "Smith";
        henry.age = 31;
        henry.accountBalance = 20000;
        henry.testEligibilityForCreditCard();
        System.out.print("Is Henry eligible for CC?  "+henry.eligibleForCreditCard);

    }
}
