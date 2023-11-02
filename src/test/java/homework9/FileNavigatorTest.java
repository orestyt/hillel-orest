package homework9;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FileNavigatorTest {

    @Test
    void shouldAdd() {
        FileData file4 = new FileData("file4", 96, "path/2");
        FileData file2 = new FileData("file2", 50, "path/2");
        Map<String, FileData> shouldFileMap = new HashMap<>();
        shouldFileMap.put("path/2", file4);
        FileNavigator.add(file4);
        FileNavigator.add(file2);
        assertEquals(shouldFileMap, FileNavigator.fileDataMap);
    }

    @Test
    void shouldFind() {
        FileData file1 = new FileData("file1", 100, "path/1");
        FileNavigator.fileDataMap.put(file1.getFilePath(), file1);
        String result = FileNavigator.find("path/1");
        assertEquals("file1", result);

    }

    @Test
    void shouldFilterBySize() {
        FileData file1 = new FileData("file1", 100, "path/1");
        FileData file3 = new FileData("file3", 11, "path/3");
        FileData file2 = new FileData("file2", 50, "path/2");
        FileNavigator.fileDataMap.put(file1.getFilePath(), file1);
        FileNavigator.fileDataMap.put(file2.getFilePath(), file2);
        FileNavigator.fileDataMap.put(file3.getFilePath(), file3);
        Map<String, FileData> result = new HashMap<>();
        result.put("path/2", file2);
        result.put("path/3", file3);
        assertEquals(result, FileNavigator.filterBySize(FileNavigator.fileDataMap, 90));
    }

    @Test
    void shouldRemove() {
        FileData file1 = new FileData("file1", 100, "path/1");
        FileData file3 = new FileData("file3", 11, "path/3");
        FileData file2 = new FileData("file2", 50, "path/2");
        FileNavigator.fileDataMap.put(file1.getFilePath(), file1);
        FileNavigator.fileDataMap.put(file2.getFilePath(), file2);
        FileNavigator.fileDataMap.put(file3.getFilePath(), file3);
        Map<String, FileData> result = new HashMap<>();
        result.put("path/2", file2);
        result.put("path/3", file3);
        FileNavigator.remove("path/1");
        assertEquals(result, FileNavigator.fileDataMap);
    }

    @Test
    void shouldSortBySize() {
        FileData file1 = new FileData("file1", 100, "path/1");
        FileData file3 = new FileData("file3", 11, "path/3");
        FileData file2 = new FileData("file2", 50, "path/2");
        FileNavigator.fileDataMap.put(file1.getFilePath(), file1);
        FileNavigator.fileDataMap.put(file2.getFilePath(), file2);
        FileNavigator.fileDataMap.put(file3.getFilePath(), file3);
        Map<String, FileData> result = new HashMap<>();
        result.put("path/3", file3);
        result.put("path/2", file2);
        result.put("path/1", file1);
        FileNavigator.sortBySize();
        assertEquals(result, FileNavigator.fileDataMap);
    }
}