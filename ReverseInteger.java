import java.lang.Math;

class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false;
        int greatestInt = 1534236468;
        int lowestInt = -1563847411;
        if (x > greatestInt || x < lowestInt) {
            return 0;
        }
        if (x < 0) {
            x = -x;
            isNegative = true;
        }
        
        int length = (int) (Math.log10(x) + 1);
        int newInt = 0;
        
        for (int i = 0; i < length; i++) {
            int curr = x % 10;
            x = (int) Math.floor(x / 10);
            newInt = newInt + (int) Math.pow(10, length - 1 - i) * curr;
        }
        if (isNegative == true) {
            newInt = -newInt;
        }
        return newInt;
    }
}

