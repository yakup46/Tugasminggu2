package com.Ujian2batch8;

import java.util.Scanner;

public class pinjaman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int hutang1 = 20000000;
	     int lama = 15;
	     double hutang,bunga1,bunga,angsur,sisa,sisa1;
	     double angsur1,total=0,totbunga,bayar;
	     System.out.println();
	     System.out.println("       LAPORAN HITUNG ANGSURAN PEMINJAMAN");
	     System.out.println("PINJAMAN RP.20.000.000");
	     System.out.println("SELAMA 15 BULAN");
	     System.out.println("===================================================");
	     System.out.println();
	     for(int a=1;a<=lama;a++){
	     angsur=hutang1/lama;
	    sisa=hutang1-angsur*a;
	    bunga=hutang1/(sisa+angsur);
	    bunga1=bunga*1.2/100*hutang1; 
	    bayar=bunga1+angsur;
	    total+=bayar;
	    System.out.println("Bulan ke - "+a);
	    System.out.println("----------------------------");
	    System.out.printf("Suku bunga     = %.2f",bunga);
	    System.out.println(" persen");
	    System.out.printf("Besar bunga    = %.2f",bunga1);
	    System.out.println(" Rupiah");
	    System.out.printf("Bayar          = %.2f",bayar);
	    System.out.println(" Rupiah");
	    System.out.printf("Sisa Pinjaman  = %.2f",sisa);
	    System.out.println(" Rupiah");
	    System.out.println("----------------------------");
	     }
	    System.out.println("=============================================================================");
	    System.out.println("                                               Pinjaman awal   = "+hutang1+" Rupiah");
	    System.out.printf ("Total Pengembalian (pinjaman awa1+bunga dari bulan  1 - "+lama+"      = %.2f",total);
	    System.out.println(" Rupiah");
	    System.out.println();
	    }
//		angsuran();
//
//	}
//	static void angsuran() {
//		int pjm = 120000000;
//		double bungabln = 0.11/12;
//		int lamapjm = 10;
//		double anuit = 1-1+0.08333333+10;
		
		
		//double angsuranprbln = pjm*bungaprtahun/;
		
//		System.out.println("test pinjaman="+"Rp."+pjm*bungabln/anuit);
//	}
//    public static double calculatePMT(double rate, double nper, double pv) {
//        double v = (1 + (0.012 / 12));
//        double t = (-(nper / 12) * 12);
//        double result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
//        return result;
//    }
	
	

}
