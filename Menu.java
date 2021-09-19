/**
 * @author Edgar Mendez 211133
 * section 40
 * @ Version lagrimas
 */
import java.util.Arrays;
import java.util.Scanner;

public class Menu{

    Memory mem = new Memory();
    private int opt; 
    Scanner s = new Scanner(System.in);
    public Menu(){
        opt = 0;
    }
    public void menu(){
/**
 * @ exception if an incorrect input(String) is received, a message is shown to input a number. 
 */
        try{
        System.out.println("Que tipo de RAM deseas? \n");
        System.out.println("1. SDR \n");
        System.out.println("2. DDR \n");
            opt = s.nextInt();
            if (opt == 1){
                //mem.SDR();
                System.out.println("Que programa deseas agregar? \n"); 
                        System.out.println("1. Google Chrome \n"); 
                        System.out.println("2. Firefox \n"); 
                        System.out.println("3. Zoom \n");
                        System.out.println("4. WhatsApp \n");
                        System.out.println("5. Telegram \n");
                        System.out.println("6. Visual Studio \n");
                        System.out.println("7. Mail \n");
                        System.out.println("8. Contactos \n");
                        System.out.println("9. Word \n");
                        System.out.println("10. Terminar \n");
                mem.addSDR();
                while (opt != 11){
                    System.out.println("Bienvenido, Que deseas hacer? \n");
                    System.out.println("1.Iniciar de nuevo \n");
                    System.out.println("2. Ingresar programas que usara la RAM \n");
                    System.out.println("3. Ver RAM total \n");
                    System.out.println("4. Ver RAM disponible \n");
                    System.out.println("5. Ver RAM en uso \n");
                    System.out.println("6. Ver programas en ejecucion \n");
                    System.out.println("7. Ver programas en cola \n");
                    System.out.println("8. Ver los bloques que ocupa un programa \n");
                    System.out.println("9. Ver el estado de memoria \n");
                    System.out.println("10. Correr un ciclo de reloj \n");
                    System.out.println("11. Cerrar el programa \n");            
                    opt = s.nextInt();            
                    if (opt == 1){
                        menu();
                    }            
                    if (opt == 2){
                        System.out.println("Que programas deseas agregar? \n");
                        System.out.println("1. Google Chrome \n"); 
                        System.out.println("2. Firefox \n"); 
                        System.out.println("3. Zoom \n");
                        System.out.println("4. WhatsApp \n");
                        System.out.println("5. Telegram \n");
                        System.out.println("6. Visual Studio \n");
                        System.out.println("7. Mail \n");
                        System.out.println("8. Contactos \n");
                        System.out.println("9. Word \n");
                        System.out.println("10. Terminar \n");
                        mem.addSDR();             
                    }
                    if (opt == 3){
                        System.out.println(Arrays.toString(mem.SDR));
                        System.out.println(Arrays.deepToString(mem.Programs.toArray()));       
                    }
            
                    if (opt == 4){
                        System.out.println(Arrays.toString(mem.SDR));            
                    }            
                    if (opt == 5){
                        System.out.println(Arrays.toString(mem.SDR));                               
                    }            
                    if (opt == 6){
                        System.out.println(Arrays.toString(mem.SDR));                                
                    }       
                    if (opt == 7){            
                        System.out.println(Arrays.deepToString(mem.Programs.toArray()));            
                    }                    
                    if (opt == 8){            
                        System.out.println(Arrays.toString(mem.SDR));            
                    }            
                    if (opt == 9){            
                        System.out.println(Arrays.toString(mem.SDR));
                        System.out.println(Arrays.deepToString(mem.Programs.toArray()));
                    }
            
                    if (opt == 10){                                  
                        mem.time();
                    }            
                    if (opt == 11){            
                        System.out.println("Gracias por su tiempo! Nos vemos pronto! \n");
                        System.exit(2);                        
                    }        
                }
            }
         }
         catch (Exception e ){
            System.out.println("Por favor elige un numero\n");
         }
            if (opt == 2){                    
                    try{
                    mem.DDR();
                    System.out.println("Que programa deseas agregar? \n"); 
                        System.out.println("1. Google Chrome \n"); 
                        System.out.println("2. Firefox \n"); 
                        System.out.println("3. Zoom \n");
                        System.out.println("4. WhatsApp \n");
                        System.out.println("5. Telegram \n");
                        System.out.println("6. Visual Studio \n");
                        System.out.println("7. Mail \n");
                        System.out.println("8. Contactos \n");
                        System.out.println("9. Word \n");
                        System.out.println("10. Terminar \n");
                    mem.addDDR();
                    while (opt != 12){
                    System.out.println("Bienvenido, Que deseas hacer? \n");
                    System.out.println("1.Iniciar de nuevo \n");
                    System.out.println("2. Ingresar programas que usara la RAM \n");
                    System.out.println("3. Ver RAM total \n");
                    System.out.println("4. Ver RAM disponible \n");
                    System.out.println("5. Ver RAM en uso \n");
                    System.out.println("6. Ver programas en ejecucion \n");
                    System.out.println("7. Ver programas en cola \n");
                    System.out.println("8. Ver los bloques que ocupa un programa \n");
                    System.out.println("9. Ver el estado de memoria \n");
                    System.out.println("10. Correr un ciclo de reloj \n");
                    System.out.println("11. Cerrar el programa \n");            
                    opt = s.nextInt();            
                    if (opt == 1){            
                        menu();
                    }            
                    if (opt == 2){
                        System.out.println("Que programa deseas agregar? \n"); 
                        System.out.println("1. Google Chrome \n"); 
                        System.out.println("2. Firefox \n"); 
                        System.out.println("3. Zoom \n");
                        System.out.println("4. WhatsApp \n");
                        System.out.println("5. Telegram \n");
                        System.out.println("6. Visual Studio \n");
                        System.out.println("7. Mail \n");
                        System.out.println("8. Contactos \n");
                        System.out.println("9. Word \n");
                        System.out.println("10. Terminar \n");
                        mem.addDDR();            
                    }            
                    if (opt == 3){     
                        System.out.println(Arrays.toString(mem.DDR)); 
                    }          
                    if (opt == 4){
                        System.out.println(Arrays.toString(mem.DDR)); 
                    }
            
                    if (opt == 5){
                        System.out.println(Arrays.toString(mem.DDR)); 
                    }
            
                    if (opt == 6){
                        System.out.println(Arrays.toString(mem.DDR));                       
                    }
            
                    if (opt == 7){
                        System.out.println(Arrays.toString(mem.DDR));
                    }
                    
                    if (opt == 8){
                        System.out.println(Arrays.toString(mem.DDR));
                    }
            
                    if (opt == 9){
                        System.out.println(Arrays.toString(mem.DDR));
                        System.out.println(Arrays.toString(mem.DDR));
                    }
            
                    if (opt == 10){
                        mem.time();
                    }          
                    if (opt == 11){
            
                        System.out.println("Gracias por su tiempo! Nos vemos pronto! \n");
                        System.exit(2);                     
                    }         
                     }
            }
            catch (Exception e){
                System.out.println("Por favor elige un numero\n");
            }
        }
    }
}