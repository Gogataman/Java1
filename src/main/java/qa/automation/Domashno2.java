package qa.automation;

public class Domashno2 {

    public static void main(String[] args){

        String name1 = "Georgi Kirilov Marinov";
        String name2 = "Georgi Marinov";
        String name3 = " - Gogata";

        boolean compare = name1.equalsIgnoreCase(name2);

        System.out.println("\n" + "\"" + name1 + "\" equals \"" +
                name2 + "\"? " + " - " + compare + "\n");

        String [] string1 = name1.split(" ");
        System.out.println(name1 + " has " + string1.length + " words. " + "\n");

        String nameNickname = name2 + name3;
        System.out.println("The new concatenated string is: " + nameNickname + "\n");

        String newString = name1.replaceAll("Georgi Kirilov Marinov", "Kiril Marinov");
        System.out.println("The new replaced string is: " + newString);


    }
}
