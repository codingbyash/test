public class Strings {
    public static void main(String[] args) {
//        STRINGS ARE IMMUTABLE SO U HAVE TO MAKE A NEW STRING ALWAYS
        String name="Ashish";
        int value=name.length();
        System.out.println(value);
//        TO CHANCE STRING FROM UPPERCASE TO LOWERCASE AND VICE VERSA
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ucase=name.toUpperCase();
        System.out.println(ucase);
//        TRIMMING THE TRAILING AND LEADING SPACES
        String realname="    Ashish   ";
        System.out.println(realname);
        String trimmed=realname.trim();
        System.out.println(trimmed);
//USING SUBSTRING TO PRINT WANTED CHARACTERS OF A WORD
        System.out.println(name.substring(2,5));
//REPLACING A CHARACTER
        System.out.println(name.replace("h","g"));
        System.out.println(name.replace("h","zzz"));
        System.out.println(name.startsWith("Ash"));
        System.out.println(name.endsWith("jj"));
        System.out.println(name.charAt(0));
//INDEX FINDING
        System.out.println(name.indexOf("h"));
        System.out.println(name.indexOf("h",4));

        System.out.println(name.equals("ashish")); //THIS IS CASE SENSITIVE
        System.out.println(name.equalsIgnoreCase("AsHisH"));//IT IGNORES CASE
        System.out.println("Hello Ashish\tsir");


    }

    }

