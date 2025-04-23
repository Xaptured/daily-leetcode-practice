package blind_75;

public class PalindromicSubStrings_647 {
    public int countSubstrings(String s) {
        int count = s.length();
        for (int i=0;i<s.length();i++) {
            for (int j=i+1;j<s.length();j++) {
                String str = s.substring(i,j+1);
                if (isPalindrome(str)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.toString().equals(sb.reverse().toString());
    }
}
