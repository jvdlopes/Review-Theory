package part1;


public class VariableReview {

    
    public static void main(String[] args) {
        //primitive data types
        int a = 1234567890; //4 bytes
        long d = 1234567890123456789L; //8 bytes
        short c = 12345; //2 bytes
        byte b = 127; //1 byte
        
        //decimal
        double dbl = 45.78; //8
        float flt = 45.75F; //4
        
        //2 others
        char chr = 'x';
        boolean bool = true; //or false
        
        //strings - > NOT primitive
        String s = "I went to school today";
        //          0123456789012345678901
        //String is capital (like all objects)
        //"s" has abilities (a.k.a. methods)
        
        int len = s.length();
        char lett = s.charAt(7);
        String str1 = s.substring(3, 8);
        String str2 = s.substring(4);
        //note all methods
        //1 - all methods have a return type (send back something), except void method
        //2 - methods may or may not require parameters - data sent in
        //3 - Some methods have more than one version
        System.out.println("Length of \"s\" is: " + len);
        System.out.println("character at loc 7 is " + lett);
        System.out.println("Location 3 to 8: " + str1);
        System.out.println("Location 4 to the end: " + str2);
        
        //escape codes: \" \\ \t(tab) \n(new line)
        System.out.println("First\t\tLast\t\tEmail Address");
        System.out.println("C:\\Documents\\Users");
        System.out.println("He went\n\nto the store");
    }
    
}
