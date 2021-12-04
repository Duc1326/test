package com.example.ducluu.petshop.model;

public class thucung {
    public String tenthu;
    public int gia;
    public int soluongcon;
    public String mota;
    public int Hinh;

    public thucung(String tenthu, int gia, int soluongcon, String mota, int hinh) {
        this.tenthu = tenthu;
        this.gia = gia;
        this.soluongcon = soluongcon;
        this.mota = mota;
        Hinh = hinh;
    }

    public String getTenthu() {
        return tenthu;
    }

    public void setTenthu(String tenthu) {
        this.tenthu = tenthu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluongcon() {
        return soluongcon;
    }

    public void setSoluongcon(int soluongcon) {
        this.soluongcon = soluongcon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}