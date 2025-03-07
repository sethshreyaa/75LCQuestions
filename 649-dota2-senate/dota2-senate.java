class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> queueR = new LinkedList<>();
        Queue<Integer> queueD = new LinkedList<>();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                queueR.offer(i);
            } else{
                queueD.offer(i);
            }
        }
        int n=senate.length();

        while(!queueR.isEmpty() && !queueD.isEmpty()){
            int r=queueR.poll();
            int d=queueD.poll();

            if(r<d){
                queueR.offer(r+n);
            } else{
                queueD.offer(d+n);
            }
        }

        return queueR.isEmpty() ? "Dire" : "Radiant";
        
    }
}