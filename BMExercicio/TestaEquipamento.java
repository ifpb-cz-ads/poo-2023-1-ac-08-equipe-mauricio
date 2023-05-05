package BMExercicio;

public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento();

        equipamento.setFabricante("Samsumg");
        equipamento.setModelo("Notebook");

        Computador computador = new Computador();
        computador.setFabricante("Samsumg");
        computador.setModelo("Notebook");
        computador.setMarcaPlacaDeVideo("NVidia");
        computador.setMarcaProcessador("Intel");

        System.out.println("Equipamento: " + equipamento.toString());
        System.out.println("Computador: " + computador.toString());
    }
}
