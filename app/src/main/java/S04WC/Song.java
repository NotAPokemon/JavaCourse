package S04WC;


public class Song {
    private String[] defaultVerse;
    private int lineChangeIndex;
    
    public void setSong(String defaultVerse, int lineChangeIndex){
        this.defaultVerse = defaultVerse.split("\n");
        this.lineChangeIndex = lineChangeIndex;
    }
    // Create at least 1 method called verse that takes 2 parameters
    // that can be used to print out the verses of the song The Ants Go Marching

    public void verse(String lineChanged, String number){
        String res = "";
        for (int i = 0; i < defaultVerse.length; i++){
            if (i == lineChangeIndex) {
                res += lineChanged + "\n";
            } else {
                String s = defaultVerse[i];
                s = s.replaceAll("num", number);
                res += s + "\n";
            }
        }
        System.out.println(res);
    }
    
    public static void main(String args[])
    {
        Song song = new Song();
        song.setSong("The ants go marching num by num, hurrah, hurrah\n" + //
                        "The ants go marching num by num, hurrah, hurrah\n" + //
                        "The ants go marching num by num\n" + //
                        "filler\n" + //
                        "And they all go marching down to the ground\n" + //
                        "To get out of the rain, BOOM! BOOM! BOOM! BOOM!", 3);

        song.verse("The little one stops to suck a thumb", "one");
        song.verse("The little one stops to tie a shoe", "two");
        song.verse("The little one stops to climb a tree", "three");
        // Create a Song object and call its method(s) to print out
        // the verses of The Ants Go Marching
        // There should be atleast 1 method called verse that takes 2 arguments.

    }
} 
