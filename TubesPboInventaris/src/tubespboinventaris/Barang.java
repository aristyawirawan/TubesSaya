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
public class Barang {
    public String namaBrg,jenisBrg;
    public int idBrg,jml,harga;

    public Barang(int idBrg, String namaBrg, String jenisBrg, int jml, int harga) {
        this.idBrg = idBrg;
        this.namaBrg = namaBrg;
        this.jenisBrg = jenisBrg;
        this.jml = jml;
        this.harga = harga;
    }

    public Barang(int idBrg) {
        this.idBrg = idBrg;
    }
     
    public int getIdBrg() {
        return idBrg;
    }

    public void setIdBrg(int idBrg) {
        this.idBrg = idBrg;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public String getJenisBrg() {
        return jenisBrg;
    }

    public void setJenisBrg(String jenisBrg) {
        this.jenisBrg = jenisBrg;
    }

    public int getJml() {
        return jml;
    }

    public void setJml(int jml) {
        this.jml = jml;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
     
     
}
