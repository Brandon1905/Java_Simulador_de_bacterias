package bacterias;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon
 */
public class Hilo {

}

class HILO implements Runnable {

    int contador;

    public HILO() {
    }

    public HILO(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
    public void envio_al_servidor(String dato) throws InterruptedException {

        final String host = "127.0.0.1";

        final int puente = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            try (Socket sc = new Socket(host, puente)) {
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                out.writeUTF(dato);

                //String mensaje = in.readUTF();
                //System.out.println("Mensaje del servidor ->" + mensaje);
                //Mensaje1.setText(mensaje);
            }

        } catch (IOException ex) {
            Logger.getLogger(Bacteria.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //Thread.sleep(1000);
    }

    @Override
    public void run() {
        while (true) {
            contador++;
            //System.out.println("segundos" + contador);

            String dato = contador + "";
            
            try {
                envio_al_servidor(dato);
            } catch (InterruptedException ex) {
                Logger.getLogger(HILO.class.getName()).log(Level.SEVERE, null, ex);
            }

            //JOptionPane.showMessageDialog(null, "segundos" + contador, "tiempo", JOptionPane.INFORMATION_MESSAGE);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HILO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
