public class SV {
        private String maSV;
	private String hoTen;
	private int namSinh;
	private boolean gioiTinh;
	
	public SV(){
            
            
		}
	public SV(String maSV, String hoTen, int namSinh ,boolean gioiTinh){
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
        
    
	
    public String toString(){
		return maSV+" "+hoTen+" "+namSinh+" "+ ((gioiTinh == true)?" Nam ": " Nu ");
    }

     public static void main(String []agrs){
        SV a = new SV("001","Nguyen Van A",2000,true);
        System.out.print(a);
    }
}
