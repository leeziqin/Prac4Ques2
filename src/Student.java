/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {
    private String studentID;
    private String studentName;
    private int noqt;
    private int tqs;
    private static double contribution;
    
    //Q2
    //public Student(){
    //}
    
    public Student(){
        this("","");
    }
    
    //Q2
    //public Student(String id, String name) {
    //    studentID = id;
    //    studentName = name;
    //}

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getNoqt() {
        return noqt;
    }

    public int getTqs() {
        return tqs;
    }
    
    //Q2
    //public void setStudentID(String id) {
    //    studentID = id;
    //}

    //public void setStudentName(String name) {
    //    studentName = name;
    //}
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public static void setContribution (double contribution){
    	Student.contribution = contribution;
    }
    
    public static double getContribution(){
    	return contribution;
    }
    
    public void addQuiz(int score){
        if(score <=0 || score > 10){
            System.out.println("Error: Invalid Score");
        }else{
            noqt++;
            tqs+=score;
        }
        
    }
    
    public double getAverageScore(){
        return tqs/(double)noqt;
    }
}
