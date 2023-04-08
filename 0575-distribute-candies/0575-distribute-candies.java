class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        int ans=0;
        for(int no:candyType){
            if(!hs.contains(no)){
                hs.add(no);
                count++;
                
                
            }
        }
        int n=candyType.length;
       
            if(count>=n/2){
                ans=n/2;
            }else{
                ans=count;
            }
            
            
            return ans;

    }
}