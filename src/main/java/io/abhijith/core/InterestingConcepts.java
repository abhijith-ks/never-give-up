package io.abhijith.core;

import org.junit.Test;
import org.openjdk.jol.vm.VM;

import java.util.Iterator;
import java.util.Map;

/**
 * Learn these concepts
 */
public class InterestingConcepts {

    @Test
    public void test() {
        Iterator<Map.Entry<Object, Object>> sysProps = System.getProperties().entrySet().iterator();
        while(sysProps.hasNext()) {
            Map.Entry<Object, Object> item = sysProps.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }
        System.out.println();

        System.out.println(VM.current().details());
    }
}
