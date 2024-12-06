public interface IHanhKhach {
    // Đặt vé với mã chuyến bay và hạng ghế chỉ định
    // Return: true nếu đặt thành công, false nếu thất bại
    boolean datVe(String maChuyenBay, char hangGhe);

    // Hủy vé với mã vé chỉ định
    // Return: số tiền được hoàn lại
    double huyVe(String maVe);

    // Đổi vé từ mã vé cũ sang chuyến bay mới
    // Return: phí đổi vé cần thanh toán thêm
    double doiVe(String maVeCu, String maChuyenBayMoi);

    // Kiểm tra trạng thái vé
    // Return: trạng thái hiện tại của vé (B-Booked, C-Cancelled)
    char kiemTraTrangThaiVe(String maVe);

    // Tích lũy dặm bay sau khi hoàn thành chuyến bay
    void tichLuyDamBay(double khoangCach, char hangGhe);
}
