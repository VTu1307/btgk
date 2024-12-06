public class QuanLyDatVe {
    private HanhKhach[] danhSachHanhKhach;
    private ChuyenBay[] danhSachChuyenBay;

    public QuanLyDatVe(HanhKhach[] danhSachHanhKhach, ChuyenBay[] danhSachChuyenBay) {
        this.danhSachHanhKhach = danhSachHanhKhach;
        this.danhSachChuyenBay = danhSachChuyenBay;
    }

    // Tìm hành khách theo mã
    public HanhKhach timHanhKhach(String maHanhKhach) {
        for (HanhKhach hk : danhSachHanhKhach) {
            if (hk != null && hk.getId().equals(maHanhKhach)) {
                return hk;
            }
        }
        return null;
    }

    // Tìm chuyến bay theo mã
    public ChuyenBay timChuyenBay(String maChuyenBay) {
        for (ChuyenBay cb : danhSachChuyenBay) {
            if (cb != null && cb.getMaChuyenBay().equals(maChuyenBay)) {
                return cb;
            }
        }
        return null;
    }

    // Thực hiện đặt vé
    public boolean thucHienDatVe(String maHanhKhach, String maChuyenBay, char hangGhe) {
        HanhKhach hk = timHanhKhach(maHanhKhach);
        if (hk == null) {
            System.out.println("Không tìm thấy hành khách!");
            return false;
        }

        ChuyenBay cb = timChuyenBay(maChuyenBay);
        if (cb == null) {
            System.out.println("Không tìm thấy chuyến bay!");
            return false;
        }

        // Kiểm tra ghế trống
        if (!cb.kiemTraGhếTrống(hangGhe)) {
            System.out.println("Không còn ghế trống cho hạng ghế này!");
            return false;
        }

        // Tiến hành đặt vé
        Ticket veMoi = hk.datVe(cb, hangGhe);
        if (veMoi != null) {
            System.out.println("Đặt vé thành công!");
            return true;
        } else {
            System.out.println("Đặt vé không thành công.");
            return false;
        }
    }

    // Thực hiện hủy vé
    public boolean thucHienHuyVe(String maHanhKhach, String maVe) {
        HanhKhach hk = timHanhKhach(maHanhKhach);
        if (hk == null) {
            System.out.println("Không tìm thấy hành khách!");
            return false;
        }

        double tienHoan = hk.huyVe(maVe);
        if (tienHoan > 0) {
            System.out.println("Hủy vé thành công. Số tiền hoàn lại: " + tienHoan);
            return true;
        }
        return false;
    }

    // Thực hiện đổi vé
    public boolean thucHienDoiVe(String maHanhKhach, String maVeCu, String maChuyenBayMoi) {
        HanhKhach hk = timHanhKhach(maHanhKhach);
        if (hk == null) {
            System.out.println("Không tìm thấy hành khách!");
            return false;
        }

        double phiDoiVe = hk.doiVe(maVeCu, maChuyenBayMoi);
        if (phiDoiVe > 0) {
            System.out.println("Đổi vé thành công. Phí đổi vé: " + phiDoiVe);
            return true;
        }
        return false;
    }
}
