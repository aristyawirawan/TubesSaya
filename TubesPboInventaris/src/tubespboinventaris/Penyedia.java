/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespboinventaris;

/**
 *
 * @author aris
 */
public class Penyedia extends Orang{
    private Barang[] daftarBarang;
    private int index=0;

    public Penyedia(Barang[] daftarBarang, String nama, int nip) {
        super(nama, nip);
        this.daftarBarang = daftarBarang;
    }
    
    public void createBarang(Barang[] b){
        
        if (index!=0){
            index++;
        }
        b=new Barang[index];
        
    }
    public Barang[] getBarangByIndex(){
        return daftarBarang[index];
    }
    public void deleteBarang(Barang[] b){
        b[index].delete();
    }
}
