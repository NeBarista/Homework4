public class Main {
    public static void main(String[] args) {
         final String a = "Kirill";
        String eat = "apple";
        Eating (a, eat);
        eat = "cake";
        Eating(a, eat);
        eat = "banana";
        Eating (a, eat);
        eat = "orange";
        Eating (a, eat);
        eat = "bacon";
        Eating(a, eat);
        eat = "beef";
        Eating(a, eat);
    }


    static  void Eating(String a, String eat) {
        System.out.println(a + " eat " + eat + " feels good");
    }
}