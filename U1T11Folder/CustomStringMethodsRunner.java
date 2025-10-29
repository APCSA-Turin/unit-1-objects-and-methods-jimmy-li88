package U1T11Folder;

public class CustomStringMethodsRunner {

    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        boolean bool = methods.longerThan("coba", 7);
        System.out.println(bool);
        String str = methods.funnyString("coba", 1);
        System.out.println(str);
        String str1 = methods.halvesReversed("coba is the best");
        System.out.println(str1);
        String str2 = methods.pigLatin("coba");
        System.out.println(str2);
        String str3 = methods.removeCharacter("Cooba", 1);
        System.out.println(str3);
        String str4 = methods.insertAt("Coba", "aa!", "!");
        System.out.println(str4);
        String str5 = methods.endUp("Coba", 3);
        System.out.println(str5);
        String str6 = methods.yellOrWhisper("Cobert");
        System.out.println(str6);


    }
}
