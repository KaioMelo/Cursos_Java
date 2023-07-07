package application;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Teresa"};

        System.out.println("---------for---------");
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("-------forEach--------");
        for(String obj: vect){
            System.out.println(obj);
        }
    }
}
