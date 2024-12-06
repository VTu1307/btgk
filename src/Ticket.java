public class Ticket {
    private String maVe;
    private ChuyenBay chuyenBay;
    private char hangGhe;
    private boolean daSuDung;

    public Ticket(String maVe, ChuyenBay chuyenBay, char hangGhe) {
        this.maVe = maVe;
        this.chuyenBay = chuyenBay;
        this.hangGhe = hangGhe;
        this.daSuDung = false;
    }

    public String getMaVe() {
        return maVe;
    }

    public ChuyenBay getChuyenBay() {
        return chuyenBay;
    }

    public char getHangGhe() {
        return hangGhe;
    }

    public boolean isDaSuDung() {
        return daSuDung;
    }

    public void setDaSuDung(boolean daSuDung) {
        this.daSuDung = daSuDung;
    }
}
