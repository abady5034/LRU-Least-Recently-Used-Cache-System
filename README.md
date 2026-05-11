# ⚡ LRU (Least Recently Used) Cache System

## 📌 Overview
This project implements a high-performance **LRU (Least Recently Used) Cache System** using a combination of a **Doubly Linked List** and a **Hash Table**.  
The design ensures that all core operations — insertion, retrieval, and deletion — are executed in **O(1) time complexity**, making it highly efficient for real-world applications.

---

## 🧠 Problem Statement
In many systems, memory is limited and must be managed efficiently.  
The LRU Cache solves this problem by keeping only the most recently used data while automatically evicting the least recently used items when the cache reaches its capacity.

---

## ⚙️ System Design

### 🔹 Doubly Linked List
- Maintains the usage order of cache elements  
- Head → Most recently used  
- Tail → Least recently used  
- Supports:
  - Insert at front  
  - Remove node  
  - Move node to front  
  - Remove tail (LRU element)  

✅ All operations run in constant time **O(1)**  

---

### 🔹 Hash Table
- Provides fast access to cache elements using keys  
- Handles collisions using chaining  
- Supports:
  - Insert  
  - Search  
  - Remove  

✅ Average time complexity: **O(1)**  

---

### 🔹 Node Structure
Each node contains:
- Key  
- Value (Generic type)  
- Pointers:
  - Previous & Next (for linked list)  
  - HashNext (for collision handling)  

---

## 🔄 LRU Cache Operations

### ✅ get(key)
- Returns the value associated with the key  
- Moves the accessed node to the front (recently used)  

### ✅ put(key, value)
- Inserts a new key-value pair  
- Updates value if key already exists  
- If cache is full:
  - Removes the least recently used item (tail)  

### ✅ remove(key)
- Deletes an item from both:
  - Linked list  
  - Hash table  

---

## 🚀 Key Features
- ⚡ Constant-time operations (O(1))  
- 🔄 Automatic eviction policy  
- 📦 Generic and reusable design  
- 🚀 High performance & optimized memory usage  

---

## 🧪 Testing
The system was tested with multiple scenarios to verify:
- Correct LRU eviction behavior  
- Handling of cache capacity limits  
- Updating existing keys  
- Edge cases (empty cache, invalid operations)  

---

## 📊 Applications
- Web caching systems  
- Database query caching  
- Operating systems (memory management)  
- API response caching  

---

## 🛠️ Tech Concepts Used
- Data Structures:
  - Doubly Linked List  
  - Hash Table  
- Algorithms:
  - LRU Cache Policy  
- Complexity Optimization  

---

## 👨‍💻 Author
- Omar Abady
