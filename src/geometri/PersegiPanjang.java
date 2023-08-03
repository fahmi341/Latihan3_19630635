package geometri;

public class PersegiPanjang {
    private double panjang;
    private double lebar;
    
    
    public double luas(){
        return panjang * lebar;
    }
    public double keliling(){
        return 2*(panjang+lebar);
    }
}
