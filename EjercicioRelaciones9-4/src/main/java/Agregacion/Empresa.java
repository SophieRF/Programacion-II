package Agregacion;
import java.util.ArrayList;
public class Empresa {
    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

    public Empresa(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
