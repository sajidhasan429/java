// Nodoliya Sajidhasan Shabbirali
// URN :- 2022-M-18042000
// MCA Second Year
import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");//User input the name
        String Name = sc.nextLine();
        System.out.println("Enter ID");//User input the ID
        int ID = sc.nextInt();
        System.out.println("Enter Marks of English");//User enter the marks subject of English
        int m1 = sc.nextInt();
        System.out.println("Enter Marks of Physics");//User enter the marks subject of Physics
        int m2 = sc.nextInt();
        System.out.println("Enter Marks of Maths");//User enter the marks subject of Maths
        int m3 = sc.nextInt();
        System.out.println("Enter Marks of Science");//User enter the marks subject of Science
        int m4 = sc.nextInt();
        System.out.println("Enter Marks of Biology");//User enter the marks subject of Biology
        int m5 = sc.nextInt();
        
        int total = m1+m2+m3+m4+m5;//Total marks of the all subjects
        
        double per = (total/500.0)*100.0;//Count the percentage
        String g = " ";
        //to show the which grade display in based on percentage
        if(per>=90){
            g = "A+";
        } else if(per >= 80){
            g = "A";
        } else if(per >= 70){
            g = "B+";
        } else if(per >= 60){
            g = "B";
        } else if(per >= 50){
            g = "C";
        } else if(per >= 40){
            g = "D";
        } else{
            g = "E";
        }
       //All details of student
       System.out.println("****ALL Details *******");
        System.out.println("ID is "+ID);
        System.out.println("Student Name is "+Name);
        System.out.println("Total marks of all subjects "+total);
        System.out.println("Percentage is "+per);
        System.out.println("Grade is "+g);
       
    }
}
