package BMExercicio;

public class Equipamento {

    private String fabricante;
    private String modelo;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String toString() {
        return fabricante +
                " - " +
                modelo;
    }
}
