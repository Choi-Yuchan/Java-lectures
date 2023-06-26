package edu_global.two;

public class Practice {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}

}

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	ColorTV(int size, int color) {
		super(size);

		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() + " inch " + color + " color");
	}
}

class IPTV extends ColorTV {
	private String address;

	IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}

	public void printProperty() {
		System.out.print('"' + address + '"' + " 주소에 ");
		super.printProperty();
	}
}
