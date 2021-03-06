package File;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;
import java.io.*;     // File-klassen
import java.util.*;   // Scanner-klassen

public class VisLinjeNr {

  public static void main(String[] args) throws Exception {
    String filnavn = showInputDialog("Filnavn:");
    File fil = new File(filnavn);
    Scanner leser = new Scanner(fil);

    int linjeNr = 1;
    String linje;
    while ( leser.hasNextLine() ) {
      linje = leser.nextLine();
      out.println(linjeNr + ": " + linje);
      linjeNr++;
    }

    leser.close();
  }

}