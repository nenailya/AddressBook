package main;

import java.util.Objects;

public class Adress {
    private String ylitsa, nomerdoma, nomerkvartiry;
    Adress(String ylitsa, String nomerdoma, String nomerkvartiry) {
        this.ylitsa = ylitsa;
        this.nomerdoma = nomerdoma;
        this.nomerkvartiry = nomerkvartiry;
    }

    public String getNomerdoma() {
        return nomerdoma;
    }

    public String getYlitsa() {
        return ylitsa;
    }

    public String getNomerkvartiry() {
        return nomerkvartiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return ylitsa.equals(adress.ylitsa) &&
                nomerdoma.equals(adress.nomerdoma) &&
                nomerkvartiry.equals(adress.nomerkvartiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ylitsa, nomerdoma, nomerkvartiry);
    }
}
