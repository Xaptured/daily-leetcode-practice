package blind_75;

public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        int maxPointer = 0;

        for (int i=0;i<nums.length;i++) {
            if (maxPointer >= i) {
                maxPointer = Math.max(i + nums[i], maxPointer);
            }
            else return false;
        }
        return true;
    }
}
