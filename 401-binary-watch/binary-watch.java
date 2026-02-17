class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int hour=0;hour<12;hour++){
            for(int minutes = 0;minutes<60;minutes++){
                //count total no of 1 bits
                int bits= Integer.bitCount(hour) + Integer.bitCount(minutes);
                if(bits == turnedOn){
                    String time= hour+":" + (minutes<10 ? "0"+ minutes : minutes);
                    ans.add(time);
                }
            }
        }

        return ans;
    }
} 