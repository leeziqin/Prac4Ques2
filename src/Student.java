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
       
    public Student(){
    }

    public Student(String id, String name) {
        studentID = id;
        studentName = name;
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

    public void setStudentID(String id) {
        studentID = id;
    }

    public void setStudentName(String name) {
        studentName = name;
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
