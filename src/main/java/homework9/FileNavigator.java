package homework9;

import java.util.*;
import java.util.stream.Collectors;

public class FileNavigator {

    static Map<String, FileData> fileDataMap = new HashMap<>();

    public static void add(FileData file) {
        if (!containsPath(fileDataMap, file.getFilePath()))
            fileDataMap.put(file.getFilePath(), file);
        else System.out.println("Error, this path is already used");
    }

    static boolean containsPath(Map<String, FileData> map, String path) {
        for (FileData fileData : map.values()) {
            if (fileData.getFilePath().equals(path)) {
                return true;
            }
        }
        return false;
    }

    public static String find(String filePath) {
        String str = "";
        for (String key : fileDataMap.keySet()) {
            if (fileDataMap.containsKey(filePath)) {
                str = fileDataMap.get(key).getFileName();
            }
        }
        return str;
    }

    public static Map<String, FileData> filterBySize(Map<String, FileData> fileDataMap, int requiredByte) {
        Map<String, FileData> newFileDataMap = new HashMap<>();
        for (String key : fileDataMap.keySet()) {
            if (fileDataMap.get(key).getFileByte() <= requiredByte) newFileDataMap.put(key, fileDataMap.get(key));
        }
        return newFileDataMap;
    }

    public static void remove(String filePath) {
        fileDataMap.remove(filePath);
    }

    public static Map<String, FileData> sortBySize() {
        List<Map.Entry<String, FileData>> entryList = new ArrayList<>(fileDataMap.entrySet());
        entryList.sort(Comparator.comparing(entry -> entry.getValue().getFileByte()));
        return entryList.stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
