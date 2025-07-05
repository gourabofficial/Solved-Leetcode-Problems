# Java Collection Framework & Generics

## Table of Contents
1. [Collection Framework Overview](#collection-framework-overview)
2. [Core Interfaces](#core-interfaces)
3. [List Interface](#list-interface)
4. [Set Interface](#set-interface)
5. [Map Interface](#map-interface)
6. [Queue Interface](#queue-interface)
7. [Generics](#generics)
8. [Iterator & Enhanced For Loop](#iterator--enhanced-for-loop)
9. [Collections Utility Class](#collections-utility-class)
10. [Best Practices](#best-practices)

---

## Collection Framework Overview

The **Java Collection Framework** provides a unified architecture for storing and manipulating groups of objects. It includes:

- **Interfaces**: Abstract data types representing collections
- **Implementations**: Concrete implementations of collection interfaces
- **Algorithms**: Methods that perform useful computations (sorting, searching)

### Collection Hierarchy

```
                    Collection (Interface)
                   /          |           \
                List        Set           Queue
               /   \       /   \         /     \
        ArrayList  LinkedList  HashSet  TreeSet  PriorityQueue  ArrayDeque
        Vector     Stack       LinkedHashSet
```

### Map Hierarchy (Separate from Collection)

```
                    Map (Interface)
                   /       |        \
               HashMap  TreeMap  LinkedHashMap
              Hashtable  WeakHashMap  EnumMap
```

---

## Core Interfaces

### 1. Collection Interface
- Root interface of the collection hierarchy
- Provides basic operations: `add()`, `remove()`, `size()`, `isEmpty()`

### 2. Iterable Interface
- Parent of Collection interface
- Provides iterator functionality
- Enables enhanced for-loop

---

## List Interface

**Characteristics:**
- ✅ Ordered collection (maintains insertion order)
- ✅ Allows duplicate elements
- ✅ Index-based access

### ArrayList
```java
import java.util.ArrayList;
import java.util.List;

List<String> arrayList = new ArrayList<>();
arrayList.add("Java");
arrayList.add("Python");
arrayList.add("JavaScript");
arrayList.add("Java"); // Duplicates allowed

System.out.println(arrayList.get(0)); // Java
System.out.println(arrayList.size()); // 4
```

**Features:**
- ✅ Fast random access (O(1))
- ❌ Slow insertion/deletion in middle (O(n))
- ✅ Dynamic resizing
- ✅ Not synchronized (not thread-safe)

### LinkedList
```java
import java.util.LinkedList;

LinkedList<Integer> linkedList = new LinkedList<>();
linkedList.addFirst(10);
linkedList.addLast(20);
linkedList.add(1, 15); // Insert at index 1

System.out.println(linkedList); // [10, 15, 20]
```

**Features:**
- ✅ Fast insertion/deletion (O(1))
- ❌ Slow random access (O(n))
- ✅ Implements both List and Deque interfaces

### Vector (Legacy)
```java
import java.util.Vector;

Vector<String> vector = new Vector<>();
vector.add("Element1");
vector.add("Element2");
```

**Features:**
- ✅ Synchronized (thread-safe)
- ❌ Performance overhead
- ❌ Legacy class (use ArrayList with Collections.synchronizedList())

---

## Set Interface

**Characteristics:**
- ❌ No duplicate elements
- ✅ Mathematical set operations

### HashSet
```java
import java.util.HashSet;
import java.util.Set;

Set<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Apple"); // Duplicate ignored

System.out.println(hashSet); // [Apple, Banana] (order not guaranteed)
System.out.println(hashSet.size()); // 2
```

**Features:**
- ✅ Fast operations (O(1) average)
- ❌ No ordering guarantee
- ✅ Allows one null element
- ✅ Based on HashMap

### LinkedHashSet
```java
import java.util.LinkedHashSet;

LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("First");
linkedHashSet.add("Second");
linkedHashSet.add("Third");

System.out.println(linkedHashSet); // [First, Second, Third] (insertion order)
```

**Features:**
- ✅ Maintains insertion order
- ✅ Fast operations (O(1) average)
- ✅ Allows one null element

### TreeSet
```java
import java.util.TreeSet;

TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(30);
treeSet.add(10);
treeSet.add(20);

System.out.println(treeSet); // [10, 20, 30] (sorted order)
```

**Features:**
- ✅ Automatically sorted
- ✅ NavigableSet operations
- ❌ Slower operations (O(log n))
- ❌ No null elements
- ✅ Based on Red-Black Tree

---

## Map Interface

**Characteristics:**
- Key-value pairs
- No duplicate keys
- Each key maps to at most one value

### HashMap
```java
import java.util.HashMap;
import java.util.Map;

Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Alice", 25);
hashMap.put("Bob", 30);
hashMap.put("Charlie", 35);

System.out.println(hashMap.get("Alice")); // 25
System.out.println(hashMap.containsKey("Bob")); // true
System.out.println(hashMap.size()); // 3

// Iterating over Map
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

**Features:**
- ✅ Fast operations (O(1) average)
- ❌ No ordering guarantee
- ✅ Allows one null key and multiple null values
- ✅ Not synchronized

### LinkedHashMap
```java
import java.util.LinkedHashMap;

LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("First", "Java");
linkedHashMap.put("Second", "Python");
linkedHashMap.put("Third", "JavaScript");

System.out.println(linkedHashMap); // Maintains insertion order
```

**Features:**
- ✅ Maintains insertion order (or access order)
- ✅ Fast operations (O(1) average)
- ✅ Useful for LRU cache implementation

### TreeMap
```java
import java.util.TreeMap;

TreeMap<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Zebra", 1);
treeMap.put("Apple", 2);
treeMap.put("Banana", 3);

System.out.println(treeMap); // {Apple=2, Banana=3, Zebra=1} (sorted by keys)
```

**Features:**
- ✅ Automatically sorted by keys
- ✅ NavigableMap operations
- ❌ Slower operations (O(log n))
- ❌ No null keys

---

## Queue Interface

**Characteristics:**
- FIFO (First In, First Out) ordering
- Special insertion, extraction, and inspection operations

### PriorityQueue
```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(30);
pq.offer(10);
pq.offer(20);

System.out.println(pq.poll()); // 10 (smallest element)
System.out.println(pq.peek()); // 20 (next smallest)
```

### ArrayDeque
```java
import java.util.ArrayDeque;

ArrayDeque<String> deque = new ArrayDeque<>();
deque.addFirst("First");
deque.addLast("Last");
deque.addFirst("New First");

System.out.println(deque); // [New First, First, Last]
```

---

## Generics

**Benefits:**
- ✅ Type safety at compile time
- ✅ Elimination of type casting
- ✅ Generic algorithms

### Basic Generic Class
```java
public class Box<T> {
    private T content;
    
    public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}

// Usage
Box<String> stringBox = new Box<>();
stringBox.setContent("Hello");
String content = stringBox.getContent(); // No casting needed
```

### Generic Methods
```java
public class Utility {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// Usage
String[] names = {"Alice", "Bob", "Charlie"};
Utility.swap(names, 0, 2);
```

### Bounded Type Parameters
```java
// Upper bound
public class NumberBox<T extends Number> {
    private T number;
    
    public double getDoubleValue() {
        return number.doubleValue(); // Can call Number methods
    }
}

// Lower bound (in wildcards)
List<? super Integer> numbers = new ArrayList<Number>();
```

### Wildcards
```java
// Upper bounded wildcard
List<? extends Number> numbers = new ArrayList<Integer>();

// Lower bounded wildcard
List<? super Integer> integers = new ArrayList<Number>();

// Unbounded wildcard
List<?> anything = new ArrayList<String>();
```

---

## Iterator & Enhanced For Loop

### Iterator
```java
import java.util.ArrayList;
import java.util.Iterator;

ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");

// Using Iterator
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
    // Safe removal during iteration
    if (element.equals("B")) {
        iterator.remove();
    }
}
```

### Enhanced For Loop (For-Each)
```java
// For Collections
for (String element : list) {
    System.out.println(element);
}

// For Maps
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

---

## Collections Utility Class

### Sorting
```java
import java.util.Collections;
import java.util.ArrayList;

ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(1);
numbers.add(2);

Collections.sort(numbers); // [1, 2, 3]
Collections.reverse(numbers); // [3, 2, 1]
```

### Searching
```java
ArrayList<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

Collections.sort(names);
int index = Collections.binarySearch(names, "Bob"); // Returns index
```

### Synchronization
```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
```

### Unmodifiable Collections
```java
List<String> list = new ArrayList<>();
list.add("Item1");
list.add("Item2");

List<String> unmodifiableList = Collections.unmodifiableList(list);
// unmodifiableList.add("Item3"); // Throws UnsupportedOperationException
```

---

## Best Practices

### 1. Program to Interfaces
```java
// Good
List<String> list = new ArrayList<>();
Map<String, Integer> map = new HashMap<>();

// Avoid
ArrayList<String> list = new ArrayList<>();
HashMap<String, Integer> map = new HashMap<>();
```

### 2. Use Generics
```java
// Good
List<String> names = new ArrayList<>();

// Avoid (Raw types)
List names = new ArrayList();
```

### 3. Choose Right Collection

| **Use Case** | **Recommended Collection** |
|--------------|---------------------------|
| Fast random access | `ArrayList` |
| Frequent insertion/deletion | `LinkedList` |
| No duplicates | `HashSet` |
| Sorted unique elements | `TreeSet` |
| Key-value mapping | `HashMap` |
| Sorted key-value mapping | `TreeMap` |
| Thread-safe operations | `ConcurrentHashMap` |

### 4. Initialize with Capacity
```java
// For known size
List<String> list = new ArrayList<>(1000);
Map<String, Integer> map = new HashMap<>(16, 0.75f);
```

### 5. Use Enhanced For Loop When Possible
```java
// Good for read-only operations
for (String item : list) {
    System.out.println(item);
}

// Use Iterator for removal during iteration
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    if (condition) {
        it.remove();
    }
}
```

---

## Summary

The Java Collection Framework provides:
- **Flexibility**: Multiple implementations for different use cases
- **Performance**: Optimized data structures
- **Type Safety**: Through generics
- **Consistency**: Common interface across collections

Choose collections based on your specific requirements:
- **Performance characteristics** (time complexity)
- **Thread safety** requirements
- **Memory usage** considerations
- **Ordering** requirements