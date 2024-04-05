package sample;

public class Logical {

    public static void main(String[] args) {
        int score = 59; //成績
        
        System.out.println("成績が40点以上であり、かつ50点以下である");
        System.out.println(score >= 40 && score <= 50);
        
        System.out.println("成績が40点以上であるか、50点以下である");
        System.out.println(score >= 40 || score <= 50);
        
        System.out.println("成績が60点以上ではない");
        System.out.println(score <= 59);
        System.out.println(!(score >= 60));
    }

}
