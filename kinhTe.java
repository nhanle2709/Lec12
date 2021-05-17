public class kinhTe extends SV{
    private double nlkt, mkt;
    public kinhTe(){
        super();
        nlkt =mkt = 0;
    }

    public kinhTe( String maSV, String hoTen, int namSinh, boolean gioiTinh,double nlkt, double mkt) {
        super(maSV, hoTen, namSinh, gioiTinh);
        this.nlkt = nlkt;
        this.mkt = mkt;
    }

    public double getNlkt() {
        return nlkt;
    }

    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }

    public double getMkt() {
        return mkt;
    }

    public void setMkt(double mkt) {
        this.mkt = mkt;
    }
     public double getDiemTB(){
        return (nlkt*2 + mkt)/3;
    }
    public String getHocLuc(){
        if(getDiemTB()<3.5) return "kem";
        if(getDiemTB()<5) return "yeu";
        if(getDiemTB()<6.5) return "trung binh";
        if(getDiemTB()<8) return "kha";
        if(getDiemTB()<9) return "gioi";
        return "xuatsac";
    }
    public String toString(){
        return super.toString()+" "+ getDiemTB()+" "+getHocLuc();
    }
    public static void main(String []agrs){
        kinhTe a = new kinhTe("001","Nguyen Van A",2000,true,9,10);
        System.out.print(a);
    }
}
