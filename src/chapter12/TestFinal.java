package chapter12;

import java.util.Map;

public class TestFinal {
    public static void main(String[] args) {
getFinalTestScores();

    }

    /**
     * Prints test scores from our students using a Hashmap updated with make-up test scores.
     */
    public static void getFinalTestScores(){
        Map<String,Integer> grades1 = TestResults.getOriginalGrades();
        Map<String,Integer> grades2 = TestResults.getMakeUpGrades();
        for (var student: grades1.entrySet()){
           //iterate through new grades
            for (var same_student: grades2.entrySet()){
                //find the student
                if(student.getKey().equals(same_student.getKey())){
                    //evaluate new grade, update if necessary
                    if(student.getValue() < same_student.getValue()){
                        grades1.put(same_student.getKey(),same_student.getValue());
                    }
                }
            }
        }
        //print updated grades
        System.out.println("======== FINAL GRADES ========");
        grades1.forEach(
                (student,score)-> System.out.println("Student: " + student + " , Grade: " + score)
        );
    }

}
