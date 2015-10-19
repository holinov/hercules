package com.appmetr.hercules;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HerculesMonitoringUtils{
    public static <K,V> Map<K,V> makeParams(K k,V v){
        return Collections.singletonMap(k, v);
    }

    public static <K,V> Map<K,V> makeParams(K k0,V v0,K k1,V v1){
        Map<K,V> params = new HashMap<K, V>(2);
        params.put(k0,v0);
        params.put(k1,v1);
        return params;
    }

    public static <T> Map<T,T> makeParams(T... vals){
        if(vals.length % 2 != 0){
            throw new RuntimeException("Values count must be even");
        }
        Map<T,T> params = new HashMap<T,T>(2);
        for (int i = 0; i < vals.length; i+=2) {
            params.put(vals[i], vals[i + 1]);
        }
        return params;
    }
}
