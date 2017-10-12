package JVM;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdmein on 2017/10/7.
 *  Java 堆溢出
 */
public class HeapOOM1 {
    static class OOMObject{}
    public static void main(String [] args){
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}

/**
    Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3210)
        at java.util.Arrays.copyOf(Arrays.java:3181)
        at java.util.ArrayList.grow(ArrayList.java:261)
        at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
        at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
        at java.util.ArrayList.add(ArrayList.java:458)
        at JVM.HeapOOM1.main(HeapOOM1.java:15)
*/