//package homework8.phonebook;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Phone_Directory {
//    List<java.lang.Record> recordList;
//
//    public void add(java.lang.Record record) {
//        recordList.add(record);
//    }
//
//    public Number find(String name) {
//        for (java.lang.Record record : recordList) {
//            if (record.getName().equals(name)) return record.getNumber();
//        }
//        return null;
//    }
//
//    public List<Number> findAll(String name) {
//        List<Number> numbers = new ArrayList<>();
//        boolean checkIfExist = false;
//        for (java.lang.Record record : recordList) {
//            if (record.getName().equals(name)) {
//                checkIfExist = true;
//                numbers.add(record.getNumber());
//            }
//        }
//        if (checkIfExist) return numbers;
//        else return null;
//    }
//
//}
