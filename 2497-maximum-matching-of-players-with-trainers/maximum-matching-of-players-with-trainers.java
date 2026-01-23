class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pIndex = 0;
        int tIndex = 0;
        while(pIndex < players.length && tIndex < trainers.length){
            if(trainers[tIndex]>= players[pIndex]){
                pIndex++;
            }

            tIndex++;
    }

    return pIndex;
}
}