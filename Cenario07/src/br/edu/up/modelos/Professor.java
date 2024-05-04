package modelos;

public class Professor extends Pessoa07 {
    private String idcLattes;
    private Curriculo curriculo;

    public String getIdcLattes() {
        return this.idcLattes;
    }

    public void setIdcLattes(String idcLattes) {
        this.idcLattes = idcLattes;
    }

    public Curriculo getCurriculo() {
        return this.curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
}
