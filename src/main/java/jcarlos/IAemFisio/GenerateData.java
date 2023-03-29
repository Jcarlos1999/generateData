package jcarlos.IAemFisio;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class GenerateData {

    Faker faker = new Faker(new Locale("pt-BR"));
    Random rand = new Random();

    String[] lista ={"Dificuldade para caminhar", "tremores", "movimentos não intencionais"};

    public Paciente gerarPaciente(){
        Paciente paciente = new Paciente();

        paciente.setPrimeiroNome(faker.name().firstName());
        paciente.setSobrenome(faker.name().lastName());

        return paciente;
    }

    public Anamnese gerarAnamnese(){
        Anamnese anamnese = new Anamnese();

        anamnese.setQueixaPrincipal(lista[rand.nextInt(0, lista.length)]);
        anamnese.setSenteDor(rand.nextInt(0,2));
        anamnese.setMedicamentoParaDor(rand.nextInt(0,2));
        if(anamnese.getMedicamentoParaDor() == 1){
            anamnese.setQuaisMedicamentos("...");
        }
        anamnese.setEvolucao(rand.nextInt(0,2));
        if (anamnese.getEvolucao() == 1) {
            anamnese.setQuantoEvoluiu(rand.nextInt(1,11));
        }
        anamnese.setFatorParaMelhora(rand.nextInt(0,2));
        if (anamnese.getFatorParaMelhora() == 1){
            anamnese.setFatoresMelhora("...");
        }
        anamnese.setFatorParaPiora(rand.nextInt(0,2));
        if(anamnese.getFatorParaPiora() == 1){
            anamnese.setFatoresPiora("...");
        }
        anamnese.setJaOcorreuAntes(rand.nextInt(0,2));
        anamnese.setDoencaCronica(rand.nextInt(0,2));
        if(anamnese.getDoencaCronica() == 1){
            anamnese.setQualSeveridade(rand.nextInt(1,11));
        }
        anamnese.setDoencasPrevias(rand.nextInt(0,2));
        if(anamnese.getDoencasPrevias() == 1){
            anamnese.setQuaisDoencasPrevias("...");
        }
        anamnese.setDoencasFamiliares(rand.nextInt(0,2));
        if(anamnese.getDoencasFamiliares() == 1){
            anamnese.setQuaisDoencasFamiliares("...");
        }
        anamnese.setMedicamentoParaDor(rand.nextInt(0,2));
        if(anamnese.getMedicamentoParaDor() == 1){
            anamnese.setQuaisMedicamentos("...");
        }
        anamnese.setTraumatismos(rand.nextInt(0,2));
        if(anamnese.getTraumatismos() == 1){
            anamnese.setQuaisTraumatismos("...");
        }
        anamnese.setCirurgias(rand.nextInt(0,2));
        if(anamnese.getCirurgias() == 1){
            anamnese.setQuaisCirurgias("...");
        }
        anamnese.setAlergia(rand.nextInt(0,2));
        if(anamnese.getAlergia() == 1){
            anamnese.setQuaisAlergias("...");
        }
        anamnese.setUsoDeAlcool(rand.nextInt(0,2));
        if(anamnese.getUsoDeAlcool() == 1){
            anamnese.setFrequenciaDeUsoDeAlcool(rand.nextInt(1,11));
        }
        anamnese.setFumante(rand.nextInt(0,2));
        if(anamnese.getFumante() == 1){
            anamnese.setFrequenciaDeUsoDeCigarro(rand.nextInt(1,11));
        }
        anamnese.setUsoDeToxicos(rand.nextInt(0,2));
        anamnese.setHobby(rand.nextInt(0,2));
        if(anamnese.getHobby() == 1){
            anamnese.setQuaisHobby("...");
        }

        return anamnese;
    }

    public ExameFisico gerarExameFisico(){
        ExameFisico exameFisico = new ExameFisico();

        exameFisico.setExameFisico("...");
        exameFisico.setComoChegouAoSetor(rand.nextInt(1,11));
        exameFisico.setEstadoGeral(rand.nextInt(1,11));
        exameFisico.setSinaisVitais(rand.nextInt(1,11));
        exameFisico.setCognicao(rand.nextInt(1,11));
        exameFisico.setSistemaSensorial(rand.nextInt(1,11));
        exameFisico.setMotricidadeReflexa(rand.nextInt(1,11));
        exameFisico.setTonusMuscular(rand.nextInt(1,11));
        exameFisico.setSeEspacidadeQualGrau(rand.nextInt(1,11));
        exameFisico.setAmplitudeDeMovimento(rand.nextInt(1,11));
        exameFisico.setForcaMuscular(rand.nextInt(1,11));
        exameFisico.setMarcha(rand.nextInt(1,11));

        return exameFisico;
    }

    public Diagnostico gerarDiagnostico(){
        Diagnostico diagnostico = new Diagnostico();

        diagnostico.setDiagnosticoFisioterapeutico("...");
        diagnostico.setObjetivos("...");
        diagnostico.setPlanoDeTratamento("...");
        diagnostico.setConsideracoes("...");

        return diagnostico;
    }

}
