/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefonocellulare;

/**
 *
 * @author moham
 */
public class TelefonoCellulare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public class TelefonoCellulare {
    private String marca;
    private String modello;
    private double prezzo;

    public TelefonoCellulare(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String toString() {
        return "Marca: " + marca + ", Modello: " + modello + ", Prezzo: €" + prezzo;
    }
}
