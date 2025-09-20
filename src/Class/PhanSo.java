package Class;

import java.util.Scanner;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public void nhapPS(Scanner sc) {
		int a;
		int b;

		do {
			System.out.print("\tNhap vao tu so: ");
			a = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b = sc.nextInt();

			if (b == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo = a;
				mauSo = b;
			}
		} while (b == 0);
	}

	public void hienThiPS() {
		if (tuSo * mauSo < 0) {
			System.out.println("\t-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		} else {
			System.out.println("\t" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
	}

	public PhanSo congPS(PhanSo ps2) {
		int a = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
		int b = mauSo * ps2.mauSo;

		return new PhanSo(a, b);
	}

	public PhanSo truPS(PhanSo ps2) {
		int a = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
		int b = mauSo * ps2.mauSo;

		return new PhanSo(a, b);
	}

	public PhanSo nhanPS(PhanSo ps2) {
		int a = tuSo * ps2.tuSo;
		int b = mauSo * ps2.mauSo;

		return new PhanSo(a, b);
	}

	public PhanSo chiaPS(PhanSo ps2) {
		int a = tuSo * ps2.mauSo;
		int b = mauSo * ps2.tuSo;

		return new PhanSo(a, b);
	}

	private int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo, mauSo) == 1) {
			return true;
		}
		return false;
	}

	public void toiGianPS() {
		int x = timUSCLN(tuSo, mauSo);

		tuSo /= x;
		mauSo /= x;
	}
}
