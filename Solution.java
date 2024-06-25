class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0;
        int lastCount = 0;
        int total = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = ch-'a';
            
            if(count+widths[index] > 100){
                total++;
                lastCount = count;
                count = widths[index];
            }else{
                count += widths[index];
            }
        }
        return new int[]{total+1, count};
    }
}
