public class DictionaryDriver {
    public static void main(String[] args) {

        Dictionary testing = new Dictionary();
        //test isEmpty
        System.out.println("Test isEmpty(should return true): " + testing.isEmpty());
        //test size
        System.out.println("Test size(should return 0): " + testing.size());
        //add a value
        testing.put("Among", "sus");
        System.out.println("Adding key value pair.");
        //test isEmpty
        System.out.println("Test isEmpty(should return false): " + testing.isEmpty());
        //test size
        System.out.println("Test size(should return 1): " + testing.size());
        //test contains method
        System.out.println("Test contains with Among(should return true): " + testing.contains("Among"));
        System.out.println("Test contains with Amongus(should return false): " + testing.contains("Amongus"));
        //get test
        System.out.println("Test get(should return sus): " + testing.get("Among"));
        //remove test
        System.out.println("Test remove(should return sus): " + testing.remove("Among"));
        //adding more elements to test the contain methods
        System.out.println("Adding more elements to test the contain methods");
        testing.put("Ishan", "Tandon");
        testing.put("Isha", "Tando");
        testing.put("Ishy", "Fishy");
        testing.put("Why did the programmer quit his job?", "Because he didn't get A-rrays...");
        //test collection methods
        System.out.println("Test collection of keys method(should return a collection of keys): " + testing.keys());
        System.out.println("Test collection of values method(should return a collection of values): " + testing.values());

    }
}
