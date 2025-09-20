package Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo123;
    private int mauSo123;

    public PhanSo() {
        tuSo123 = 0;
        mauSo123 = 1;
    }

    public PhanSo(int tuSo123, int mauSo123) {
        this.tuSo123 = tuSo123;
        this.mauSo123 = mauSo123;
    }
    public void nhapPS(Scanner sc) {
        int a123;
        int b123;

        do {
            System.out.print("\tNhap vao tu so: ");
            a123 = sc.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b123 = sc.nextInt();

            if (b123 == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                tuSo123 = a123;
                mauSo123 = b123;
            }
        } while (b123 == 0);
    }

    public void hienThiPS() {
        if (tuSo123 * mauSo123 < 0) {
            System.out.println("\t-" + Math.abs(tuSo123) + "/" + Math.abs(mauSo123));
        } else {
            System.out.println("\t" + Math.abs(tuSo123) + "/" + Math.abs(mauSo123));
        }
    }

    public PhanSo congPS(PhanSo ps2) {
        int a123 = tuSo123 * ps2.mauSo123 + ps2.tuSo123 * mauSo123;
        int b123 = mauSo123 * ps2.mauSo123;

        return new PhanSo(a123, b123);
    }

    public PhanSo truPS(PhanSo ps2) {
        int a123 = tuSo123 * ps2.mauSo123 - ps2.tuSo123 * mauSo123;
        int b123 = mauSo123 * ps2.mauSo123;

        return new PhanSo(a123, b123);
    }

    public PhanSo nhanPS(PhanSo ps2) {
        int a123 = tuSo123 * ps2.tuSo123;
        int b123 = mauSo123 * ps2.mauSo123;

        return new PhanSo(a123, b123);
    }

    public PhanSo chiaPS(PhanSo ps2) {
        int a123 = tuSo123 * ps2.mauSo123;
        int b123 = mauSo123 * ps2.tuSo123;

        return new PhanSo(a123, b123);
    }

    private int timUSCLN(int a123, int b123) {
        int r123 = a123 % b123;

        while (r123 != 0) {
            a123 = b123;
            b123 = r123;
            r123 = a123 % b123;
        }
        return b123;
    }

    public boolean kiemTraToiGian() {
        if (timUSCLN(tuSo123, mauSo123) == 1) {
            return true;
        }
        return false;
    }

    public void toiGianPS() {
        int x123 = timUSCLN(tuSo123, mauSo123);

        tuSo123 /= x123;
        mauSo123 /= x123;
    }
}
