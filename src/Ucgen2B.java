public class Ucgen2B  extends Nokta2B{
    private Nokta2B N1;
    private Nokta2B N2;
    private Nokta2B N3;
    public Ucgen2B(Nokta2B N1, Nokta2B N2, Nokta2B N3){
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }
    public double mesafe(Nokta2B M1, Nokta2B M2){
        return super.mesafe(M1.getX(), M1.getY(), M2.getX(), M2.getY());
    }
    public boolean ucgenGecerliMi(double kenar1, double kenar2, double kenar3)throws Exception{
        if (kenar1 + kenar2 > kenar3 || kenar2 + kenar3 > kenar1 || kenar1 + kenar3 > kenar2){
            return true;
        }else{
            throw new Exception("Geçersiz üçgen");
        }
    }
}
