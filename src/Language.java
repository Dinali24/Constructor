public class Language {
    String languages;
    Language(String a){
        languages = a;
        System.out.println(languages + " is languages");

    }

    public static void main(String[] args) {
        Language a = new  Language("Sinhala");
        Language b = new Language("Tamill");
        Language c = new Language("English");

    }
}
