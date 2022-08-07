package entities;

public class PessoaJuridica extends Contribuinte{
    private int quantidadeFuncionarios;

    public PessoaJuridica() {
       super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    @Override
    public final Double Imposto() {
        if(quantidadeFuncionarios < 10){
            return rendaAnual * 16 / 100;
        }
        else{
            return rendaAnual * 14 / 100;
        }
    }
}