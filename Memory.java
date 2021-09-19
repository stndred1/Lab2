/**
 * @author Edgar Mendez 211133
 * section 40
 * @ Version lagrimas
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
public class Memory {
    Scanner s = new Scanner(System.in);
    private int opt;
    private int GB;
    private String type;
    private int blocks;
    private Program P;
    private int sdr;
    int ram;
    Program[] SDR = new Program[256];
    Program[] DDR = new Program[blocks];
    public ArrayList<Program> Programs = new ArrayList<Program>();
    public Memory() { 
        type = "type";
        GB = 0;
        blocks = GB * 1024/64;
	}
    //public void SDR(){
        //if (ram == 0){
         //   Program[] SDR = new Program[256];
       //     type = "SDR";
       //     GB = 16;
       //     blocks = GB * 1024/64;
      //  }
    //}
    public void DDR(){
            Program[] DDR = new Program[blocks];
            type = "DDR";
            GB = 4;
            blocks = GB * 1024/64;
            int i = 0;
            for(i = 0; i < DDR.length; i++){
                if (DDR[i] != null){
                    type = "DDR";
                    GB = 4;
                    blocks = GB * 1024/64;
                    Program[] DDR1 = new Program[blocks];
                        if (DDR1[i] != null){
                            type = "DDR";
                            GB = 8;
                            blocks = GB * 1024/64;
                            Program[] DDR2 = new Program[blocks];
                            if (DDR2[i] == null){
                            DDR2[blocks] = null;
                            }
                        }
                        else if (DDR1[i] == null){
                            DDR1[blocks] = null;
                        }
                }               
            }
        }
    //private Program program(String name, int GB, int cycleTime){
				//return new Program(name, GB, cycleTime);
	//}
    public void addSDR(){
/**
 * @ exception if an incorrect input(String) is received, a message is shown to input a number. 
 */
         try{
            if (sdr != 10);
            sdr = s.nextInt();
                if (sdr == 1){
                    for(int i = 0; i < SDR.length; i++){
                            if(SDR[i] == null ){
                                    P =  new Program("Chrome", 2070, 8);
                                    blocks = 2070/1000*1024/64;
                                    SDR[i] = P;
                                    break;
                            }
                            else if (SDR[i] != null){
                                Programs.add(P);
                                break;
                            }
                }
                if (sdr == 2){
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            P = new Program("Firefox", 64, 16);
                            blocks = 64/1000*1024/64;
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){
                            P = new Program("Firefox", 64/1000, 16);
                            blocks = 64/1000*1024/64;
                            Programs.add(P);
                            break;
                        }
                    } 
                }
                if (sdr == 3){
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            P = new Program("Zoom", 360/1000, 60);
                            SDR[i] = P;
                            break;
                        }

                        else if (SDR[i] != null){
                            P = new Program("Zoom", 360/1000, 60);
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr == 4){
                    P = new Program("WhatsApp", 128/1000, 8);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr == 5){
                    P = new Program("Telegram", 128/1000, 8);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr == 6){
                    P = new Program("Visual Studio", 320/1000, 600);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr == 7){
                    P = new Program("Mail", 32/1000, 15);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr ==8){
                    P = new Program("Contactos", 32/1000, 8);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;                       
                            break;
                        }
                        else if (SDR[i] != null){
                            Programs.add(P);
                            break;
                        }
                    }
                }
                if (sdr == 9){
                    P = new Program("Word", 1024/1000, 10);
                    for(int i = 0; i < SDR.length; i++){
                        if(SDR[i] == null){
                            SDR[i] = P;
                            break;
                        }
                        else if (SDR[i] != null){

                            Programs.add(P);
                            break;
                        }
                    }
                }
            }
        }    
        catch (Exception e){
            System.out.println("Elige un numero por favor\n");
        }
    }		
        public void addDDR(){            
            opt = s.nextInt();
            while (opt != 10);
            try{
/**
 * @ exception if an incorrect input(String) is received, a message is shown to input a number. 
 */
            Program[] DDR = new Program[blocks];            
            if (opt == 1){
                P = new Program("Chrome", 2070/1000, 8);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                    
                }
            }

            if (opt == 2){
                P = new Program("Firefox", 64/1000, 16);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                } 
             }
             if (opt ==3){
                P = new Program("Zoom", 360/1000, 60);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt == 4){
                P = new Program("WhatsApp", 128/1000, 8);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt == 5){
                P = new Program("Telegram", 128/1000, 8);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt== 6){
                P = new Program("Visual Studio", 320/1000, 600);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt == 7){
                P = new Program("Mail", 32/1000, 15);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt ==8){
                P = new Program("Contactos", 32/1000, 8);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
            if (opt == 9){
                P = new Program("Word", 1024/1000, 10);
                for(int i = 0; i < DDR.length; i++){
                    if(DDR[i] == null){
                        DDR[i] = P;
                        break;
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("Por favor elige un numero\n");
        }
        }      
        public void time(){
            for(int i = 0; i < SDR.length; i++){
                if (Program.cycleTime >= 1){
                    int cycleTime = Program.cycleTime - 1;
            }
             }
            for (int i = 0; i < SDR.length; i++){ 
                if (Program.cycleTime == 0){   
                    SDR[i] =  null;
                }
            }
            for (int i = 0; i < SDR.length; i++){
                    DDR[i] =  null;
                }
            }
}
