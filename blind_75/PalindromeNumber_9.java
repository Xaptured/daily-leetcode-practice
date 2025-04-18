package blind_75;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        Integer integer = Integer.valueOf(x);
        StringBuilder sb = new StringBuilder(integer.toString());
        return sb.toString().equals(sb.reverse().toString());
    }
}
