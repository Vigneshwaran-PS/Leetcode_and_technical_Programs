package Leetcode_and_technical_Programs.Technical_Problems;

public class StringExample {
    public static void main(String[] args) {

        String a = "java";
        String b = "java";
        System.out.println("a.equals(b) : " + a.equals(b));

        String c = new String("java");
        String d = new String("java");
        System.out.println("c.equals(d) : " + c.equals(d));
        System.out.println("c.equals(a) : " + c.equals(a));
        System.out.println("a.equals(c) : " + a.equals(c));


        System.out.println("\n---------------------------------------------------------------\n");


        String s1 = new String("welcome");
        char[] arr = {'w','e','l','c','o','m','e'};
        String s2 = new String(arr);
        System.out.println("s1.equals(s2) : "+s1.equals(s2));
        String s3 = new String(arr,1,4);
        System.out.println("s3 : "+s3);


        System.out.println("\n---------------------------------------------------------------\n");


        String str1 = "welcome";
        String str2 = new String("welcome");

        System.out.println("length : " + str1.length());
        System.out.println("length : " + str2.length());
        System.out.println("str1.charAt() : " + str1.charAt(0)); //str1.charAt(7) ---> index out od boundary
        System.out.println("str2.charAt() : " + str2.charAt(0));  //str2.charAt(7) ---> index out od boundary
        System.out.println("startsWith : " + str1.startsWith("w"));
        System.out.println("startsWith : " + str1.startsWith("z"));
        System.out.println("startsWith : " + str1.startsWith("wel"));
        System.out.println("startsWith : " + str2.startsWith("w"));
        System.out.println("startsWith : " + str2.startsWith("z"));
        System.out.println("startsWith : " + str2.startsWith("wel"));
        System.out.println("endsWith : " + str1.endsWith("e"));
        System.out.println("endsWith : " + str1.endsWith("ome"));
        System.out.println("endsWith : " + str1.endsWith("z"));
        System.out.println("endsWith : " + str2.endsWith("e"));
        System.out.println("endsWith : " + str2.endsWith("ome"));
        System.out.println("endsWith : " + str2.endsWith("z"));
        System.out.println("Substring : " + str1.substring(2));
        System.out.println("Substring : " + str2.substring(2));
        System.out.println("Substring : " + str1.substring(2,6));
        System.out.println("Substring : " + str2.substring(2,5));
        System.out.println("UpperCase : " + str1.toUpperCase());
        System.out.println("UpperCase : " + str2.toUpperCase());
        System.out.println("Replace : " + str1.replace('e','E'));
        System.out.println("Replace : " + str2.replace('w','z'));
        System.out.println("index of : " + str1.indexOf('w'));
        System.out.println("index of : " + str1.indexOf('z'));
        System.out.println("index of : " + str2.indexOf('w'));
        System.out.println("index of : " + str2.indexOf('z'));
        System.out.println("Last index : " + str1.lastIndexOf('e')); //there are two 'e' in welcome it returns last index of e which is 6
        System.out.println("Last index : " + str1.lastIndexOf('m'));
        System.out.println("Last index : " + str2.lastIndexOf('e')); //there are two 'e' in welcome it returns last index of e which is 6
        System.out.println("Last index : " + str2.lastIndexOf('m'));
        System.out.println("Concat : " + str1.concat(str2));
        System.out.println("str1 : " + str1);


        System.out.println("\n---------------------------------------------------------------\n");

        String password = "viki12";
        System.out.println("Ignore Case : " + password.equalsIgnoreCase("VIKI12"));
        System.out.println("Ignore Case : " + password.equals("VIKI12"));

        String duplicatePassword = "VIkI12";
        System.out.println("Ignore Case : " + password.equalsIgnoreCase(duplicatePassword));
        System.out.println("Ignore Case : " + password.equals(duplicatePassword));
    }
}
