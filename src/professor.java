public class professor  extends pessoa{
    private double qntHoras,valorHora,salario;
    public void calcSalario() {
        salario = valorHora * qntHoras;
    }

    public double getQntHoras() {
        return qntHoras;
    }

    public void setQntHoras(double qntHoras) {
        this.qntHoras = qntHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
