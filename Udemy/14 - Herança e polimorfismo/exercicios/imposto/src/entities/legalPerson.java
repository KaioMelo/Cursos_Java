package entities;

public class legalPerson extends TaxPayer {

    private Integer numberEmployee;

    public legalPerson(){
        super();
    }


    public legalPerson(String name, Double anualIncome, Integer numberEmployee) {
        super(name, anualIncome);
        this.numberEmployee = numberEmployee;
    }

    public Integer getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(Integer numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public Double tax() {
        if (numberEmployee > 10){
            return getAnualIncome() * 0.14;
        }else{
            return getAnualIncome() * 0.16;
        }
    }
}
