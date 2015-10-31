import java.math.BigDecimal;

public class KoordinatGPS{
    public KoordinatGPS() {
        this.lintang = new BigDecimal(0.0);
        this.bujur = new BigDecimal (0.0);
    }
    
    public KoordinatGPS(double bujur, double lintang) {
        this.lintang =new BigDecimal(Double.toString(lintang));
        this.bujur =new BigDecimal(Double.toString(bujur));
    }
    
    public KoordinatGPS(String bujur, String lintang) {
        this.lintang = new BigDecimal (lintang);
        this.bujur = new BigDecimal (bujur);
    }
    
    public KoordinatGPS(BigDecimal bujur, BigDecimal lintang) {
        this.lintang = lintang ;
        this.bujur = bujur;
    }
    
    public String lintangStr() {
        return lintang.toString();
    }
    
    public BigDecimal lintang() {
        return lintang;
    }
    
    public BigDecimal bujur() {
        return bujur;
    }
    
    public String bujurStr() {
        return bujur.toString();
    }
    
    private BigDecimal lintang;
    private BigDecimal bujur;
}
