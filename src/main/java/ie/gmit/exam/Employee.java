package ie.gmit.exam;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phoneNo;
    private String employmentType;
    private int age;

    public String getTitle(){return title;}
    public String getName(){return name;}
    public String getPPS(){return PPS;}
    public String getPhoneNo(){return phoneNo;}
    public String getEmploymentType(){return employmentType;}
    public int getAge(){return age;}

    public Employee(String title, String name, String PPS, String phoneNo, String employmentType, int age){
        setTitle(title);
        setName(name);
        setPPS(PPS);
        setPhoneNo(phoneNo);
        setEmploymentType(employmentType);
        setAge(age);
    }

    private void setAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Must be over 18");
        }
        else{
            this.age = age;
        }
    }

    private void setEmploymentType(String employmentType) {
        if(employmentType =="Full-time" ||employmentType =="Full time" || employmentType =="full-time" ||employmentType =="full time" ||employmentType =="Part-time" ||employmentType =="part-time" ||employmentType =="Part time" ||employmentType =="part time"){
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalArgumentException("Invalid Employment Type Entered");
        }
    }

    private void setPhoneNo(String phoneNo) {
        if(phoneNo.length() == 7){
            this.phoneNo = phoneNo;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone Number Entered");
        }
    }

    private void setPPS(String PPS) {
        if(PPS.length() == 6){
            this.PPS = PPS;
        }
        else{
            throw new IllegalArgumentException("Invalid PPS Entered");
        }
    }

    private void setName(String name) {
        if(name.length() < 5 || name.length() > 22){
            throw new IllegalArgumentException("Invalid Name Entered");
        }
        else{
            this.name = name;
        }
    }

    private void setTitle(String title) {
        if(title == "Mr"||title == "mr"||title == "Mrs" || title == "mrs" || title == "Ms" || title == "ms"){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Incorrect Title Entered");
        }
    }
}
