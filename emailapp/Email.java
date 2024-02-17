package emailapp;
import java.lang.String;
import java.util.Scanner;


public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultRandomPassword = 10;
    private String department;
    private int mailBoxCapacity = 50;
    private String companySuffix = "xyzcompany.com";
    private String email;
    private String alternateEmail;

    //Constructor or method to receive first name and last name
    public Email(String first, String last) {
        System.out.println("Enter Users First Name:: ");
        Scanner firstN = new Scanner(System.in);
        this.firstName= firstN.nextLine();
        System.out.println("Enter Users Last Name:: ");
        Scanner lastN = new Scanner(System.in);
       this.lastName = lastN.nextLine();
        System.out.println("Account Created: " + firstName + " " + lastName);
    //Call method for Department
        this.department = setDepartment();
        System.out.println("Assigned Department is  "+ this.department);
        Scanner close;

        //Call method to generate a random password
        this.password = randomPassword(defaultRandomPassword);
        System.out.println("Your default password is :: "+ this.password);

        //Combine elements for email format
        email = firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + department +"." + companySuffix;
        System.out.println("Your new email is "+ email);


    }




    //Ask for the department

    private String setDepartment(){

        System.out.println("DEPARTMENT CODES::\n Enter the Department\n" +
                        "1 for Sales\n" +
                        "2 for Development\n" +
                        "3 for Accounting\n" +
                        "4 for Tech\n" +
                        "0 for None");
                Scanner scanner = new Scanner(System.in);
               int deptChoice = scanner.nextInt();
               if(deptChoice == 1){return "Sales";}
               else if (deptChoice==2) {return "Dev";}
               else if (deptChoice==3){return "Acct";}
               else if (deptChoice==4 ){return "Tech";}
               else if (deptChoice==0){return "None";}
               else { return "You have selected an invalid choice";}

}

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);


        }
        return new String(password);

    }
    //Set the mailbox capacity
    public void setMailCapacity(int capacity){
        this.mailBoxCapacity = capacity;

    }
    //Set the alternate email

    public void setAlternateEmail(String altEmail){

        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String password){

        this.password = password;
    }

    public int getMailBoxCapacity(){return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo() {
        return "DISPLAY NAME::" + firstName + " " + lastName+
                "\nCOMPANY EMAIL::" + email +
                "\nMAILBOX CAPACITY::" + mailBoxCapacity + "mb";

    }


}
