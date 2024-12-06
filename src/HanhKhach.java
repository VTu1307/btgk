import java.util.ArrayList;

public class HanhKhach {
    private String id;
    private String ten;
    private ArrayList<Ticket> veDaDat;
    public static final int soVeToiDa = 5;

    public HanhKhach(String id, String ten) {
        this.id = id;
        this.ten = ten;
        this.veDaDat = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public Ticket datVe(ChuyenBay chuyenBay, char hangGhe) {
        if (veDaDat.size() < soVeToiDa) {
            Ticket veMoi = new Ticket(id + "_" + veDaDat.size(), chuyenBay, hangGhe);
            veDaDat.add(veMoi);
            return veMoi;
        } else {
            return null; // Không thể đặt thêm vé
        }
    }

    public int demSoVeDaDat() {
        return veDaDat.size();
    }

    public double huyVe(String maVe) {
        for (Ticket ve : veDaDat) {
            if (ve.getMaVe().equals(maVe) && !ve.isDaSuDung()) {
                ve.setDaSuDung(true);
                return ve.getChuyenBay().getGiaVe(ve.getHangGhe()) * 0.8; // Hoàn lại 80% giá vé
            }
        }
        return 0; // Không tìm thấy vé
    }

    public double doiVe(String maVeCu, String maChuyenBayMoi) {
        for (Ticket ve : veDaDat) {
            if (ve.getMaVe().equals(maVeCu) && !ve.isDaSuDung()) {
                ve.setDaSuDung(true);
                // Giả sử phí đổi vé là 20%
                return ve.getChuyenBay().getGiaVe(ve.getHangGhe()) * 0.2;
            }
        }
        return 0; // Không thể đổi vé
    }
}
