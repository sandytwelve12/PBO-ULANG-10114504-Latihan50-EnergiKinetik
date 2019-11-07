/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Menampilkan Program tentang menghasilkan energi kinetik dan usaha
 */
public class PBOULANG10114504Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Energi Kinetik====");
        EnergiKinetik eK = new EnergiKinetik();
        eK.setMassa(145);
        eK.setKecepatan(25);
        System.out.println("Massa = "+eK.getMassa()+" g");
        System.out.println("Kecepatan = "+eK.getKecepatan()+" m/s");
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Energi Kinetik = "+df.format(eK.energiKinetik
        (eK.getMassa(),eK.getKecepatan()))+" joule");
        System.out.println("Usaha = "+df.format(eK.usaha
        (eK.getMassa(),eK.getKecepatan()))+" joule");
    }
    
    
}
