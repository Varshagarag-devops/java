class Student {
    // Attributes
    String name;
    int age;
    String department;
    String srn;
    String phoneNumber;

    // Constructor
    Student(String name, int age, String department, String srn, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.srn = srn;
        this.phoneNumber = phoneNumber;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("SRN: " + srn);
        System.out.println("Phone Number: " + phoneNumber);
    }



    public static void main(String[] args) {
        // Creating Student object with predefined values
        Student student1 = new Student(
            "Alice Smith",     // name
            20,                // age
            "Computer Science",// department
            "SRN123456",       // srn
            "9876543210"       // phone number
        );

        // Displaying the student details
        student1.displayDetails();
    }
}

