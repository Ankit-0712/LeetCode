class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean right = true, left=true, upDown=true, straight = true;
        int len = mat.length;

        for(int row=0;row<len; row++){
            for(int col = 0; col<len;col++){
                int curr = mat[row][col];

                if(straight && curr != target[row][col]) straight = false;
                if(upDown && curr != target[len-1-row][len-1-col]) upDown = false;
                if(right && curr != target[col][len-1-row]) right  = false;
                if(left && curr != target[len-1-col][row]) left= false;

                if(!right && !left && !upDown && !straight) return false;
            }
        }

        return true;
    }
}