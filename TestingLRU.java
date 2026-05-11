//Task 10 Capacity Handling and Testing
public class TestingLRU {
    public static void main(String[] args) {
        System.out.println("===== LRU CACHE TEST =====\n");

        System.out.println("Test1: Capacity Rule");
        LRUcache<Integer> cache1 = new LRUcache<>(3);
        cache1.put(1, 100);
        cache1.put(2, 200);
        cache1.put(3, 300);
        cache1.put(4, 400);
        cache1.display();
        
        System.out.println("Test2: Insertion & Retrieval");
        LRUcache<Integer> cache2 = new LRUcache<>(3);
        cache2.put(1, 100);
        cache2.put(2, 200);
        cache2.put(3, 300);
        System.out.println(cache2.get(1));
        System.out.println(cache2.get(2));
        System.out.println(cache2.get(3));
        cache2.display();
        
        System.out.println("Test3: Update Behavior");
        LRUcache<Integer> cache3 = new LRUcache<>(3);
        cache3.put(1, 100);
        cache3.put(2, 200);
        cache3.put(3, 300);
        cache3.put(2, 999);
        System.out.println(cache3.get(2));
        cache3.display();


        System.out.println("Test4: Eviction Order");
        LRUcache<Integer> cache4 = new LRUcache<>(3);
        cache4.put(1, 100);
        cache4.put(2, 200);
        cache4.put(3, 300);
        cache4.get(1);
        cache4.put(4, 400);
        cache4.display();

        System.out.println("Test5: Edge Cases");
        System.out.println("Empty Cache Test");
        LRUcache<Integer> emptyCache = new LRUcache<>(2);
        System.out.println(emptyCache.get(10));
        emptyCache.remove(10);
        emptyCache.display();

        System.out.println("Repeated Access Test");
        LRUcache<Integer> cache5 = new LRUcache<>(3);
        cache5.put(1, 100);
        cache5.put(2, 200);
        cache5.put(3, 300);
        cache5.get(2);
        cache5.get(2);
        cache5.get(2);
        cache5.display();
    }
}