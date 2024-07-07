public class UcgenTest {
    public static void main(String[] args) {
        Nokta2B N1= new Nokta2B(1,2);
        Nokta2B N2 = new Nokta2B(2,3);
        Nokta2B N3 = new Nokta2B(3,4);
        Nokta2B N4 = new Nokta2B(0,0);
        Nokta2B N5 = new Nokta2B(0,0);
        Nokta2B N6= new Nokta2B(1,1);

        Ucgen2B ucgen2B_1 = new Ucgen2B(N1, N2, N3);
        Ucgen2B ucgen2B_2 = new Ucgen2B(N4, N5, N6);

        double kenar1 = ucgen2B_1.mesafe(N1, N2);
        double kenar2 = ucgen2B_1.mesafe(N2, N3);
        double kenar3 = ucgen2B_1.mesafe(N3, N1);

        try {
            System.out.println(ucgen2B_1.ucgenGecerliMi(kenar1, kenar2, kenar3));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double kenar1_nokta =  N1.mesafe(N1.getX(),N1.getY(),N3.getX(),N3.getY());
        System.out.println(kenar1_nokta);


    }
}
