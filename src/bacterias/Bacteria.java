package bacterias;

/**
 *
 * @author Brandon
 */
public class Bacteria {

    int id;
    int nivel;
    int estado;
    int tipo;
    int X;
    int Y;
    int parto;
    int horaDeNacimiento;

    public Bacteria() {
    }

    public Bacteria(int id, int nivel, int estado, int tipo, int X, int Y, int parto, int horaDeNacimiento) {
        this.id = id;
        this.nivel = nivel;
        this.estado = estado;
        this.tipo = tipo;
        this.X = X;
        this.Y = Y;
        this.parto = parto;
        this.horaDeNacimiento = horaDeNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getParto() {
        return parto;
    }

    public void setParto(int parto) {
        this.parto = parto;
    }

    public int getHoraDeNacimiento() {
        return horaDeNacimiento;
    }

    public void setHoraDeNacimiento(int horaDeNacimiento) {
        this.horaDeNacimiento = horaDeNacimiento;
    }
    
    

}
