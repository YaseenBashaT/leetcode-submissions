class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i));
            if(i<strs.size()-1){
                sb.append(';');
            }
        }
            sb.append(';');
        return sb.toString();

    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
        return new ArrayList<>();
        }
        List<String> strs = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ';') {
                sb.append(str.charAt(i));
            }
            if (str.charAt(i) == ';') {
                strs.add(sb.toString());
                sb.setLength(0);
            }
        }
        return strs;
    }
}
