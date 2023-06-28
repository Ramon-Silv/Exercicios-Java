package festaAniversario;

abstract class festaAniversario {
    private String aniversariante;
    private int idade;
    private String local;
    private String dia;
    private String horario;

    public String getNomeAniversariante() {
        return aniversariante;
    }

    public void setNomeAniversariante(String aniversariante) {
        this.aniversariante = aniversariante;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String Dia) {
        this.dia = Dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    public void status() {
        System.out.println("Convite para festa de Aniversário:");
        System.out.println("Nome do Aniversariante: " + getNomeAniversariante());
        System.out.println("Idade: " + getIdade());
        System.out.println("Onde? " + getLocal());
        System.out.println("Dia: " + getDia());
        System.out.println("Horário" + getHorario());
    }    
}