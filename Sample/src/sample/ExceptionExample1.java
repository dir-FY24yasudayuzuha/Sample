package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            // reigai code
            System.out.println("割り算（除算）開始");
            int zeroJyosan = 10 / 0;
            System.out.println(zeroJyosan);
        } catch (ArithmeticException e) {
            // ArithmeticException hasseiji syori
            System.out.println("ArithmeticExceptionが発生：" + e.getMessage());
        } finally {
            System.out.println("割り算（除算）終了");
        }
        
        System.out.println("処理終了");
    }

}
