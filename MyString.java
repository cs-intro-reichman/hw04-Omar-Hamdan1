public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // حالة خاصة: السلسلة الثانية فارغة -> تعتبر موجودة دائمًا
        if (str2.length() == 0) {
            return true;
        }

        // إذا str2 أطول من str1 مستحيل تكون بداخلها
        if (str2.length() > str1.length()) {
            return false;
        }

        // توحيد لحالة الأحرف
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // نبحث عن str2 داخل str1 يدويًا
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int j = 0;
            while (j < str2.length() && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                // لقينا كل أحرف str2 متتالية داخل str1
                return true;
            }
        }

        // إذا خلصنا اللوب بدون ما نلاقي تطابق كامل
        return false;
    }


}
