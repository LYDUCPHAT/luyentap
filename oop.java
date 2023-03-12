class Hoaqua{
    String hinhdang;
    String nguoitrong;
    int doanhthu;
    Hoaqua(String hinhdang, String nguoitrong, int doanhthu){
        this.hinhdang = hinhdang;
        this.nguoitrong = nguoitrong;
        this.doanhthu = doanhthu;
    }
}
class Quacam extends Hoaqua{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Quacam(String hinhdang, String nguoitrong, int doanhthu){
        super(hinhdang, nguoitrong, doanhthu);
    }
    Quacam(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong){
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Quatao extends Hoaqua{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Quatao(String hinhdang, String nguoitrong, int doanhthu){
        super(hinhdang, nguoitrong, doanhthu);
    }
    Quatao(String hinhdang, String nguoitrong, int doanhthu, int giaban1can, String nguongoc, int ngaynhap, int soluong){
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Camcaophong extends Hoaqua{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Camcaophong(String hinhdang, String nguoitrong, int doanhthu){
        super(hinhdang, nguoitrong, doanhthu);
    }
    Camcaophong(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong){
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class Camsanh extends Quacam{
    int giaban1can;
    String nguongoc;
    int ngaynhap;
    int soluong;
    Camsanh(String hinhdang, String nguoitrong, int doanhthu){
        super(hinhdang, nguoitrong, doanhthu);
    }
    Camsanh(String hinhdang, String nguoitrong, int doanhthu,int giaban1can, String nguongoc, int ngaynhap, int soluong){
        super(hinhdang, nguoitrong, doanhthu);
        this.giaban1can = giaban1can;
        this.nguongoc = nguongoc;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
    }
}
class oop{
    public static void main(String[]args){
        Quacam qua1 = new Quacam("Qua cam", "Ong A", 9, 7, "TP.HCM", 20, 7);
        Quatao qua2 = new Quatao("Qua tao", "Ong A", 9, 8, "Hai phong", 21, 8);
        Camcaophong qua3 = new Camcaophong("Cam cao phong", "Ong A", 9, 9, "Cam Ranh", 22, 9);
        Camsanh qua4 = new Camsanh("Cam sanh", "Ong A", 9, 10, "Phan Thiet", 23, 10);
        System.out.println("Hinh dang: "+qua1.hinhdang+","+"Nguoi trong: "+qua1.nguoitrong+","+"Doanh thu: "+qua1.doanhthu+" trieu dong"+","+"Gia ban 1 can: "+qua1.giaban1can+" ngan dong"+","+"Nguon goc: "+qua1.nguongoc+","+"Ngay nhap: "+qua1.ngaynhap+","+"So luong: "+qua1.soluong+" kg");
        System.out.println("Hinh dang: "+qua2.hinhdang+","+"Nguoi trong: "+qua2.nguoitrong+","+"Doanh thu: "+qua2.doanhthu+" trieu dong"+","+"Gia ban 1 can: "+qua2.giaban1can+" ngan dong"+","+"Nguon goc: "+qua2.nguongoc+","+"Ngay nhap: "+qua2.ngaynhap+","+"So luong: "+qua2.soluong+" kg");
        System.out.println("Hinh dang: "+qua3.hinhdang+","+"Nguoi trong: "+qua3.nguoitrong+","+"Doanh thu: "+qua3.doanhthu+" trieu dong"+","+"Gia ban 1 can: "+qua3.giaban1can+" ngan dong"+","+"Nguon goc: "+qua3.nguongoc+","+"Ngay nhap: "+qua3.ngaynhap+","+"So luong: "+qua3.soluong+" kg");
        System.out.println("Hinh dang: "+qua4.hinhdang+","+"Nguoi trong: "+qua4.nguoitrong+","+"Doanh thu: "+qua4.doanhthu+" trieu dong"+","+"Gia ban 1 can: "+qua4.giaban1can+" ngan dong"+","+"Nguon goc: "+qua4.nguongoc+","+"Ngay nhap: "+qua4.ngaynhap+","+"So luong: "+qua4.soluong+" kg");
    }
}