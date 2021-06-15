import java.util.HashMap;
import java.util.Set;
class HashMapFun{
    public void makeArra(){
    HashMap<String,String> trackList = new HashMap<String,String>();
    trackList.put("drama","arcade");
    trackList.put("depress","without");
    trackList.put("slow","lovly");
    trackList.put("stage","demons");
    System.out.println(trackList.get("stage"));
    
    for (String key : trackList.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, trackList.get(key)));
        }
    }
}