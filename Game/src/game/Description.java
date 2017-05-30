
package game;


public class Description {
   private String des1;
   private String des2;
   private String des3;
   private String des4;
   private String desCR;
   //room descriptions
   public Description(){
       desCR = "Control Room \n" +
               "You look around to see a mostly empty room with only \n" +
                "a computer console with four monitors that show \n" +
                "separate locations. On one of the screens you see a \n" +
                "sticky note that reads, \n" +
                "Find 4 keys \n" +
                "/key located in each room in safes \n" +
                " use rooms to find 4 pin password \n" +
                " ESCAPE \n" +
                " After reading the note, you notice four locks in the \n" +
                " middle of the console with a number corresponding to \n" +
                " a different lock. \n" +
                " - You think it is the best to explore these rooms. ";
       des1 = "Room 1 – Storage\n" +
                "You look around the room to see four creates in each\n" +
                " corner with a safe at the end of the room.\n" +
                "You start to examine the crates to see they are labeled\n" +
                "1 - Equipment \n" +
                "2 - Power sources \n" +
                "3 – Materials \n" +
                "4 – Food \n" +
                "You look at the safe to see another note. It reads,\n" +
                "1 – Drillers \n" +
                "2 – Batteries \n" +
                "2 - Hammers \n" +
                "1 – Boxes of Assorted Construction Supplies\n" +
                "2 -  Boxes of Rations\n" +
                "1 - Crowbars  \n" +
                "- You wonder if this has anything to do with the code.";
       des2 = "Room 2 – Hydroponics\n" +
                "You look around the room to see racks of four rows \n" +
                "of plants around the room with the same pattern of\n" +
                "eight on the top row, seven on the second and third \n" +
                "rows, and nine on the bottom. \n" +
                "There is also a safe in the middle of the room. \n" +
                "There is another note on the safe. This one reads,  \n" +
                "\"Reminder to get more plants.\"";
       des3 = "Room 3 – Laboratory\n" +
                "You look around the room to see four research stations\n" +
                " with uncompleted projects. On one of the stations you\n" +
                " see a safe on top of it. Next to it you see a container\n" +
                " of iron on the left of the safe and a container of gold of\n" +
                " the right. You also see another note on the safe, this\n" +
                " one reads, \n" +
                "Experiment 12244A: Iron-Gold Alloy \n" +
                "– Previous attempts at creating the alloy have ended \n" +
                "in failure. Most of the scientist here are still wondering\n" +
                " why we are trying this but the head scientists want it\n" +
                "made. I wonder if they even know the atomic number\n" +
                " of these elements sometimes. \n" +
                "- You wonder if this has anything to do with the code.";
       des4 = "Room 4 – Fabrication\n" +
                " You look around the room to see four workstations with\n" +
                " unfinished creations in various stages of completion.\n" +
                " On each table, you see machines that resemble a\n" +
                " form of animal. You spot a safe in the corner of the\n" +
                " room with another note on it. It reads, \n" +
                "\n" +
                "PROTOTYPE #1 INSECTROID – \n" +
                "The idea of making a worker droid came from the ant\n" +
                " for their construction capabilities. \n" +
                "- WORK IN PROGRESS. \n" +
                "\n" +
                "PROTOTYPE #2 ARACHDROID – \n" +
                "Security droid designed after the spider due to their\n" +
                " mobility. \n" +
                "CANCELED – due to majority of crew suffers \n" +
                "from arachnophobia. \n" +
                "\n" +
                "PROTOTYPE #3-12 CANINBOT -  \n" +
                "New idea for security model after #2 was canceled. \n" +
                "Resembles a German Shepard due to their \n" +
                "involvement in police forces. \n" +
                "CANCELED – due to crew stealing and \n" +
                "reprogramming prototypes #3-1 - #3-11 as \n" +
                "companion bots.\n" +
                "\n" +
                "PROTOTYPE #4 ANDROID – \n" +
                "can be used as labor and security without the \n" +
                "problems with previous projects. \n" +
                " - WORK IN PROCESS\n" +
                "\n" +
                "- You wonder if this has anything to do with the code.         \n" +
                "\n" +
                "";
       
   }
   // calls the discriptions
   public String getR1 (){
       return des1;
   }
   
   public String getR2(){
       return des2;
   }
   
   public String getR3(){
       return des3;
   }
   
   public String getR4(){
       return des4;
   }
   
   public String getCR(){
       return desCR;
   }
   
    
}
