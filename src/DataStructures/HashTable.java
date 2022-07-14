package DataStructures;

import DataStructures.DummyModels.Employee;

public class HashTable {
    private Employee[] hashTable;

    public HashTable() {
        this.hashTable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (hashTable[hashedKey] != null) {
            System.out.println("Sorry there is already an employee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        return hashTable[hashKey(key)];
    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }

}
