class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String r[]=sentences[i].split(" ");
            m=r.length;
            if(m>max){
                max=m;
            }
        }
        return max;
    }
}