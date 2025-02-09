package Task1.OneMethod;

public class AboutMe {
    String name = "Ainura";

    String surname = "Nusubalieva";
    int age = 20;
    String hobby = "skiing";

    public void info(){
        System.out.println(name + " " + surname + " " + age + " " + hobby);
    }
    public static void main(String[] args) {
        AboutMe aboutMe = new AboutMe();
        aboutMe.info();
    }
}
