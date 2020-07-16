/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestStudent {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("W56789", "Abu");
        
        s1.setStudentID("W12345");
        s1.setStudentName("Ali");
        
        s1.addQuiz(10);
        s2.addQuiz(8);
        
        s1.addQuiz(10);
        s2.addQuiz(5);
        
        System.out.printf("%-15s %3d %3d %.2f\n", s1.getStudentName(), s1.getNoqt(), s1.getTqs(), s1.getAverageScore());
        System.out.printf("%-15s %3d %3d %.2f\n", s2.getStudentName(), s2.getNoqt(), s2.getTqs(), s2.getAverageScore());
    }
}
