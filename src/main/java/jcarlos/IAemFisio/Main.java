package jcarlos.IAemFisio;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        GenerateData gd = new GenerateData();
        Random rand = new Random();

        Paciente paciente = gd.gerarPaciente();
        int i = 0;
        while (i < 10)
        {
            System.out.println(rand.nextInt(0,2));
            i++;
        }

    }
}