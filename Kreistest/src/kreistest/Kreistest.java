package kreistest;

import javax.swing.JOptionPane;

/**
 *
 * @author Nils
 */
public class Kreistest {

   
    public static void main(String[] args) {
       
        Kreis r = new Kreis(); // Konstruktor muss Namen der Klasse entsprechen!
        r.setze();
        
        double radius, umfang, flaeche;     // definieren der Variablen zum speichern der Werte 
        String eingabe, einheit;            // Variable --> Tastatureingabe des Anwenders übernehmen
        eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Kreisradius ein: "); // ein Eingabefesnter wird so angezeigt
        radius = Double.parseDouble(eingabe);   // Umwandlung von String in Zahlenwert
        eingabe = JOptionPane.showInputDialog("Bitte geben Sie die gewünschte Einheit ein: ");
        einheit = eingabe;
        
        umfang = 2.0 * Math.PI * radius;        //Berechnung
        flaeche = Math.PI * radius * radius;
        
        System.out.println ("Umfang: " + umfang + einheit);     //Ausgabe
        System.out.println("Fläche: " + flaeche +einheit); 
        
      
    }
    
}
