import javax.jws.soap.SOAPMessageHandlers;

public class Vehicles {

    public static int liczbadrzwi;

    public String kolor;
    public int liczbakol;
    public double predkoscmax;
    public String marka;

    public Vehicles(String k, int l, double p, String m){
        kolor = k;
        liczbakol = l;
        predkoscmax = p;
        marka = m;

    }

    public static double generateVehiclesId (){
        return Math.random() * 1000 + 1;
    }

    public String getKolor(){
        return kolor;
    }
    public void getOpisKompletny(){
        System.out.println("Samochód w kolorze: " + kolor + ", z liczbą kól: " + liczbakol + ", ma prędkość maksymalną: " + predkoscmax);
    }
    public void getMarka(){
        System.out.println("Marka to: " + marka);
    }
}
