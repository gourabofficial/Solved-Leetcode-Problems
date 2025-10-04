# 📘 Hashing, HashSet & HashMap in Java

---

## 1. 🔑 Hashing

**Definition**
Hashing is a technique to convert data into a fixed-size integer (hash code) using a **hash function**. This hash code decides where data will be stored in memory.

* Used in `HashMap`, `HashSet`, `Hashtable`, etc.
* Provides **O(1) average time complexity** for search, insert, and delete.

**How it works:**

1. Object → Hash Function → Hash Code
2. Hash Code → Index in an array (bucket)
3. If collision happens → handled using chaining (LinkedList/Tree)

**Why use Hashing?**

* Faster search compared to arrays or lists.
* Used in databases, caches, compilers, and cryptography.

**Example**

```java
String s = "Hello";
System.out.println(s.hashCode()); 
```

---

## 2. 🌿 HashSet

**Definition**

* Stores **unique elements** only.
* **Unordered collection** (no guarantee of order).
* Internally uses **HashMap** (values are stored as `Object` constants).

**Important Methods**

* `add(element)`
* `remove(element)`
* `contains(element)`
* `size()`
* `clear()`

**Example**

```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();
set.add(10);
set.add(20);
set.add(20); // duplicate ignored
System.out.println(set); // [20, 10]
```

**Use Cases**

* Removing duplicates
* Storing unique items (roll numbers, IDs)

---

## 3. 🗂️ HashMap

**Definition**
`HashMap<K, V>` stores **key-value pairs**.

* Keys must be unique.
* Values can be duplicated.
* Provides O(1) average time for operations.

**Important Methods**

* `put(key, value)`
* `get(key)`
* `remove(key)`
* `containsKey(key)`
* `containsValue(value)`
* `keySet()`
* `values()`
* `entrySet()`

**Example**

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
map.put(1, "Gourab");
map.put(2, "Rahul");
map.put(3, "Ananya");

System.out.println(map.get(2)); // Rahul
map.remove(1);

for (Integer key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

**Use Cases**

* Dictionary (word → meaning)
* Student ID → Name
* Cache storage
* Configuration storage

---

## 4. ⚖️ HashSet vs HashMap

| Feature           | HashSet                     | HashMap                            |
| ----------------- | --------------------------- | ---------------------------------- |
| Stores            | Unique elements             | Key-Value pairs                    |
| Duplicate Keys?   | Not applicable              | ❌ Not allowed                      |
| Duplicate Values? | ❌ Not allowed (only unique) | ✅ Allowed                          |
| Nulls             | One `null` allowed          | One `null` key, many `null` values |
| Use Case          | Unique roll numbers, IDs    | Roll number → Student name         |

---

## ✅ Recap

* **Hashing**: Converts object → hash code → bucket index (fast operations).
* **HashSet**: Stores only unique values (internally uses `HashMap`).
* **HashMap**: Stores key-value pairs (unique keys, duplicate values allowed).

---
