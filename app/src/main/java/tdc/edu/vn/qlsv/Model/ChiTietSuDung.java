package tdc.edu.vn.qlsv.Model;

public class ChiTietSuDung {
    private String maPhong;
    private String maTB;
    private int soLuong;

    public ChiTietSuDung(String maPhong, String maTB,  int soLuong) {
        this.maPhong = maPhong;
        this.maTB = maTB;
        this.soLuong = soLuong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }



    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietSuDung{" +
                "maPhong='" + maPhong + '\'' +
                ", maTB='" + maTB + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }
}
