import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HanhKhach[] danhSachHanhKhach = new HanhKhach[20];
        ChuyenBay[] danhSachChuyenBay = new ChuyenBay[5];
        QuanLyDatVe quanLyDatVe = new QuanLyDatVe(danhSachHanhKhach, danhSachChuyenBay);

        // Khởi tạo dữ liệu mẫu cho hành khách và chuyến bay
        danhSachChuyenBay[0] = new ChuyenBay("CB001", "Hà Nội", "Sài Gòn", "2024-12-25 10:00");
        danhSachChuyenBay[1] = new ChuyenBay("CB002", "Hà Nội", "Đà Nẵng", "2024-12-25 14:00");

        danhSachHanhKhach[0] = new HanhKhach("HK001", "Nguyễn Văn A");
        danhSachHanhKhach[1] = new HanhKhach("HK002", "Trần Thị B");

        while (true) {
            System.out.println("\n===== Chương Trình Quản Lý Đặt Vé Máy Bay =====");
            System.out.println("1. Đặt vé");
            System.out.println("2. Hủy vé");
            System.out.println("3. Đổi vé");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("Nhập mã hành khách: ");
                    String maHanhKhach = scanner.next();
                    System.out.print("Nhập mã chuyến bay: ");
                    String maChuyenBay = scanner.next();
                    System.out.print("Nhập hạng ghế (Y/B/F): ");
                    char hangGhe = scanner.next().charAt(0);
                    quanLyDatVe.thucHienDatVe(maHanhKhach, maChuyenBay, hangGhe);
                    break;

                case 2:
                    System.out.print("Nhập mã hành khách: ");
                    maHanhKhach = scanner.next();
                    System.out.print("Nhập mã vé cần hủy: ");
                    String maVe = scanner.next();
                    quanLyDatVe.thucHienHuyVe(maHanhKhach, maVe);
                    break;

                case 3:
                    System.out.print("Nhập mã hành khách: ");
                    maHanhKhach = scanner.next();
                    System.out.print("Nhập mã vé cũ: ");
                    String maVeCu = scanner.next();
                    System.out.print("Nhập mã chuyến bay mới: ");
                    String maChuyenBayMoi = scanner.next();
                    quanLyDatVe.thucHienDoiVe(maHanhKhach, maVeCu, maChuyenBayMoi);
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
