package BiHariDemo2;

public class DosHilosDemo2{


public static void main(String[] args) {
        SimpleHiloR hilo1=new SimpleHiloR("HiloA");
        SimpleHiloR hilo2=new SimpleHiloR("HiloB");
        Thread h1= new Thread(hilo1);
        Thread h2=new Thread(hilo2);

        h1.start();
        h2.start();
    }
}
