public class ChuyenBay {
    private String maChuyenBay;
    private String diemKhoiHanh;
    private String diemDen;
    private String thoiGian;
    private int soGheY, soGheB, soGheF;

    public ChuyenBay(String maChuyenBay, String diemKhoiHanh, String diemDen, String thoiGian) {
        this.maChuyenBay = maChuyenBay;
        this.diemKhoiHanh = diemKhoiHanh;
        this.diemDen = diemDen;
        this.thoiGian = thoiGian;
        this.soGheY = 100;
        this.soGheB = 50;
        this.soGheF = 20;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public double getGiaVe(char hangGhe) {
        switch (hangGhe) {
            case 'Y':
                return 1000; // Giá ghế hạng Y
            case 'B':
                return 2000; // Giá ghế hạng B
            case 'F':
                return 3000; // Giá ghế hạng F
            default:
                return 0;
        }
    }

    public boolean kiemTraGhếTrống(char hangGhe) {
        if (hangGhe == 'Y' && soGheY > 0) return true;
        if (hangGhe == 'B' && soGheB > 0) return true;
        if (hangGhe == 'F' && soGheF > 0) return true;
        return false;
    }
}
