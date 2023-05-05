package BMExercicio;

public class Computador extends Equipamento{
    private String marcaProcessador;
    private String marcaPlacaDeVideo;

    public String getMarcaProcessador() {
        return marcaProcessador;
    }

    public void setMarcaProcessador(String marcaProcessador) {
        this.marcaProcessador = marcaProcessador;
    }

    public String getMarcaPlacaDeVideo() {
        return marcaPlacaDeVideo;
    }

    public void setMarcaPlacaDeVideo(String marcaPlacaDeVideo) {
        this.marcaPlacaDeVideo = marcaPlacaDeVideo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n[ Placa de Vídeo: " +
                marcaPlacaDeVideo +
                ", Processador: " +
                marcaProcessador +
                " ]";
    }
}
