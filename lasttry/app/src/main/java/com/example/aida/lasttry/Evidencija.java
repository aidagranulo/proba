package com.example.aida.lasttry;

import java.util.Date;

/**
 * Created by Aida on 2.6.2015.
 */
public class Evidencija {
    private String naziv;
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String Naziv) {
        naziv = Naziv;
    }


    private String autor;
    public String getAutor() {
        return autor;
    }
    public void setAutor(String Autor) {
        autor = Autor;
    }

    private String isbn;
    public String getISBN() {
        return isbn;
    }
    public void setISBN(String Isbn) {
        isbn =Isbn;
    }

    private String opis;
    public String getOpis() {
        return opis;
    }
    public void setOpis(String Opis) {
        opis =Opis;
    }

    private Integer brStranica;
    public Integer getBrStranica() {
        return brStranica;
    }
    public void setBrStranica(Integer BrStranica) {
        brStranica =BrStranica;
    }

    private Date datum;
    public Date getDatum() {
        return datum;
    }
    public void setDatum(Date Datum) {
        datum =Datum;
    }


    public Evidencija () {}


    public Evidencija (String naziv, String autor, String ISBN, String opis, Integer brojStranica,Date datum)
    {
        this.setNaziv(naziv);
        this.setAutor(autor);
        this.setISBN(ISBN);
        this.setOpis(opis);
        this.setBrStranica(brojStranica);
        this.setDatum(datum);
    }


}
