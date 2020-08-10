package tdc.edu.vn.qlsv.Model;

public class PhongHoc {
    private String maPhong;
    private String loaiPhong;
    private int tang;
    private String phai;
    private int ngaysinh;
    private String lop;

    public PhongHoc(String maphong, String loaiphong, int tang) {
        this.phai = phai;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.tang = tang;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }




    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    @Override
    public String toString() {
        return "PhongHoc{" +
                "maPhong='" + maPhong + '\'' +
                ", loaiPhong='" + loaiPhong + '\'' +
                ", tang=" + tang +
                ", phai='" + phai + '\'' +
                ", ngaysinh=" + ngaysinh +
                ", lop='" + lop + '\'' +
                '}';
    }
}

