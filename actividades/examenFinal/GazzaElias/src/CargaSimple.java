public class CargaSimple extends Carga {

    // ATRIBUTOS
    private double pesoDeCarga;
    private boolean refrigerada;

    // METODOS
    @Override
    public double calcularPeso() {
        double pesoTotal = this.pesoDeCarga;
        if (refrigerada) {
            pesoTotal += 2;
        }
        return pesoTotal;
    }
    @Override
    public String toString() {
        return this.getNombre() +", peso: "+ this.calcularPeso() + "kg";
    }

    // GETTERS & SETTERS
    public double getPesoDeCarga() {
        return this.pesoDeCarga;
    }
    public void setPesoDeCarga(double pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }
    public boolean isRefrigerada() {
        return this.refrigerada;
    }
    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }
}
