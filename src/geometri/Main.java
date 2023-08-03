package geometri;

class main {
    public void main(String[] agts){
        Lingkaran lingkaran1 = new Lingkaran();
        PersegiPanjang pp1 = new PersegiPanjang();
        
        lingkaran1.radius = 10.0;
        pp1.lebar = 15.0;
        pp1.panjang = 10.0;
        
        System.out.println("Hasil Luas Lingkaran = " + lingkaran1.luas());
        System.out.println("Hasil Keliling Lingkaran = " + lingkaran1.keliling());
        
        System.out.println("Hasil Luas Persegi Panjang = " + pp1.luas());
        System.out.println("Hasil Luas Persegi Keliling = " + pp1.keliling());
        
    }
}
