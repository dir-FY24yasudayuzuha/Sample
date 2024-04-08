package sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            // reigai code
            System.out.println("割り算（除算）開始");
            int zeroJyosan = divide(10, 0);
            System.out.println(zeroJyosan);
        } catch (ArithmeticException e) {
            // ArithmeticException hassei
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } finally {
            // jikkou code
            System.out.println("割り算（除算）終了");
        }
        
        System.out.println("処理終わり");
    }
    
        public static int divide(int a, int b) throws ArithmeticException {
            if (b == 0) {
                // 0 jyosan = ArithmeticException
                throw new ArithmeticException("ゼロ除算エラー");
         
            }
            
            return a / b;
        }

}
