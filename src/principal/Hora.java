package principal;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora() {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void aumentarSegundos() {
        if (segundos + 1 >= 60) {
            aumentarMinutos();
            segundos=00;
        } else {
            segundos++;
        }

    }

    public void aumentarMinutos() {
        if (minutos + 1 >= 60) {
            aumentarHoras();
            minutos=00;
        } else {
            minutos++;
        }

    }
    public void aumentarHoras(){
        if (hora + 1 >= 24){
            hora=00;
        } else{
            hora++;
        }

    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public String toString(){
        return "Son las  " + getHora() +":" + getMinutos() + ":" + getSegundos() ;
    }

}
