public class VvodExeption extends Exception{

    private char simb;
    public VvodExeption(char simb){
        this.simb = simb;

    }
    public VvodExeption(String message, char simb){
        super(message);
        this.simb = simb;
    }
    public char getSimbol(){
        return simb;
    }
}