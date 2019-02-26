package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
        Persoa per = new Persoa();
        Canario ca = new Canario();
        Galo gal = new Galo();
        per.cantar();
        ca.cantar();
        gal.cantar();
        IPodeCantar obx = new Persoa();
        System.out.println("****************");
        obx.cantar();
        Tenor obx1 = new Tenor();
        obx1.cantar();
    }
    
}

    
    

