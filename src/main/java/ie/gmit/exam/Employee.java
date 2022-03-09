//   Shane Monaghan
//   Lab Exam
//   9/3/22

package ie.gmit.exam;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phoneNo;
    private String employmentType;
    private int age;

    public String getTitle(){return title;} //Getter Title
    public String getName(){return name;} //Getter Name
    public String getPPS(){return PPS;} //Getter PPS
    public String getPhoneNo(){return phoneNo;} //Getter Phone Number
    public String getEmploymentType(){return employmentType;} ////Getter Employment Type
    public int getAge(){return age;} //Getter Age

    public Employee(String title, String name, String PPS, String phoneNo, String employmentType, int age){
        setTitle(title);
        setName(name);
        setPPS(PPS);
        setPhoneNo(phoneNo);
        setEmploymentType(employmentType);
        setAge(age);
    }

    private void setAge(int age) { //Setter Age
        if(age < 18){ //Used to check if the employee is under 18
            throw new IllegalArgumentException("Must be over 18");
        }
        else{
            this.age = age;
        }
    }

    private void setEmploymentType(String employmentType) { //Setter Employment Type
        if(employmentType =="Full-time" ||employmentType =="Full time" || employmentType =="full-time" ||employmentType =="full time" ||employmentType =="Part-time" ||employmentType =="part-time" ||employmentType =="Part time" ||employmentType =="part time"){ //Checks if correct role is added
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalArgumentException("Invalid Employment Type Entered");
        }
    }

    private void setPhoneNo(String phoneNo) { //Setter Phone Number
        if(phoneNo.length() == 7){ //checks length of phone number in order to validate it
            this.phoneNo = phoneNo;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone Number Entered");
        }
    }

    private void setPPS(String PPS) { //Setter PPS
        if(PPS.length() == 6){ //checks length of PPS in order to validate it
            this.PPS = PPS;
        }
        else{
            throw new IllegalArgumentException("Invalid PPS Entered");
        }
    }

    private void setName(String name) { //Setter Name
        if(name.length() < 5 || name.length() > 22){//checks length of name in order to validate it
            throw new IllegalArgumentException("Invalid Name Entered");
        }
        else{
            this.name = name;
        }
    }

    private void setTitle(String title) { //Setter Title
        if(title == "Mr"||title == "mr"||title == "Mrs" || title == "mrs" || title == "Ms" || title == "ms"){//Ensures that the correct title has been input
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Entered");
        }
    }
}
