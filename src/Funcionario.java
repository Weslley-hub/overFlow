//Herança

public class Funcionario extends Pessoa {

    private double wage;

    public Funcionario(String name, int age, double wage) {
        super(name, age);
        this.wage = wage;

        }

    public double getWage() {
        return wage;
    }
        
}