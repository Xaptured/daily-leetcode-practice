package random_ques;

public class DivisorGame_1025 {
    public boolean divisorGame(int n) {
        boolean isAlice = true;
        int x=1;
        while (x<n && x>0) {
            n=n-x;
            isAlice = !isAlice;
        }
        if (isAlice) return false;
        return true;
    }
}
