class Solution {
    private char wild = '#';
    public String encode(List<String> strs) {
        String encoded_string = "";
        for (String string : strs) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == wild)
                    encoded_string = encoded_string +'\\';           
                if(string.charAt(i)=='\\')
                    encoded_string+='\\';
                encoded_string = encoded_string +string.charAt(i);
            }
            encoded_string+=wild;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        System.out.print(str);
        List<String> strings = new ArrayList();
        for(int i=0;i<str.length();i++){
            String string = "";
            int j=i;
            while(j<str.length() && str.charAt(j)!=wild){
                if(str.charAt(j)=='\\'){
                    if(str.charAt(j+1)==wild){
                        string+=wild;
                        j+=2;
                        i+=2;
                        continue;
                    }
                    else if(str.charAt(j+1)=='\\'){
                        string+='\\';
                        i+=2;
                        j+=2;
                        continue;
                    }
                    else{
                        string+=str.charAt(j);
                        j++;
                        i++;
                        continue;
                    }
                }
                string+=str.charAt(j);
                j++;
                i++;
            }
            strings.add(string);
        }
        return strings;
    }
}
