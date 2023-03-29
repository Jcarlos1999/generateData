package jcarlos.IAemFisio;

public class Paciente {
    private int idPaciente;
    private String primeiroNome;
    private String sobrenome;

    public Paciente(){

    }

    public Paciente(int idPaciente, String primeiroNome, String sobrenome) {
        this.idPaciente = idPaciente;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
