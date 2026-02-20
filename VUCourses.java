
package vic.vupay;

public class VUCourses {

    
    private String moduleName;
    private String moduleCode;
    private double tuition;
    
    // Arrays to store course data
    private final String[] validCodes = {"BSF", "BIT", "BCS", "BCE"};
    private final String[] moduleNames = {
        "BSc. Software Engineering",
        "BSc. Information Technology", 
        "BSc. Computer Science",
        "BSc. Computer Engineering"
    };
    private final double[] tuitionFees = {900000, 750000, 800000, 950000};
    
    
    public void findCourse(String code) {
        boolean found = false;
        
        for (int i = 0; i < validCodes.length; i++) {
            if (validCodes[i].equalsIgnoreCase(code)) {
                moduleCode = validCodes[i];
                moduleName = moduleNames[i];
                tuition = tuitionFees[i];
                found = true;
                break;
            }
        }
        
        if (found) {
            displayCourseDetails();
        } else {
            System.out.println("Wrong Module Code details");
        }
    }
    
   
    private void displayCourseDetails() {
        System.out.println("\n=================================");
        System.out.println("COURSE DETAILS FOUND:");
        System.out.println("=================================");
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Module Name: " + moduleName);
        System.out.printf("Tuition Fee: UGX %,.0f%n", tuition);
        System.out.println("=================================");
    }
}
    


