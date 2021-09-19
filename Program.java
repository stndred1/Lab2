/**
 * @author Edgar Mendez 211133
 * section 40
 * @ Version lagrimas
 */
public class Program{
    private static String name;
    private static int GB;
    public static int cycleTime;
    public Program(String name, int GB, int cycleTime){
        Program.name = name;
        Program.GB = GB;
        Program.cycleTime = cycleTime;
    }
    public void setName(String name){
        Program.name = name;
    }
    @Override
    public String toString(){
        String out = "";
        out = "(" + Program.getName() + "," + Program.getGB() + "," + Program.getCycleTime() + ")";
        return out;
    }
    public static String getName(){
/**
 * @return the name of the program
 */
        return name;
    }
    public void setGB(int GB){
        Program.GB = GB;
    }
    public static int getGB(){
/**
 * @return how many giga bytes the program is
 */
        return GB;
    }
    public void setCycleTime(int cycleTime){
        Program.cycleTime = cycleTime;
    }
    public static int getCycleTime(){
/**
 * @return the amount of clock cycles the program runs. 
 */
        return cycleTime;
    }
    public boolean isZero(){
        if (cycleTime == 0){
            return true;
        }
        else if (cycleTime != 0){
            return false;
        }
        return false;
    }
}