class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String h="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                continue;
            }
            else{
                h=h+s.charAt(i);
            }
        }
        String g="";
        int l=0;
       for(int i=h.length()-1;i>=0;i--){
            g=h.charAt(i)+g;
            l++;
           if(l==k && i!=0){
             g="-"+g;
             l=0;
           }
       }
       
       return g.toUpperCase();
    }
}