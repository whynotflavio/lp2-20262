package lab2;

public class Descanso {
    private int horasDecanso;
    private int numeroSemanas;

    public Descanso(horasDescanso, numeroSemanas){
        this.horasDescanso = 0;
        this.numeroSemanas = 0;

    }


    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "cansado";
        }
        if((horasDescanso / numeroSemanas) >= 26) {
            return "descansado";
        }
        return "cansado";
    }













}
