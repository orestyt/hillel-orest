package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

    Map<String, FileData> fileDataMap = new HashMap<>();

    public void add(FileData file) {
        fileDataMap.put(file.getFilePath(), file);
    }

    public String find(String filePath) {
        String str = "";
        for (String key : fileDataMap.keySet()) {
            if (fileDataMap.containsKey(filePath)) {
                str = key + fileDataMap.get(key);
            }
        }
        return str;
    }

    public Map<String, FileData> filterBySize(Map<String, FileData> fileDataMap, int requiredByte) {
        Map<String, FileData> newFileDataMap = new HashMap<>();
        for (String key : fileDataMap.keySet()) {
            if (fileDataMap.get(key).getFileByte() >= requiredByte) newFileDataMap.put(key, fileDataMap.get(key));
        }
        return newFileDataMap;
    }

    public void remove(String filePath){
        fileDataMap.remove(filePath);
    }

//    public Map<String, FileData> sortBySize(){
//        Map<String, FileData> newFileDataMap = new HashMap<>();
//
//    }
}
