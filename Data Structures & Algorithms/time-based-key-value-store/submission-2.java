class TimeMap {
    private Map<String,List<Pair>> map;
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        var list = map.get(key);
        if(list.isEmpty())
            return "";
        int low = 0, high = list.size()-1,mid=0;
        Pair largestYet=null;
        while(low<=high){
            mid = low+(high-low)/2;
            if(list.get(mid).timestamp==timestamp)
                return list.get(mid).value;
            else if(list.get(mid).timestamp>timestamp)
                high=mid-1;
            else{
                low=mid+1;
                largestYet=list.get(mid);
            }
        }
        if(largestYet!=null && largestYet.timestamp<timestamp)
            return largestYet.value;
        return "";
    }
}
class Pair
{
    String value;
    int timestamp;
    Pair(String value,int timestamp){
        this.value=value;
        this.timestamp = timestamp;
    }
}
