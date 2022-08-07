package entities;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public final Double Imposto() {
        boolean gastoSaude = gastosSaude > 0 ? true : false;
        Double resultado = 0d;
        
        if(rendaAnual < 20000){
            resultado = rendaAnual * 15 / 100;
        }
        else{
            resultado = rendaAnual * 25 / 100;
        }

        if (gastoSaude){
            resultado -= gastosSaude * 50 / 100;
        }
        return resultado;
    }
}