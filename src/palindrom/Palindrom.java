package palindrom;

public class Palindrom {
    public static boolean isPalindrom(int x){
        int temp = x , reversNum = 0 , lastNum ;

        while(temp != 0){
            lastNum = temp %10 ;
            reversNum = ( reversNum * 10 ) + lastNum;
            temp /=10;
        }
        return x == reversNum;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(247));
        System.out.println(isPalindrom(1551));
    }
}
