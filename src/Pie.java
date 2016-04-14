/**
 * Describes instances of Pie
 */

public class Pie {

    /**
     * Denotes the flavor of our pie
     */

    public String flavor = "";

    /**
     * Denotes the size of our pie
     */

    public int size = 0;

    /**
     * Tells us whether or not the name of the pie also refers to a song name
     */

    public boolean songName = true;

    /**
     * Sets default parameters for Pie
     * @param flavor Flavor of pie
     * @param size Size of pie (in inches)
     * @param songName Whether or not the pie shares its' name with a song
     */

        public Pie(String flavor, int size, boolean songName){

            this.flavor = flavor;
            this.size = size;
            this.songName = songName;

        }

    /**
     *
     * @return Returns description of your pie
     */

    public String toString(){
            return "Your pie is a " + size + " inch " + flavor + " pie. ";
        //    if (songName == true) {
        //        return "Hey, this is the name of a song!";
            }

        }



