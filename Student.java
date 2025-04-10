import java.time.LocalDate;
import java.time.Period;

class Student {    
    private String name;
    private String branch;
    private String regNo;
    private LocalDate dob;
    private String bloodGroup;

    
    private static int csCount = 1;
    private static int extcCount = 1;
    private static int textileCount = 1;
    private static int productionCount = 1;
    private static int itCount = 1;

    
    public Student(String name, String branch, String dob, String bloodGroup) {
        this.name = name;
        this.branch = branch.toLowerCase();
        this.dob = LocalDate.parse(dob);
        this.bloodGroup = bloodGroup.toUpperCase();
        this.regNo = generateRegNo(this.branch); 
    }

    
    private String generateRegNo(String branch) {
        switch (branch) {
            case "cs":
                return "2023BCS" + String.format("%03d", csCount++);
            case "extc":
                return "2023BEC" + String.format("%03d", extcCount++);
            case "textile":
                return "2023BTT" + String.format("%03d", textileCount++);
            case "production":
                return "2023BPR" + String.format("%03d", productionCount++);
            case "it":
                return "2023BIT" + String.format("%03d", itCount++);
            default:
                throw new IllegalArgumentException("Invalid branch: " + branch);
        }
    }

    
    public int calculateAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    
    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Registration No.: " + this.regNo);
        System.out.println("Date of Birth: " + this.dob);
        System.out.println("Age: " + calculateAge() + " years");
        System.out.println("Blood Group: " + this.bloodGroup);
    }
}

 class Main3 {
    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", "CS", "2003-05-14", "A+");
        Student student2 = new Student("Bob", "IT", "2002-10-22", "B-");

        
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
