package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = 70; // 成績
        
        if (score == 100) {
            System.out.println("満点だよ");
        }
        else if(score >= 80) {
            System.out.println("かなりいいよ");
        }
        else if(score >= 60) {
            System.out.println("いいよ");
        }
        else {
            System.out.println("不合格だね");
        }

    }

}
