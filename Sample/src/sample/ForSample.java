package sample;

public class ForSample {

    public static void main(String[] args) {
        for (var i = 20; i <= 30 && i >= 0; i--) {
            System.out.println(i);
        }
        for (var ii = 2; ii <= 30; ii+=2) {
            System.out.println(ii);
        }
        for (var iii = 1; iii <= 30; iii++) {
            if(iii % 2 == 0) {
                //　現在の処理をスキップし、次の繰り返しに進む
                continue;
            }
            System.out.println(iii);
        }
        for (var loveandpop = 1; loveandpop <= 30; loveandpop++) {
            System.out.println(loveandpop*2);
        }
        var numbers = new int[] {1, 2, 3, 4, 5};

        for (var number : numbers) {
            System.out.println(number);
        }
    }
}
