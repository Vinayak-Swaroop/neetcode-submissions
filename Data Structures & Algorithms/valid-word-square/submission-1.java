class Solution {
    public boolean validWordSquare(List<String> words) {
        char[][] c = new char[words.size()][words.size()];
        try {
            for (int i = 0; i < words.size(); i++) {
                for (int j = 0; j < words.get(i).length(); j++) {
                    c[i][j] = words.get(i).charAt(j);
                }
            }
        } catch (Exception e) {
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] != c[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
