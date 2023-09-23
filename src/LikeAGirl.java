import java.util.Scanner;

public class LikeAGirl {
    /**
     * "Like a Girl," Super Bowl XLIX (2015) - <a href="https://www.youtube.com/watch?v=5yLXrWLvwAo">Like a Girl</a>
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // String variables, some with format specifiers
        String scriptTemplateLine1 = "What does it mean to do something, \"%s\"?";
        String scriptTemplateLine2 = "Show me what it looks like to run, \"%s.\"%n";
        String scriptTemplateLine3 = "Show me what it looks like to fight, \"%s.\"";
        String scriptTemplateLine4 =
                "How do you think it affects them when somebody uses \"%s\" as an insult? Choice (good: %d, bad: %d) ";
        String scriptTemplateLine5 = "You answered %d%n%s.";
        String ansBad = "Always wants to change that.%nEmotional Damage %f";
        String ansGood = "Good for you.%nEmotional Damage %f";
        String likeABoy = "Like a Boy";

        // integer variable
        int good = 1;
        int bad = 2;
        // 32 bit floating point variable
        float emotionalDamage = 100.0f;  // 32 Bit, but it does exist!
        // double precision floating point variable
        double dEmotionalDamage = 50.0; // Double precision
        // boolean variable
        boolean trueOrFalse;
        // Scanner variable for reading input.
        Scanner s = new Scanner(System.in);

        System.out.println(
                String.format(scriptTemplateLine1, likeABoy));

        // Example of using printf and platform specific line separator "%n" to
        // format instead of String.format
        System.out.printf(scriptTemplateLine2, likeABoy);

        System.out.println(String.format(scriptTemplateLine3, likeABoy));

        System.out.printf(scriptTemplateLine4, likeABoy, good, bad);

        int answer = Integer.parseInt(s.nextLine());

        System.out.println(
                String.format(scriptTemplateLine5, answer,
                        (answer == good) ?
                                String.format(ansGood, dEmotionalDamage) : String.format(ansBad, emotionalDamage)
                )
        );

        trueOrFalse = (answer != bad);  // if answer == 1 (i.e. good), then trueOrFalse should be False
        System.out.printf("Did you answer like a nice person? %B%n", trueOrFalse);
    }
}
//I did not know where to put my comments for section two, so they will go here. The variables we have are int,
// float, double, and boolean. For int the data type is good,bad. For float its emotional damage. For double its also
// emotional damage. For boolean its true or false. For int any integer can be assigned. For float and double its 0-100.
// For boolean its only true or false that can be assigned. Before I changed the code I had to change the word Girl to Boy
// within all the variables that's the only example I can think of .
