package entities;

public class Student {
    public String name;
    public double not1, not2, not3;

    public double SemestreFinal(){
        return not1 + not2 + not3;
    }

    public double MediaFinal(){
        if (SemestreFinal() < 60.0){
            return 60.0 - SemestreFinal();
        }else{
            return 0.0;
        }
    }
}
