package jcarlos.IAemFisio;

public class Anamnese {
        private int idAnamnese;
        private String queixaPrincipal;
        private int senteDor;
        private int medicamentoParaDor;
        private int evolucao;
        private int quantoEvoluiu;
        private int fatorParaMelhora;
        private String fatoresMelhora;
        private int fatorParaPiora;
        private String fatoresPiora;
        private int jaOcorreuAntes;
        private int doencaCronica;
        private int qualSeveridade;
        private int doencasPrevias;
        private String quaisDoencasPrevias;
        private int doencasFamiliares;
        private String quaisDoencasFamiliares;
        private int medicacaoContinua;
        private String quaisMedicamentos;
        private int dignosticoPrevio;
        private String quaisDiagnosticos;
        private int traumatismos;
        private String quaisTraumatismos;
        private int cirurgias;
        private String quaisCirurgias;
        private int alergia;
        private String quaisAlergias;
        private int usoDeAlcool;
        private int frequenciaDeUsoDeAlcool;
        private int fumante;
        private int frequenciaDeUsoDeCigarro;
        private int usoDeToxicos;
        private int hobby;
        private String quaisHobby;

        public Anamnese(){

        }

        public Anamnese(String queixaPrincipal, int senteDor, int medicamentoParaDor, int evolucao,
                        int quantoEvoluiu, int fatorParaMelhora, String fatoresMelhora, int fatorParaPiora,
                        String fatoresPiora, int jaOcorreuAntes, int doencaCronica, int qualSeveridade,
                        int doencasPrevias, String quaisDoencasPrevias, int doencasFamiliares,
                        String quaisDoencasFamiliares, int medicacaoContinua, String quaisMedicamentos,
                        int dignosticoPrevio, String quaisDiagnosticos, int traumatismos,
                        String quaisTraumatismos, int cirurgias, String quaisCirurgias, int alergia,
                        String quaisAlergias, int usoDeAlcool, int frequenciaDeUsoDeAlcool, int fumante,
                        int frequenciaDeUsoDeCigarro, int usoDeToxicos, int hobby, String quaisHobby) {
            this.queixaPrincipal = queixaPrincipal;
            this.senteDor = senteDor;
            this.medicamentoParaDor = medicamentoParaDor;
            this.evolucao = evolucao;
            this.quantoEvoluiu = quantoEvoluiu;
            this.fatorParaMelhora = fatorParaMelhora;
            this.fatoresMelhora = fatoresMelhora;
            this.fatorParaPiora = fatorParaPiora;
            this.fatoresPiora = fatoresPiora;
            this.jaOcorreuAntes = jaOcorreuAntes;
            this.doencaCronica = doencaCronica;
            this.qualSeveridade = qualSeveridade;
            this.doencasPrevias = doencasPrevias;
            this.quaisDoencasPrevias = quaisDoencasPrevias;
            this.doencasFamiliares = doencasFamiliares;
            this.quaisDoencasFamiliares = quaisDoencasFamiliares;
            this.medicacaoContinua = medicacaoContinua;
            this.quaisMedicamentos = quaisMedicamentos;
            this.dignosticoPrevio = dignosticoPrevio;
            this.quaisDiagnosticos = quaisDiagnosticos;
            this.traumatismos = traumatismos;
            this.quaisTraumatismos = quaisTraumatismos;
            this.cirurgias = cirurgias;
            this.quaisCirurgias = quaisCirurgias;
            this.alergia = alergia;
            this.quaisAlergias = quaisAlergias;
            this.usoDeAlcool = usoDeAlcool;
            this.frequenciaDeUsoDeAlcool = frequenciaDeUsoDeAlcool;
            this.fumante = fumante;
            this.frequenciaDeUsoDeCigarro = frequenciaDeUsoDeCigarro;
            this.usoDeToxicos = usoDeToxicos;
            this.hobby = hobby;
            this.quaisHobby = quaisHobby;
        }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public void setSenteDor(int senteDor) {
        this.senteDor = senteDor;
    }

    public void setMedicamentoParaDor(int medicamentoParaDor) {
        this.medicamentoParaDor = medicamentoParaDor;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public void setQuantoEvoluiu(int quantoEvoluiu) {
        this.quantoEvoluiu = quantoEvoluiu;
    }

    public void setFatorParaMelhora(int fatorParaMelhora) {
        this.fatorParaMelhora = fatorParaMelhora;
    }

    public void setFatoresMelhora(String fatoresMelhora) {
        this.fatoresMelhora = fatoresMelhora;
    }

    public void setFatorParaPiora(int fatorParaPiora) {
        this.fatorParaPiora = fatorParaPiora;
    }

    public void setFatoresPiora(String fatoresPiora) {
        this.fatoresPiora = fatoresPiora;
    }

    public void setJaOcorreuAntes(int jaOcorreuAntes) {
        this.jaOcorreuAntes = jaOcorreuAntes;
    }

    public void setDoencaCronica(int doencaCronica) {
        this.doencaCronica = doencaCronica;
    }

    public void setQualSeveridade(int qualSeveridade) {
        this.qualSeveridade = qualSeveridade;
    }

    public void setDoencasPrevias(int doencasPrevias) {
        this.doencasPrevias = doencasPrevias;
    }

    public void setQuaisDoencasPrevias(String quaisDoencasPrevias) {
        this.quaisDoencasPrevias = quaisDoencasPrevias;
    }

    public void setDoencasFamiliares(int doencasFamiliares) {
        this.doencasFamiliares = doencasFamiliares;
    }

    public void setQuaisDoencasFamiliares(String quaisDoencasFamiliares) {
        this.quaisDoencasFamiliares = quaisDoencasFamiliares;
    }

    public void setMedicacaoContinua(int medicacaoContinua) {
        this.medicacaoContinua = medicacaoContinua;
    }

    public void setQuaisMedicamentos(String quaisMedicamentos) {
        this.quaisMedicamentos = quaisMedicamentos;
    }

    public void setDignosticoPrevio(int dignosticoPrevio) {
        this.dignosticoPrevio = dignosticoPrevio;
    }

    public void setQuaisDiagnosticos(String quaisDiagnosticos) {
        this.quaisDiagnosticos = quaisDiagnosticos;
    }

    public void setTraumatismos(int traumatismos) {
        this.traumatismos = traumatismos;
    }

    public void setQuaisTraumatismos(String quaisTraumatismos) {
        this.quaisTraumatismos = quaisTraumatismos;
    }

    public void setCirurgias(int cirurgias) {
        this.cirurgias = cirurgias;
    }

    public void setQuaisCirurgias(String quaisCirurgias) {
        this.quaisCirurgias = quaisCirurgias;
    }

    public void setAlergia(int alergia) {
        this.alergia = alergia;
    }

    public void setQuaisAlergias(String quaisAlergias) {
        this.quaisAlergias = quaisAlergias;
    }

    public void setUsoDeAlcool(int usoDeAlcool) {
        this.usoDeAlcool = usoDeAlcool;
    }

    public void setFrequenciaDeUsoDeAlcool(int frequenciaDeUsoDeAlcool) {
        this.frequenciaDeUsoDeAlcool = frequenciaDeUsoDeAlcool;
    }

    public void setFumante(int fumante) {
        this.fumante = fumante;
    }

    public void setFrequenciaDeUsoDeCigarro(int frequenciaDeUsoDeCigarro) {
        this.frequenciaDeUsoDeCigarro = frequenciaDeUsoDeCigarro;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public int getSenteDor() {
        return senteDor;
    }

    public int getMedicamentoParaDor() {
        return medicamentoParaDor;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public int getQuantoEvoluiu() {
        return quantoEvoluiu;
    }

    public int getFatorParaMelhora() {
        return fatorParaMelhora;
    }

    public String getFatoresMelhora() {
        return fatoresMelhora;
    }

    public int getFatorParaPiora() {
        return fatorParaPiora;
    }

    public String getFatoresPiora() {
        return fatoresPiora;
    }

    public int getJaOcorreuAntes() {
        return jaOcorreuAntes;
    }

    public int getDoencaCronica() {
        return doencaCronica;
    }

    public int getQualSeveridade() {
        return qualSeveridade;
    }

    public int getDoencasPrevias() {
        return doencasPrevias;
    }

    public String getQuaisDoencasPrevias() {
        return quaisDoencasPrevias;
    }

    public int getDoencasFamiliares() {
        return doencasFamiliares;
    }

    public String getQuaisDoencasFamiliares() {
        return quaisDoencasFamiliares;
    }

    public int getMedicacaoContinua() {
        return medicacaoContinua;
    }

    public String getQuaisMedicamentos() {
        return quaisMedicamentos;
    }

    public int getDignosticoPrevio() {
        return dignosticoPrevio;
    }

    public String getQuaisDiagnosticos() {
        return quaisDiagnosticos;
    }

    public int getTraumatismos() {
        return traumatismos;
    }

    public String getQuaisTraumatismos() {
        return quaisTraumatismos;
    }

    public int getCirurgias() {
        return cirurgias;
    }

    public String getQuaisCirurgias() {
        return quaisCirurgias;
    }

    public int getAlergia() {
        return alergia;
    }

    public String getQuaisAlergias() {
        return quaisAlergias;
    }

    public int getUsoDeAlcool() {
        return usoDeAlcool;
    }

    public int getFrequenciaDeUsoDeAlcool() {
        return frequenciaDeUsoDeAlcool;
    }

    public int getFumante() {
        return fumante;
    }

    public int getFrequenciaDeUsoDeCigarro() {
        return frequenciaDeUsoDeCigarro;
    }

    public int getUsoDeToxicos() {
        return usoDeToxicos;
    }

    public int getHobby() {
        return hobby;
    }

    public String getQuaisHobby() {
        return quaisHobby;
    }

    public void setUsoDeToxicos(int usoDeToxicos) {
        this.usoDeToxicos = usoDeToxicos;
    }

    public void setHobby(int hobby) {
        this.hobby = hobby;
    }

    public void setQuaisHobby(String quaisHobby) {
        this.quaisHobby = quaisHobby;
    }
}

