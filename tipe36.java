class tipe36 extends PatokInput {
	private int harga;
	private int kembalian;
	
	public void setHarga() {
		
		if (blok == 'A'){
			harga=500000;
		} else 
		if (blok == 'B'){
			harga=300000;
		}
		
	}
	
	public int getHarga(){
		return harga;
	}
	
	public void setKembalian(int bayar) {
		kembalian=bayar-harga;
	}
	
	public int getKembalian() {
		return kembalian;
	}
}