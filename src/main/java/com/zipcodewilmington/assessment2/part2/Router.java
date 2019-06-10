package com.zipcodewilmington.assessment2.part2;

import javafx.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {
    Map<String,String> theMap = new LinkedHashMap<>();

    public void add(String path, String controller) {
        theMap.put(path, controller);
    }

    public Integer size() {
        return theMap.size();
    }

    public String getController(String path) {
        return theMap.get(path);
    }

    public void update(String path, String studentController) {
        theMap.replace(path,studentController);
    }

    public void remove(String path) {
        theMap.remove(path);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Map.Entry<String,String> entry : theMap.entrySet()){
            builder.append(entry.getKey()).append(entry.getValue()).append('\n');
        }
        return builder.toString();
    }
}
