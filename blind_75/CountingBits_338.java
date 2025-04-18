package blind_75;

public class CountingBits_338 {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i=0;i<=n;i++) {
            int count = convertToBinaryAndCountOnes(i);
            result[i] = count;
        }

        return result;
    }

    public int convertToBinaryAndCountOnes(int num) {
        String str = Integer.toBinaryString(num);
        int count = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }
}
