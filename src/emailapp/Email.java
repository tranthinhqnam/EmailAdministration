package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;

    private String email;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";



    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName =lastName;
        System.out.println("Email created : "+ " "+ firstName + " " + lastName);

        // Call a method asking for the department
        this.department =setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);

        //Combine elements to generate emails

        email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@"+ department+ "." + companySuffix;

        System.out.println("Your email is : " + email);
    }

    //Ask for the department

    private String setDepartment(){
        System.out.println("DEPARMENT CODE:\n1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none\nEnter the deparment: ");
        Scanner sc = new Scanner(System.in);
       int deparmentChoice= sc.nextInt();
        if(deparmentChoice==1){return "sales";}
        else if(deparmentChoice ==2 ){return "development";}
        else if(deparmentChoice==3){return "Account";}
        else {return "";}
    }

    //Generate random password

    private String randomPassword(int length){
        String passwordSet = "DFJKGHADGAKSDGHAJD$!#";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int ran= (int) (Math.random() * passwordSet.length());
            password[i]= passwordSet.charAt(ran);
        }
        return new String(password);
    }

    //Set the mailbox capacity

  public void setMailboxCapacity(int capacity){
        this.mailboxCapacity =capacity;
  }

    //Set the alternate email

public void setAlternateEmail(String altEMail){
        this.alternateEmail = altEMail;
}


    //change the password
public void chanePassword(String password){
        this.password =password;

}

public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}



    public String showInfo(){
        return "DISPLAY NAME : " + firstName +" " +lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
