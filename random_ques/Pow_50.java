package random_ques;

public class Pow_50 {
    public double myPow(double x, int n) {
        double ans = 1;
        double prod = x;
        long bit = n;
        if (bit < 0) {
            bit = -1 * bit;
            prod = 1/x;
        }
        while (bit>0) {
            long rem = bit%2;
            if (rem == 1) {
                ans = ans * prod;
            }
            prod = prod * prod;
            bit = bit/2;
        }
        return ans;
    }
}
