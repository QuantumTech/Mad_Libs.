public class MadLibs
{
    /*
    This program generates a mad libbed story.
    Date: 10/02/2021
    */
    public static void main(String[] args)
    {

        String name1 = "Harry";
        String name2 = "Don";

        String adjective1 = "Over the moon";
        String adjective2 = "Productive";
        String adjective3 = "Sticky";

        String verb1 = "sing";

        String noun1 = "robot";
        String noun2 = "chicken soup";
        String noun3 = "beat";
        String noun4 = "book";
        String noun5 = "yogut";
        String noun6 = "fungi";

        int number = 2019;

        String place1 = "New York";

        //The story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}