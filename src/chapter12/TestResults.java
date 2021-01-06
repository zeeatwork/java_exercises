package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades(){

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Angie", 24);
        grades1.put("Dave", 32);
        grades1.put("Lisi", 80);
        grades1.put("Raja", 50);
        grades1.put("Shashi", 79);
        grades1.put("Bas", 40);
        grades1.put("Carlos", 59);
        grades1.put("Amber", 55);
        grades1.put("Rex", 95);
        grades1.put("Jason", 63);
        grades1.put("Nikolay", 32);

        return grades1;
    }

    public static Map getMakeUpGrades(){

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Angie", 97);
        grades2.put("Dave", 82);
        grades2.put("Lisi", 76);
        grades2.put("Raja", 89);
        grades2.put("Shashi", 79);
        grades2.put("Bas", 98);
        grades2.put("Carlos", 80);
        grades2.put("Amber", 95);
        grades2.put("Rex", 90);
        grades2.put("Jason", 62);
        grades2.put("Nikolay", 79);

        return grades2;
    }


}