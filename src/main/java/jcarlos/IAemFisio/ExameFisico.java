package jcarlos.IAemFisio;

public class ExameFisico {
    private int idExameFisico;
    private String exameFisico;
    private int comoChegouAoSetor;
    private int estadoGeral;
    private int sinaisVitais;
    private int cognicao;
    private int sistemaSensorial;
    private int motricidadeReflexa;
    private int tonusMuscular;
    private int seEspacidadeQualGrau;
    private int amplitudeDeMovimento;
    private int forcaMuscular;
    private int marcha;

    public ExameFisico(){

    }

    public ExameFisico(int idExameFisico, String exameFisico, int comoChegouAoSetor, int estadoGeral, int sinaisVitais, int cognicao, int sistemaSensorial, int motricidadeReflexa, int tonusMuscular, int seEspacidadeQualGrau, int amplitudeDeMovimento, int forcaMuscular, int marcha) {
        this.idExameFisico = idExameFisico;
        this.exameFisico = exameFisico;
        this.comoChegouAoSetor = comoChegouAoSetor;
        this.estadoGeral = estadoGeral;
        this.sinaisVitais = sinaisVitais;
        this.cognicao = cognicao;
        this.sistemaSensorial = sistemaSensorial;
        this.motricidadeReflexa = motricidadeReflexa;
        this.tonusMuscular = tonusMuscular;
        this.seEspacidadeQualGrau = seEspacidadeQualGrau;
        this.amplitudeDeMovimento = amplitudeDeMovimento;
        this.forcaMuscular = forcaMuscular;
        this.marcha = marcha;
    }

    public int getIdExameFisico() {
        return idExameFisico;
    }

    public void setIdExameFisico(int idExameFisico) {
        this.idExameFisico = idExameFisico;
    }

    public String getExameFisico() {
        return exameFisico;
    }

    public void setExameFisico(String exameFisico) {
        this.exameFisico = exameFisico;
    }

    public int getComoChegouAoSetor() {
        return comoChegouAoSetor;
    }

    public void setComoChegouAoSetor(int comoChegouAoSetor) {
        this.comoChegouAoSetor = comoChegouAoSetor;
    }

    public int isEstadoGeral() {
        return estadoGeral;
    }

    public void setEstadoGeral(int estadoGeral) {
        this.estadoGeral = estadoGeral;
    }

    public int getSinaisVitais() {
        return sinaisVitais;
    }

    public void setSinaisVitais(int sinaisVitais) {
        this.sinaisVitais = sinaisVitais;
    }

    public int getCognicao() {
        return cognicao;
    }

    public void setCognicao(int cognicao) {
        this.cognicao = cognicao;
    }

    public int getSistemaSensorial() {
        return sistemaSensorial;
    }

    public void setSistemaSensorial(int sistemaSensorial) {
        this.sistemaSensorial = sistemaSensorial;
    }

    public int getMotricidadeReflexa() {
        return motricidadeReflexa;
    }

    public void setMotricidadeReflexa(int motricidadeReflexa) {
        this.motricidadeReflexa = motricidadeReflexa;
    }

    public int getTonusMuscular() {
        return tonusMuscular;
    }

    public void setTonusMuscular(int tonusMuscular) {
        this.tonusMuscular = tonusMuscular;
    }

    public int getSeEspacidadeQualGrau() {
        return seEspacidadeQualGrau;
    }

    public void setSeEspacidadeQualGrau(int seEspacidadeQualGrau) {
        this.seEspacidadeQualGrau = seEspacidadeQualGrau;
    }

    public int getAmplitudeDeMovimento() {
        return amplitudeDeMovimento;
    }

    public void setAmplitudeDeMovimento(int amplitudeDeMovimento) {
        this.amplitudeDeMovimento = amplitudeDeMovimento;
    }

    public int getForcaMuscular() {
        return forcaMuscular;
    }

    public void setForcaMuscular(int forcaMuscular) {
        this.forcaMuscular = forcaMuscular;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
