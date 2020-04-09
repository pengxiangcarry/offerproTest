package pro.test;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * -Xms20m���ѵ���СֵΪ20MB
 * -Xmx20m���ѵ����ֵΪ20MB
 * -XX:+HeapDumpOnOutOfMemoryError ��������ڳ����ڴ�����쳣ʱDump����ǰ���ڴ��ת������
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
