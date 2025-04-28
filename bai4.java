package lab4;
import java.util.Scanner;
class HangHoa {
    private String maHang;
    private String tenHang;
    private long donGia;
    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }
    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    public String getMaHang() {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public long getDonGia() {
        return donGia;
    }
}
class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congSuat;
    public HangDienMay() {
        super();
        this.thoiGianBaoHanh = 0;
        this.dienAp = 0;
        this.congSuat = 0;
    }
    public HangDienMay(String maHang, String tenHang, long donGia, int thoiGianBaoHanh, int dienAp, int congSuat) {
        super(maHang, tenHang, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public int getDienAp() {
        return dienAp;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thời gian bảo hành (tháng): ");
        thoiGianBaoHanh = scanner.nextInt();
        System.out.print("Nhập điện áp (V): ");
        dienAp = scanner.nextInt();
        System.out.print("Nhập công suất (W): ");
        congSuat = scanner.nextInt();
    }
    public void xuat() {
        System.out.println("Mã hàng: " + getMaHang());
        System.out.println("Tên hàng: " + getTenHang());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Thời gian bảo hành: " + thoiGianBaoHanh + " tháng");
        System.out.println("Điện áp: " + dienAp + "V");
        System.out.println("Công suất: " + congSuat + "W");
    }
}
class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;
    public HangThucPham() {
        super();
        this.ngaySanXuat = "";
        this.ngayHetHan = "";
    }
    public HangThucPham(String maHang, String tenHang, long donGia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public String getNgaySanXuat() {
        return ngaySanXuat;
    }
    public String getNgayHetHan() {
        return ngayHetHan;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày sản xuất (dd/MM/yyyy): ");
        ngaySanXuat = scanner.nextLine();
        System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
        ngayHetHan = scanner.nextLine();
    }
    public void xuat() {
        System.out.println("Mã hàng: " + getMaHang());
        System.out.println("Tên hàng: " + getTenHang());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Ngày sản xuất: " + ngaySanXuat);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
    }
}
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo đối tượng HangDienMay
        HangDienMay dienMay = new HangDienMay("DM001", "Tivi", 5000000, 12, 220, 100);
        System.out.println("\n==> Nhập thêm thông tin cho Hàng Điện Máy:");
        dienMay.nhap();
        System.out.println("\n==> Thông tin Hàng Điện Máy:");
        dienMay.xuat();
        HangThucPham thucPham = new HangThucPham("TP001", "Gạo", 20000, "01/03/2025", "01/09/2025");
        System.out.println("\n==> Nhập thêm thông tin cho Hàng Thực Phẩm:");
        thucPham.nhap();
        System.out.println("\n==> Thông tin Hàng Thực Phẩm:");
        thucPham.xuat();
    }
}
