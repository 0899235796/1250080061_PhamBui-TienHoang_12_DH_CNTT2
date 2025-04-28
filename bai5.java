package lab4;
import java.util.ArrayList;
import java.util.Scanner;
class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private long gia;
    public Sach() {
        this.maSach = "";
        this.tenSach = "";
        this.tacGia = "";
        this.gia = 0;
    }
    public Sach(String maSach, String tenSach, String tacGia, long gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.gia = gia;
    }
    public String getMaSach() {
        return maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public long getGia() {
        return gia;
    }
    public long getGiaSauGiam() {
        return gia;
    }
    public void nhap(Scanner scanner) {
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        tacGia = scanner.nextLine();
        System.out.print("Nhập giá: ");
        gia = Long.parseLong(scanner.nextLine());
    }
    public void xuat() {
        System.out.println("Mã sách: " + maSach + ", Tên sách: " + tenSach + ", Tác giả: " + tacGia + ", Giá: " + gia);
    }
}
class SachVanHoc extends Sach {
    private int lanXuatBan;

    public SachVanHoc() {
        super();
        this.lanXuatBan = 0;
    }
    public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }
    public int getLanXuatBan() {
        return lanXuatBan;
    }
    @Override
    public long getGiaSauGiam() {
        if (getGia() > 300000) {
            return (long) (getGia() * 0.8);
        } else {
            return getGia();
        }
    }
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập lần xuất bản: ");
        lanXuatBan = Integer.parseInt(scanner.nextLine());
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", Lần xuất bản: " + lanXuatBan);
    }
}
class SachGiaoKhoa extends Sach {
    private int lop;
    private String nhaXuatBan;
    public SachGiaoKhoa() {
        super();
        this.lop = 0;
        this.nhaXuatBan = "";
    }
    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, int lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }
    public int getLop() {
        return lop;
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    @Override
    public long getGiaSauGiam() {
        if (nhaXuatBan.equalsIgnoreCase("Giao Duc")) {
            return (long) (getGia() * 0.9);
        } else {
            return getGia();
        }
    }
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhập lớp: ");
        lop = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", Lớp: " + lop + ", Nhà xuất bản: " + nhaXuatBan);
    }
}
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        SachVanHoc vanHoc = new SachVanHoc("VH001", "Truyện Kiều", "Nguyễn Du", 400000, 5);
        SachGiaoKhoa giaoKhoa = new SachGiaoKhoa("GK001", "Toán 10", "Hoàng Xuân", 250000, 10, "Giao Duc");
        danhSachSach.add(vanHoc);
        danhSachSach.add(giaoKhoa);
        System.out.println("Nhập thông tin cho các quyển sách:");
        for (Sach sach : danhSachSach) {
            sach.nhap(scanner);
        }
        System.out.println("\nThông tin các quyển sách sau khi giảm giá:");
        for (Sach sach : danhSachSach) {
            sach.xuat();
            System.out.println("Giá sau giảm: " + sach.getGiaSauGiam());
        }
        Sach sachGiaMax = danhSachSach.get(0);
        for (Sach sach : danhSachSach) {
            if (sach.getGiaSauGiam() > sachGiaMax.getGiaSauGiam()) {
                sachGiaMax = sach;
            }
        }
        System.out.println("\nSách có giá lớn nhất sau khi giảm:");
        sachGiaMax.xuat();
        System.out.println("Giá sau giảm: " + sachGiaMax.getGiaSauGiam());

        scanner.close();
    }
}
