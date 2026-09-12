class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,List<Pair>>locations = new HashMap();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.')
                    continue;
                locations.putIfAbsent(board[i][j],new ArrayList());
                locations.get(board[i][j]).add(new Pair(i,j));
            }
        }
        for(var locationList:locations.values()){
            for(int i=0;i<locationList.size();i++){
                for(int j=i+1;j<locationList.size();j++){
                    if(locationList.get(i).row==locationList.get(j).row)
                        return false;
                    if(locationList.get(i).col==locationList.get(j).col)
                        return false;
                    if(locationList.get(i).row/3==locationList.get(j).row/3 && locationList.get(i).col/3==locationList.get(j).col/3)
                        return false;
                }
            }
        }
        return true;
    }
}
class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
    public String toString(){
        return "["+row+","+col+"]";
    }
}
