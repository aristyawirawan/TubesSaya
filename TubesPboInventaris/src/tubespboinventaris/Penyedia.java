/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespboinventaris;

import java.util.ArrayList;
/**
 *
 * @author aris
 */
public class Penyedia extends Orang{
    ArrayList<Barang> daftarBarang=new ArrayList<>();
    private int index;
    

    public Penyedia(String nama, String jenisBarang,int nip) {
        super(nama,jenisBarang, nip);
        
    }
   
    public void createBarang(int idBrg,String namaBrg, String jenisBrg, int jml, int harga){
        Barang brg=new Barang(idBrg,namaBrg,jenisBrg,jml,harga);
        daftarBarang.add(brg);
        
    }
    public Barang getBarangByIndex(){
        return daftarBarang.get(index);
    }
    
    public void deleteBarang(int idBrg){
        daftarBarang.remove(idBrg);
    }
}
