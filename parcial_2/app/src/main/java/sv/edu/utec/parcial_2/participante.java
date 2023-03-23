package sv.edu.utec.parcial_2;

public class participante {
    int img;
    String nombre;
    String cargo;
    String company;
    public participante(int imagen, String nombre, String cargo, String company) {
        this.img = imagen;
        this.nombre = nombre;
        this.cargo = cargo;
        this.company = company;
    }
    public int getImagen() {
        return img;
    }
    public void setImagen(int imagen) {
        this.img = imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
}
