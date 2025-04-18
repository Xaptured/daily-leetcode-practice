package blind_75;

public class ReverseBits_190 {
    public int reverseBits(int n) {
        // Convert to 32-bit binary string with leading zeros
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        // Reverse the binary string
        String reversedBinary = new StringBuilder(binary).reverse().toString();

        // Convert the reversed binary string back to an integer
        return (int) Long.parseLong(reversedBinary, 2);
    }
}
