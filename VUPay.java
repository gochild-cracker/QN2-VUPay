package vic.vupay;

import java.util.Scanner;


public class VUPay {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("WELCOME TO VUPAY");
        System.out.println("Victoria University Kampala - Payment System");
        System.out.println("=================================");
        System.out.println("Available Module Codes: BSF, BIT, BCS, BCE");
        System.out.println("=================================");
        
        
        VUCourses courses = new VUCourses();
        
     
        System.out.print("\nEnter Module Code: ");
        String inputCode = scanner.nextLine().trim();
        
       
        courses.findCourse(inputCode);
        
        scanner.close();
    }
}
    

