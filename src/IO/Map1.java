package IO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zdmein on 2017/9/10.
 */
public class Map1 {
    public static void main(String [] args){
        HashMap<String,Integer> map= new HashMap<String,Integer>();

        map.put("zdm",1);
        map.put("Item2",     2);
        map.put("Item3",    3);
        map.put("Item4",     4);

        map.put("zdm",2);
        Set set     =     map.entrySet();
        Iterator iterator     =     set.iterator();
        while     (iterator.hasNext()){
            Map.Entry     mapentry     =     (Map.Entry)     iterator.next();
            System.out.println(mapentry.getKey()     +     "/"     +     mapentry.getValue());
        }
    }



}
