package clase11;

public class Cliente {

    // ATRIBUTOS
    private int numero;
    private String apellido;
    private int dni;
    private String cuit;
    private Cuenta[] cuentas;

    // CONSTRUCTOR

    public Cliente(int numero, String apellido, int dni, String cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.cuentas = new Cuenta[2];
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Getters
    public int getNumero() {
        return numero;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDni() {
        return dni;
    }
    public String getCuit() {
        return cuit;
    };

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public void setCuentas(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuentas[0] = cuenta1;
        this.cuentas[1] = cuenta2;
    }
}
