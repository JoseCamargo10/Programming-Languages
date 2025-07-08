public class Strings {
    public static void main(String[] args) {
        String firstString = "Test123";
        String secondString = "Test" + 123;
        String thirdString = "test123";

        if (firstString.equals(secondString)){  // If we have test123 instead of Test123, this code wouldn't be excecuted as it is case sensitive
            System.out.println("Both strings have the same content (case sensitive)");
        }

        if (firstString.equalsIgnoreCase(thirdString)){ // Here, as both test123 and Test123 say the same thing and we don't care about cases, is going to be executed
            System.out.println("Both strings have the same content (case insensitive)\n");
        }

        // Character changing within a String
        String random = "Random String";
        String upper = random.toUpperCase();
        String lower = random.toLowerCase();
        System.out.println(random);
        System.out.println(upper);
        System.err.println(lower+"\n");

        // Find a String within another
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = "helLO";
        String str4 = "o";
        System.out.println(str1.contains(str2));    // True
        System.out.println(str1.contains(str3));    // False
        System.out.println(str1.indexOf(str4)+"\n");     // Returns the position of the first coincidence, in this case, 4 for "o"
        // These methods can be used at the same time for one operation

        // Splitting
        String lineFromCsvFile = "Mickey;Bolton;12345;121216";
        String[] dataCells = lineFromCsvFile.split(";");
        // Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};

        // Concatenation
        String string1 = "Hello ";
        String string2 = "world";
        String string3 = string1.concat(string2);
        System.out.println(string3+"\n");

        // Substrings
        String s = "this is an example";
        String a = s.substring(11); // a will hold the string starting at character 11 until the end ("example")
        String b = s.substring(5, 10); // b will hold the string starting at character 5 and ending right before character 10 ("is an")
        String c = s.substring(5, s.length()-3); // c will hold the string starting at character 5 ending right before s length is out of 3  ("is an exam")
        System.out.println(a);
        System.out.println(b);
        System.out.println(c+"\n");

        // Replacing parts of Strings
        String n = "metal petal et al.";
        System.out.println(n.replace("etal","etallica")+"\n");
    }
}
