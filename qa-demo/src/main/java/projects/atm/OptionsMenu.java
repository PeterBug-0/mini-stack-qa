package projects.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat currencyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    public void getLogin() throws IOException{
        int x = 1;
        do {
            try{
                data.put(952141, 191904);
                data.put(989947, 71976);

                System.out.println("Welcome to the ATM Project");
                System.out.println("Enter your customer number");
                setCustomerNumber (menuInput.nextInt());

                System.out.println("Enter your PIN number");
                setPinNumber(menuInput.nextInt());
            }catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). Only Numbers. " + "\n");
            }
        }
    }
    public void getAccountType() {
        System.out.println("Select the Account you want to Access:  ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 -  Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking;
                break;
            case 2:
                getSaving;
                break;
            case 3:
                ExitAccount;
                break;

        }
    }
    public void getChecking(){

    }
}
