package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 75; 
        
        switch(score / 10) {
            case 10 -> System.out.println("満点");
            case 9, 8 -> System.out.println("よくできたね");
            case 7, 6 -> System.out.println("合格");
            default -> System.out.println("赤点だね");
        }
    
    }

}
