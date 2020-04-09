package pro.test;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * -Xms20m：堆的最小值为20MB
 * -Xmx20m：堆的最大值为20MB
 * -XX:+HeapDumpOnOutOfMemoryError 让虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照
 *  
 */
public class HeapOOM {

    static class OOMObject {    }
    
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();    
        while(true) {
            list.add(new OOMObject());
        } 
    }
}
