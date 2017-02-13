package com.naraikin;

import java.util.HashMap;

/**
 * Created by dmitrii on 13.02.17.
 */
public class Counter {
    private volatile HashMap<Integer, Integer> map = new HashMap<>();
    public volatile boolean isFinish = false;
    public Integer result = -1;
    public Counter(){

    }

    public synchronized void addValue(Integer key){
        if(map.containsKey(key)){
            map.put(key, map.get(key)+1);
        } else {
            map.put(key, 1);
        }
    }

    public synchronized boolean isPredicate(){
        for(Integer val :map.keySet()){
            if(map.get(val) >= 5){
                isFinish = true;
                result = val;
                return true;
            }
        }
        return false;
    }

    public Integer getValue(Integer key){
        return map.get(key);
    }
    public void printer(){
        System.out.println(map);
    }

}
