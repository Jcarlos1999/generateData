package jcarlos.IAemFisio;

public class Diagnostico {
    private int idDiagnostico;
    private int idAnamnese;
    private int idExameFisico;
    private int idPaciente;
    private int anamneseResult;
    private int exameFisicoResult;
    private String diagnosticoFisioterapeutico;
    private String objetivos;
    private String planoDeTratamento;
    private String consideracoes;

    public Diagnostico(){

    }

    public Diagnostico(int idDiagnostico, int idAnamnese, int idExameFisico, int idPaciente, String diagnosticoFisioterapeutico, String objetivos, String planoDeTratamento, String consideracoes) {
        this.idDiagnostico = idDiagnostico;
        this.idAnamnese = idAnamnese;
        this.idExameFisico = idExameFisico;
        this.idPaciente = idPaciente;
        this.diagnosticoFisioterapeutico = diagnosticoFisioterapeutico;
        this.objetivos = objetivos;
        this.planoDeTratamento = planoDeTratamento;
        this.consideracoes = consideracoes;
    }

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }

    public int getIdExameFisico() {
        return idExameFisico;
    }

    public void setIdExameFisico(int idExameFisico) {
        this.idExameFisico = idExameFisico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDiagnosticoFisioterapeutico() {
        return diagnosticoFisioterapeutico;
    }

    public void setDiagnosticoFisioterapeutico(String diagnosticoFisioterapeutico) {
        this.diagnosticoFisioterapeutico = diagnosticoFisioterapeutico;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getPlanoDeTratamento() {
        return planoDeTratamento;
    }

    public void setPlanoDeTratamento(String planoDeTratamento) {
        this.planoDeTratamento = planoDeTratamento;
    }

    public String getConsideracoes() {
        return consideracoes;
    }

    public void setConsideracoes(String consideracoes) {
        this.consideracoes = consideracoes;
    }
}
