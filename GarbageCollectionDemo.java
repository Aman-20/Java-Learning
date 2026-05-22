public class GarbageCollectionDemo {
    protected void finalize() {
        System.out.println("Garbage Collector called");
    }
    public static void main(String[] args) {

        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        // Using object
        System.out.println(obj1);
        // Making object eligible for GC
        obj1 = null;
        // Request garbage collection
        System.gc();
    }
}