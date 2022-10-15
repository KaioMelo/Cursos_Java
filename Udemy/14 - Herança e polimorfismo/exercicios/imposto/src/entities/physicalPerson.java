package entities;

public class physicalPerson extends TaxPayer {

    private Double health;

    public physicalPerson(){
        super();
    }

    public physicalPerson(String name, Double anualIncome, Double health) {
        super(name, anualIncome);
        this.health = health;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    @Override
    public Double tax(){
        if (getAnualIncome() >= 20000.00){
            return (getAnualIncome() * 0.25) - (health * 0.50);
        }else{
            return (getAnualIncome() * 0.15) - (health * 0.50);
        }
    }
}
