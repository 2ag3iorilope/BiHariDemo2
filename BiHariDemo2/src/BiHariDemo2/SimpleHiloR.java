package BiHariDemo2;

public class SimpleHiloR implements Runnable{
private String nombre;
public SimpleHiloR(String nom)
    {
        nombre=nom;
    }
   
/**
 * Hariaren bidez gauzatutako metodoa. Kontagailu bat inprimatzen du izenarekin batera
   Hariaren* eta haria amaitu dela adierazten duen mezu baten bidez.
 */
       public void run(){
          for (int i=0; i<5;i++){
              System.out.println(i+"."+nombre);
          }
        System.out.println("El hilo "+ nombre+ " ha terminado");
    }
   
}
//Programa honek bi hari sortu eta exekutatzen ditu Runnable interfazearen inplementazioa erabiliz. 
//Hari bakoitzak bere izena eta kontagailu bat inprimatzen ditu 0tik 4ra, eta noiz amaitu den adierazten du.
//Harien ordena desberdina da exekutatzen den bakoitzean konkurrentea baita

