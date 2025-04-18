package blind_75;

public class NumberOf1Bits_191 {
    public int hammingWeight(int n) {
        return convertToBinaryAndCountOnes(n);
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
