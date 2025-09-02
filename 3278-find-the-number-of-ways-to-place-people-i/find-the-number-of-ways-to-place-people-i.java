class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;

        for(int i = 0; i < n; i++){ // pick point A
            int ax = points[i][0];
            int ay = points[i][1];

            for(int j = 0; j < n; j++){ // pick point B
                if(i == j) continue;
                
                int bx = points[j][0];
                int by = points[j][1];

                // condition 1 : A is upper left of B
                if(ax <= bx && ay >= by){
                    boolean valid = true;

                    // check all other points
                    for(int k = 0; k < n; k++){
                        if(k == i || k == j) continue;

                        int cx = points[k][0];
                        int cy = points[k][1];

                        // condition 2: C strictly inside rectangle
                        if(ax <= cx && cx <= bx && by <= cy && cy <= ay){
                            valid = false;
                            break;
                        }
                    }

                    if(valid) count++;
                }
            }
        }

        return count;
    }
}
