
package clases;

import java.io.*;
import java.util.HashMap;

public class archivos {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vitor\\Downloads\\eaa\\codigos_postales_hmo"));
            String renglon;
            HashMap<String, Integer> veces = new HashMap<>();

            while ((renglon = br.readLine()) != null) {

                String[] code = renglon.split("\t");

                if (code.length > 0) {
                    String inicio = code[0];
                    veces.put(inicio, veces.getOrDefault(inicio, 0) + 1);
                }
            } //end while

            br.close();

            for (String CP : veces.keySet()) {
                int vez = veces.get(CP);
                System.out.println("CP:" + CP + " Veces que se repitió: " + vez);
            } // end for

        } catch (IOException e) {
            e.printStackTrace();
        }
    } //end main
}
