package com.zipcodewilmington.assessment2.part2;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Router {
    private Boolean usingAL=true;
    private List<Pair<String,String>> pseudoMap = new ArrayList<>();
    private Map<String,String> theMap = new LinkedHashMap<>();
 //   Pair<String,String> thisPair = new Pair<>(s1,s2);

    public void add(String path, String controller) {
        theMap.put(path, controller);
        pseudoMap.add(new Pair<>(path,controller));
    }

    public Integer size() {
        if(usingAL) pseudoMap.size();
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
        if(usingAL){
            for (Pair<String,String> pair : pseudoMap) {
                builder.append(pair.getKey()).append(pair.getValue()).append('\n');
            }
        } else {
            for (Map.Entry<String, String> entry : theMap.entrySet()) {
                builder.append(entry.getKey()).append(entry.getValue()).append('\n');
            }
        }
        return builder.toString();
    }
}
