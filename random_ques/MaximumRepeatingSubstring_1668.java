package random_ques;

public class MaximumRepeatingSubstring_1668 {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while (sb.length() <= sequence.length()) {
            System.out.println(sb.length());
            if (sequence.contains(sb.toString())) {
                System.out.println(sb.toString());
                sb.append(word);
                count++;
            } else break;
        }
        return count;
    }
}
