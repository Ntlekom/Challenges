import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Main {

	static List<User> userList = new ArrayList<User>();
	public static void displayMenu(int opt[], String menuOpts[]){
		// Display menu
		System.out.println("PLEASE MAKE A SELECTION BELOW: ");
		//Select each option and menu
		for(int i = 0; i < opt.length; i++){
        		System.out.printf("%d. %s\n", opt[i], menuOpts[i]);
        	}
        	System.out.println("➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖️➖➖️➖️➖️➖️➖️");

		}

	public static void main(String[] args) {
        	// Menu options
        	int options[] = {1,2,3,4};
        	String menu[] = {"Add user","Delete user","Update user","List users"};

        	// Last index as exit option
        	int quit = options[options.length - 1];
        
        	displayMenu(options, menu);

        	// Setup Scanner
        	Scanner sc = new Scanner(System.in);

        	// User choice
        
        	System.out.println("Enter your choice from 1-5:");
        	var choice  = sc.nextLine();

        	System.out.println(" ");


        	// Check the choice
        	label1: while(Integer.parseInt(choice) < 1 || Integer.parseInt(choice) < 5){
            			switch(choice){
                				case "1":

                    					addUserInfo();
                    					System.out.println("*************************************");
                    					break;

                				case "2":
                    					deleteUser();
                    					break;
                				case "3":
                    					updateUser();
                    					break;
                				case "4":
                    					listAllUsers();
                    					break;
                				default:
                    					System.out.println("No such Selection!");
                    					break;
            			}

		System.out.println(" ");
     
		displayMenu(options, menu);

		// User choice
		System.out.println("Enter your choice from 1-5:");
		choice  = sc.nextLine();
		}
		System.out.println("Thank you for using our system, Goodbye!");
	}

	public static void addUserInfo() {
		String name = "", surname = "", email, dateOfBirth;
		String regex = "[A-Za-z-]*";
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		name = sc.nextLine();
		if(name.matches(regex) && !name.isEmpty()) {

		}else {
			System.out.println("Please Enter a Valid name e.g John: ");
			name = sc.nextLine();
		}

		System.out.println("Enter Your surname: ");
		surname = sc.nextLine();
		if(surname.matches(regex) && !surname.isEmpty()) {

		}else {
			System.out.println("Please Enter a Valid surname e.g Wick: ");
			surname = sc.nextLine();
		}

		System.out.println("Enter Your email: ");
		email = sc.nextLine();
		if(email.matches(emailRegex) && !email.isEmpty()) {

		}else {
			System.out.println("Please enter a Valid email e.g marcel@gmail.com: ");
			email = sc.nextLine();
		}

		System.out.println("Enter Your date of birth (dd/MM/yyyy): ");
		dateOfBirth = sc.nextLine();

		try{
			DateTimeFormatter dateFormatt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date1 = LocalDate.parse(dateOfBirth , dateFormatt);
			var year = dateOfBirth.split("/")[2];
			int yearsold = 2021 - Integer.parseInt(year);
			System.out.println("Your age is: " + yearsold);

		}catch(DateTimeParseException e){
			System.out.println("ERROR:" + e);
			System.out.println("Enter Your date of birth (dd/MM/yyyy): ");
			dateOfBirth = sc.nextLine();
		}
		//check if user exists
		if(userList.indexOf(email) > 0){
			System.out.println(email + " already exists in the database");
		}else{
			var user = new User(name, surname, email, dateOfBirth);
			userList.add(user);

		//Serialization
		try{
			FileOutputStream fos = new FileOutputStream("/home/cmdq3/IdeaProjects/Menu/userData.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}

		//Deserialization
		try{
			FileInputStream fileInputStream = new FileInputStream("/home/cmdq3/IdeaProjects/Menu/userData.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			userList = (List<User>) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
		}catch(IOException | ClassNotFoundException e) {
                	e.printStackTrace();
            	}
            	//Verify list data
		for(User user1:userList){
			System.out.println(user1);
            	}
            	System.out.println("Hello "+ name +" "+ surname + " "
                    + "your information has been saved to the database.");
        	}
    }

	public static void deleteUser(){
		String email;
		boolean isFound = false;
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		Scanner sc = new Scanner(System.in);
       	try{
       		System.out.println("Enter Your email: ");
       		email = sc.nextLine();
            		if(email.matches(emailRegex) && !email.isEmpty()) {

            		}else {
                		System.out.println("Please enter a Valid email e.g marcel@gmail.com: ");
                		email = sc.nextLine();
            		}

			for(User list : userList){
                		if(list.getemail().equals(email)){
                    			userList.remove(list);
                    			isFound = true;
                		}
            		}

			if(isFound == true){
                		System.out.println("User successfully removed");
            		}else{
                		System.out.println("User not found");
            		}

		}catch(Exception e){
            		System.out.println(e);
        	}
	}

	public static void updateUser(){
        	String name = "", surname = "", email, dateOfBirth;
        	String regex = "[A-Za-z-]*";
        	boolean isFound = false;
        	String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        	Scanner sc = new Scanner(System.in);
        	try{
            		System.out.println("Enter Your email: ");
            		email = sc.nextLine();
            		if(email.matches(emailRegex) && !email.isEmpty()) {

            		}else {
                		System.out.println("Please enter a Valid email e.g marcel@gmail.com: ");
                		email = sc.nextLine();
            		}

            		for(User list : userList){
				if(list.getemail().equals(email)){
                    			isFound = true;
                    			System.out.println("Enter New name: ");
                    			name = sc.nextLine();
                    		
                    			if(name.matches(regex) && !name.isEmpty()) {}

                    			else {
                        			System.out.println("Please Enter a Valid name e.g John: ");
                        			name = sc.nextLine();
                    			}

                    			System.out.println("Enter New surname: ");
                    			surname = sc.nextLine();
                    			if(surname.matches(regex) && !surname.isEmpty()) {}

                    			else {
                        			System.out.println("Please Enter a Valid surname e.g Wick: ");
                        			surname = sc.nextLine();
                    			}

                    			System.out.println("Enter New email: ");
                    			email = sc.nextLine();
                    			if(email.matches(emailRegex) && !email.isEmpty()) {}

                    			else {
                        			System.out.println("Please enter a Valid email e.g marcel@gmail.com: ");
                        			email = sc.nextLine();
                    			}

                    			// Set new values
                    			list.setname(name);
                    			list.setsurname(surname);
                    			list.setemail(email);
            			}

			}

			if(isFound == true){
            			System.out.println("User successfully Edited");
            		}else{
                		System.out.println("User not found");
           		}

		}catch(Exception e){
        		System.out.println(e);
		}
	}
	public static void listAllUsers(){
		System.out.println("List of current users: ");
        	System.out.println(" ");

        	for(User list : userList){
            		list.display();
        	}
    	}
    	public int readInteger(String promptMsg, String errorMsg, int start, int end){
        	int num = 0;
        	String numInput;
        	boolean isValid = false;

        	Scanner in = new Scanner(System.in);

        	while(isValid == false){
            		System.out.print(promptMsg);
            		numInput = in.nextLine();

            		try{
                		num = Integer.parseInt(numInput);
                		if(num >= start && num<= end)
                    			isValid = true;
                		else
                    			System.out.print(errorMsg);

            		}catch(NumberFormatException e){
                		System.out.print(errorMsg);
            		}
        	}
        	return num;
	}
}

class User implements Serializable{
	private String name;
    	private String surname;
    	private String email;
    	private String dateofbirth;

    	public User(String name, String surname, String email, String dateofbirth){
        	super();
        	this.name = name;
        	this.surname = surname;
        	this.email = email;
        	this.dateofbirth = dateofbirth;
    	}
    
    	public String toString(){
        	return "User [Name: " + name +", Surname: " + surname + ", Email: " + email + "Date Of Birth: " + dateofbirth + "]";
    	}

    	void display(){
        	System.out.println(name);
        	System.out.println(surname);
        	System.out.println(email);
        	System.out.println(dateofbirth);
        	System.out.println("***************************");
    	}

    	public String getname() {
        	return name;
    	}

    	public void setname(String name) {
        	this.name = name;
    	}

    	public String getsurname() {
        	return surname;
    	}

    	public void setsurname(String surname) {
        	this.surname = surname;
    	}

    	public String getemail() {
        	return email;
    	}

    	public void setemail(String email) {
        	this.email = email;
    	}

    	public String getdateofbirth() {
        	return dateofbirth;
    	}

    	public void setdateofbirth(String dateofbirth) {
        	this.dateofbirth = dateofbirth;
    	}
}



